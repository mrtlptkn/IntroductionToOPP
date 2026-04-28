package A5_Abstraction;

public class AbstractionMain {

    public static void main(String[] args) {

        IFlyable bf = new ButterFly();
        bf.fly();
        IWalkable wk = (IWalkable) bf;
        wk.walk();

        IFlyable ap = new AirPlain();
        ap.fly();


        // farklı ürün aile grupları altında aynı çatı altında sınıfları toplamak istersek. sınıflara özellik, yetenek kazandırmak istersek. ozaman soyutlama yaparak ortak özellikleri soyut sınıflara atarız. ve bu soyut sınıfları kalıtım yoluyla kullanırız. bu sayede kod tekrarından kurtuluruz. Burada interface kullanımı kaçınılmazdır.



    }
}
