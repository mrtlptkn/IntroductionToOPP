package A3_Inheritance;

// Bu sınıflarda sadece employee ait özelliklere odaklanırız.


public class Employee extends Person {

    public Employee() {
    }

    public Employee(String firstName, String middleName, String lastName) {
        super(firstName, middleName, lastName);
    }

    public String getSocialIdentificationNumber() {
        return socialIdentificationNumber;
    }

    public void setSocialIdentificationNumber(String socialIdentificationNumber) {
        this.socialIdentificationNumber = socialIdentificationNumber;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    private String socialIdentificationNumber; // sicil No
    private String department; // departman

}
