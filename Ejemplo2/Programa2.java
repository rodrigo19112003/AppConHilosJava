package Ejemplo2;

public class Programa2 {
    public static void main(String[] args) throws InterruptedException {
        Corredor corredor1 = new Corredor('1');
        Corredor corredor2 = new Corredor('2');
        Corredor corredor3 = new Corredor('3');

        Thread p1 = new Thread(corredor1);
        Thread p2 = new Thread(corredor2);
        Thread p3 = new Thread(corredor3);

        p1.start();
        p2.start();
        p3.start();
    }
}
