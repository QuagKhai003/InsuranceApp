package InsuranceClaims;

public class Claim {
    private String fID;

    private String insurePerson;
    private String status;

    public Claim(String fID, String insurePerson, String status) {
        this.fID = fID;
        this.insurePerson = insurePerson;
        this.status = status;
    }

    public String getFID() {
        return fID;
    }

    public void setFID(String fID) {
        this.fID = fID;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Claim{" +
                "fID='" + fID + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
