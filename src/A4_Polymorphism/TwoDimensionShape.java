package A4_Polymorphism;

// her 2 boyutlu nesnenin ve çevre bir alan hesabı vardır
// bir çok şekil 2 boyutlu olabilir. Bu durumda çevre ve alan hesabı yapamdığımız için
// default olarak 0 döndürdük
// Abstract sınıflar newlenmezler

// Bu örnek aslında 2 konuyu kapsar. Hem abstraction hemde polimprohisme hizmet verir. Kalıtım olarak uygulanmış halidir.
public abstract class TwoDimensionShape {
    // Not: ben bu methodun nasıl bir hesaplama yapacağını bilmiyorum.
    abstract double getPerimeter();
    abstract double getArea();
}

// Abstract sınıflar kalıtımsal bir rehberlik yapar
// abstract soyot tanımlanmış sınıflar içerisinde abstract method tanımı yapaılabilir. Soyut method tanımı yapılabilir. abtract methodların body alanı yoktur. Abstract classlarda abstract olmayan bodysi olan methodlarda tanımlanabilir.
// abstract sınıflar sadece kalıtım vermek amaçlı kullanılır ve instance alınamaz.


// Abstraction işin içine girince aslında abstract sınıflardan çok. Interface kullanımı yaparız.
