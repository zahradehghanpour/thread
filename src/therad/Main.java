package therad;

public class Main {

    public static void main(String[] args) {
        Thread1 t1 = new Thread1("t1");
        Thread t3 = new Thread(t1);
                t3.start();
        Thread1 t2 = new Thread1("t2");
        Thread t4 = new Thread(t2);
                 t4.start();
        Thread t5 = new Guess(27);
                 t5.start();
    }
}
