


class ThreadEx implements Runnable{
    @Override
    public void run() {
        System.out.println("This is method from Runnable Interface.");
    }
}

public class Q7 extends Thread{

    public static void main(String[] args) {
        ThreadEx obj = new ThreadEx();
        obj.run();
    }
}
