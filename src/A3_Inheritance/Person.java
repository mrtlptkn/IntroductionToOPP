package A3_Inheritance;

// super class
public class Person {

    private String firstName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCitizenNumber() {
        return CitizenNumber;
    }

    public void setCitizenNumber(String citizenNumber) {
        CitizenNumber = citizenNumber;
    }

    private String middleName;
    private String lastName;
    private String CitizenNumber;

}
