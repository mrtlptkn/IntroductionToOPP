package A5_Abstraction;


// kalıtımda extends
// interfacede implements kullanılır.

public class ButterFly  implements  IFlyable,IWalkable{
    @Override
    public void fly() {
        System.out.println("ButterFly fly");
    }

    @Override
    public void walk() {
        System.out.println("ButterFly walk");
    }
}
