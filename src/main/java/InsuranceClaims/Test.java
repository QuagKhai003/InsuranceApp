package InsuranceClaims;

import Database.DatabaseConfig;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Entity
@Table (name = "test")
public class Test implements Serializable {
    @Id
    @Column(name = "id")
    private String id;
    @Column(name = "note")
    private String note;

    public Test () {
        this.id = "";
        this.note = "";
    }

    public Test(String id, String note) {
        this.id = id;
        this.note = note;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "Test{" +
                "id='" + id + '\'' +
                ", note='" + note + '\'' +
                '}';
    }

    public static void createSample() {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
        Query q = entityManager.createNativeQuery("SELECT * FROM test");

        List<Test> testResult = q.getResultList();

        System.out.println(testResult);

        if (testResult.size() == 0) {
            Test newTest1 = new Test();
            newTest1.setId("1");
            newTest1.setNote("test1");
            entityManager.persist(newTest1);
//            Test newTest2 = new Test("2", "test2");
//            Test newTest3 = new Test("3", "test3");

//            testResult.add(newTest2);
//            testResult.add(newTest3);
        }
        entityManager.getTransaction().commit();

        entityManager.getTransaction().begin();

        for (Test t: testResult) {
            System.out.println(t);
        }

        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();

        System.out.println("Persistence app is finished");
    }

    public static void main(String[] args) {
        DatabaseConfig.connection();
        createSample();
    }
}
