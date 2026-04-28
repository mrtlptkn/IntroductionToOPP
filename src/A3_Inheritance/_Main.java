package A3_Inheritance;

public class _Main {

    public static void main(String[] args) {

        // Not: katılım ortak alanlar üzerinden bizim belirli bir kod standartına uymamızı sağlar. Örneğin, tüm kişilerin bir isim, soyisim ve vatandaşlık numarası olması gerektiği gibi. Bu sayede, bu ortak alanları kullanarak kodumuzu daha düzenli ve anlaşılır hale getirebiliriz.


        Employee employee = new Employee();
        employee.setFirstName("Ahmet");
        employee.setMiddleName("Can");
        employee.setLastName("Yılmaz");
        employee.setCitizenNumber("12345678910");
        employee.setDepartment("IT");
        employee.setSocialIdentificationNumber("123456");

        Customer customer = new Customer();
        customer.setFirstName("Mehmet");
        customer.setMiddleName("Ali");
        customer.setLastName("Yılmaz");
        customer.setCitizenNumber("12345678910");
        customer.setAddress("Ankara");
        customer.setPhoneNumber("5555555555");


    }
}
