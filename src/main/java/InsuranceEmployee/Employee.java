package InsuranceEmployee;

public class Employee {
    private String eID;
    private String fullName;
    private String phone;
    private String address;

    public Employee() {
        this.eID = "Default";
        this.fullName = "Default";
        this.phone = "Default";
        this.address = "Default";
    }

    public Employee(String eID, String fullName, String phone, String address) {
        this.eID = eID;
        this.fullName = fullName;
        this.phone = phone;
        this.address = address;
    }

    public String getEID() {
        return eID;
    }

    public void setEID(String eID) {
        this.eID = eID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eID='" + eID + '\'' +
                ", fullName='" + fullName + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
