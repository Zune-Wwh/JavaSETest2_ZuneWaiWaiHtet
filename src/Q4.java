interface AB{
    void call();
}

class A implements AB {
    @Override
    public void call() {
        System.out.println("This is call method from ClassA.");
    }
}

class B implements AB {

    @Override
    public void call() {
        System.out.println("This is call method from ClassB.");
    }
}


class C extends A{

}

public class Q4 {
    public static void main(String[] args) {
        C obj = new C();
        obj.call();
    }
}
