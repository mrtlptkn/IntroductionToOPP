public class CarMain {

    public static void main(String[] args) {

        // javada default olarak 1 adet boş constructor vardır. Car() constructorı gibi.
        // isteğe göre birden fazla farklı nesne initialize tanımı yapılabilir.
        Car car1 = new Car();
        car1.setBrand("BMW");
        car1.setModel("X5");
        car1.setEngineType("Dizel");
        car1.start();

        Car car2 = new Car();
        car2.setBrand("Mercedes");
        car2.setModel("C200");
        car2.setEngineType("Benzin");
        car2.start();

        // newleme işlemi türkçesi nesne türetme (instance creation)
        // işlemi yapar. newleme işlemi ile ramde bir alan açılır ve o alana Car nesnesi yerleştirilir.
        Car car3 = new Car();
        car3.setBrand("Audi");
        car3.setModel("e-A4");
        car3.setEngineType("Elektrik");
        car3.start();

        Car car4 = new Car();
        car4.setBrand("Audi");
        car4.setModel("A4 TSI");
        car4.setEngineType("Dizel");
        car4.start();


        Car car5  = new Car("Elektrik","Panda","Fiat");
        car5.start();


        // Not: Bütün arabaları ilgilendiren genel davranışlar var ise,
        // bu davranışları Car classında tanımlayarak bütün arabaların bu davranışa sahip olmasını sağlarız.
        car1.stop();
        car2.stop();

        // nesneler ram tutulan yaşayan yapılar.
        // Class yani sınıf ise, nesnenin metadata model,brand,engineType şablonunu oluşturmamız sağlar.
        // Not: Class ile Nesne (Object) aynı şey değildir.

        // otogalerim var
        Car[] cars = new Car[5];
        cars[0] = car1;
        cars[1]=car2;
        cars[2] = car3;
        cars[3]=car4;
        cars[4]=car5;

        for (int i = 0; i < cars.length; i++) {
            System.out.println("Marka: " + cars[i].getBrand() + " Model: " + cars[i].getModel() + " Motor Tipi: " + cars[i].getEngineType());
            System.out.println("Araba çalışıyor Mu :" + (cars[i].isStarted() ? "Çalışıyor":"Durmuş"));
        }



        // Dizi ramde verinin tutulduğu hızlı okunup yazıldığı bölgedir. Ama veriler kalıcı değildir.

        // Verileri daha sonra programı kapatıp açtıktan sonra bile erişilebilir olması için diske kaydetmemiz
        // lazım -> Database (Car Table, brand,engineType,model)

        // Veri Kaydetme aşaması: Car Class -> (Car Array) -> RAM -> DatabaseService (Class) -> DB as Table
        // Verinin Çekilme aşaması: READ Table -> Car Class (RAM) -> Car Array -> Show Terminal or Screen.




    }
}
