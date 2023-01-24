
//Abstract Class Demo

abstract class AbstractClassDemo{
    abstract void ab();
}
public class Q2 extends AbstractClassDemo {

    @Override
    void ab() {
        System.out.println("This is method for abstract class.");
    }

    public static void main(String[] args) {
        Q2 obj = new Q2();
        obj.ab();
    }
}
