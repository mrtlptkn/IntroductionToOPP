package A1_ClassesAndobjects;

// Javada her class bir Object'den türediği için

public class Car {

    // private olduklları için field dedik
    // field private tanımlanır class özeldir
    private String engineType; // elektrik, benzin, dizel
    private String model; // model
    private String brand; // marka
    private boolean started; // arabanın çalışıp çalışmadığı

    // getter, setter -> javada private olan field değerlere başka bir sınıf üzerinden erişbilmek için public
    // yapmamız gerekir.

    // getter -> field değerini okumak için kullanılır
    // setter -> field değer atama işlemi için kullanılır

    // get set edilen son güncel değeri okumamızı sağlar.

    public Car(){}

    public Car(String engineType,String model, String brand) {
        // default constructor
        this.brand = brand;
        this.model = model;
        this.engineType  = engineType;
    }

    // Not: Defaultda contrcutor zorunluluğu yok ama boş dışında parametreli bir contructor tanımı yaparsak bu durumda boş constructor kullanmak için bu default contructora tanımlamamız lazım.


    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public boolean isStarted() {
        return started;
    }

    // behaviors
    public void start() {
        System.out.println("Araba çalıştı");
        started=true;
    }

    public void stop() {
        System.out.println("Araba durdu");
        started=false;
    }

    // Override bir anatasyondur.
    // Javada Anatasayonlar class yada method üzerinde yazılır. işaretleyicidirler.
    @Override
    public String toString() {

        // javada super keyword kaltım alınan sınıf demek. Gizli kalıtım Object.
        return "Car{" +
                "engineType='" + engineType + '\'' +
                ", model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", started=" + started +
                '}';
    }


    // aynı zamanda classlarında diğer üyesi methodlardır
    // classlar birbirinden nitelikleri ile ayrılırken (fields) aynı zamanda belirli bir davranış de gösteririr.
}
