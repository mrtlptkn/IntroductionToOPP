package A7_GenericClass;

public class GenericClassMain {

    public static void main(String[] args) {

        // generic yapıda bir çok şekilliktir. amaç burada bir tip tanımlayalım o başka tiplerler çalışmak için
        // bir kapsayıcı olsun.

        Cup<Tea> teaCup= new Cup<>();
        teaCup.setContent(new Tea());
        Tea tea =  teaCup.getContent();

        Cup<Coffee> coffeeCup = new Cup<>();
        coffeeCup.setContent(new Coffee());
        Coffee coffee = coffeeCup.getContent();


    }
}
