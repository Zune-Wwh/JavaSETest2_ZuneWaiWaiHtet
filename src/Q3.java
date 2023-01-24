//Interface

interface Callable1{
    void call();
}

interface Callable2{
    void call1();
}

public class Q3 implements  Callable1,Callable2{

    @Override
    public void call() {
        System.out.println("This is from Interface1.");
    }

    @Override
    public void call1() {
        System.out.println("This is from Interface2.");
    }

    public static void main(String[] args) {
        Q3 obj = new Q3();
        obj.call();
        obj.call1();
    }
}
