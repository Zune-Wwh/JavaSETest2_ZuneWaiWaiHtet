//Multilevel Inheritance
class ABB{
    void A(){
        System.out.println("This is method A.");
    }
}

class BC extends ABB{
    void B(){
        System.out.println("This is method B.");
    }
}

class CD extends BC{
    void C(){
        System.out.println("This is method C.");
    }
}

public class Q1 extends CD{
    public static void main(String[] args) {
        CD obj = new CD();
        obj.A();
        obj.B();
        obj.C();
    }
}
