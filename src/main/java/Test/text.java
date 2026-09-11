package Test;

import service.Computer;

public class text {
    public static void main(String[] args) {
        Computer pc = new Computer();
        pc.start();
        pc=null;
        System.gc();
    }
}
