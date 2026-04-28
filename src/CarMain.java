import java.util.ArrayList;

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


//        Car car6;
//        car6.setModel("Fiesta");
//        car6.setBrand("Ford");
        // variable car6 might not have been initialized
        // Nesneyi new keyword ile initialize etmek zorundayız. yoksa yukarıdaki istisnai duruma düşeriz


        // car7 referans ise @324324
        Car car7 = new Car("Benzin","Polo Life","Volkswagen");
        // car7 referans ise @324324 aynı referansı gösterir.
        car7.setModel("Golf R");

        // Car8 de car7'nin referansını kullanır
        // aşağıdaki yazım tehlikeli bir yazımdır. Böyle bir kod yazmamamız gerekir.
        Car car8 = car7;
        car7.setEngineType("Dizel");

        System.out.println("car7 equals to car8 -> " + car7.equals(car8)); // true


        int a = 5;
        int y = a;
        y = 10;

        // Referans type değerler, heap üzerindeki referansa bakarlar. Aynı referansı kullanırlarsa bir değiştiğinde diğerininde değerleri değişir. Ama value typeda böyle bir durum yoktur.
        // value type değerler stack üzerinde sıralı bir şekilde yürütülür.

        // Stackoverflow -> aşılması için çok falza method içerisinde değişken anlık olarak tüketilmelidir.


        // Javada bütün değişkenler object olarak yazılabilir. Aslında herşey Object sınıfından türer.
        // aşağıda ise bunun kanıtını yapalım

        Object o = "Hande";
        Object op=5;
        Object ff = true;
        Object cc = 5.5;
        Object rr = 5.2f;
        Object cgh = 'a';

        // Bir Object 3 farklı methoda sahip
        // 1. equals -> 2 farklı nesnenin yanı referansa bakıp bakmadığını kontrol ederiz.
        // 2. hashCode -> nesnenin DNA, her nesne kendisine ait bir hascode ile üretilir. Her doğan kişinin vatandaşlık nosu gibi bir değer.
        // 3. toString -> default ramdaki referansını yazdı.

        System.out.println("car1" + car1.hashCode() + " car2 : " + car2.hashCode());
        System.out.println("car1 is equal to car2 references" + car1.equals(car2));
        System.out.println("car1 toString" + car1.toString());


        // upcasting
        // bu bu şekilde tabiki kullanmak performans açısından çok kötü olurdu. O yüzden java bize wrapper classları verdi. int için Integer, boolean için Boolean gibi.

        // Java wrapper types -> primitive type değerleri object olarak kullanmamızı sağlar. Böylece primitive type değerleride object gibi davranır.
        // Performans açısından primitive type değerler daha hızlı çalışır. O yüzden mümkün olduğunca primitive type değerler kullanmamız gerekir. Mümkün gerekmedikçe primative tipleri kullan ama ihtiyacın varsa wrapper typedan da yararlanabilirsin
        // dün anlttığımız tüm tipler wrapper type olarak yazılabilir.
        Integer ii = 5;
        byte bv= ii.byteValue();
        int result = Integer.compare(5,10);
        // ArrayList<int> numbers = new ArrayList<>();
        // Özel durum ArrayList collection ile çalışırkenm wrapper type kullanmamız lazım.
        // ArrayList<Integer> numbers2 = new ArrayList<>();
        int h = 4;

    }
}
