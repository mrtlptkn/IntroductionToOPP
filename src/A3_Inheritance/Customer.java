package A3_Inheritance;

// Not: private özellikleri kalıtım yolu ile taşıyamayız


public class Customer extends  Person{

    public Customer() {
    }

    public Customer(String firstName, String middleName, String lastName) {
        super(firstName, middleName, lastName);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    private String address;
    private String phoneNumber;

}
