package concurrency;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Syn {

    int num = 0;

    public synchronized void write(String str) throws InterruptedException, IOException {

        FileWriter fw = new FileWriter("C:\\Users\\zeroOne\\Desktop\\filename" + num++ + ".txt");

        for (int i = 0; i < str.length(); i++) {
            fw.write(str.charAt(i));
        }

        fw.close();
        try {
            Thread.sleep(8000);
        } catch (Exception e) {
            System.out.println("Exception has been caught" + e);
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " Writing successful");
    }

    public void print(int count) throws InterruptedException {

        for (int i = 0; i < 3; i++) {
            System.out.println(Thread.currentThread().getName());

            System.out.println(count * i);

            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println("Exception has been caught" + e);
                e.printStackTrace();
            }
        }
    }

    public double add(int a, int b) {
        System.out.println(Thread.currentThread().getName() + " add " + a + b);
        return a + b;
    }

    public double multiply(int a, int b) {
        System.out.println(Thread.currentThread().getName() + " multiply " + a * b);
        return a * b;
    }

    public double Subtract(int a, int b) {
        System.out.println(Thread.currentThread().getName() + " Subtract " + a / b);
        return a - b;
    }

    public double division(int a, int b) {
        System.out.println(Thread.currentThread().getName() + " division " + a / b);
        return a / b;
    }
}
