/*4. Write a java program to calculate the sum and average of an array of 1000 integers (generated randomly) using 10 threads. Each thread calculates the sum of 100 integers. Use these values to calculate average. [Use join method ]
*/

import java.util.*;

class Join4 implements Runnable {
    Thread t;
    int no;
    int sum;
    int a[] = new int[1000];

    Join4(String s, int n) {
        Random rs = new Random();
        t = new Thread(this, s);
        no = n;
        // Generate random numbers between 0 and 99
        for (int i = 0; i < 1000; i++) {
            a[i] = rs.nextInt(100);
        }
        t.start();
    }

    public void run() {
        for (int i = no; i < no + 100; i++) {
            sum += a[i];
        }
        System.out.println("Sum = " + sum);
        System.out.println("Avg =" + (sum / 100.0)); // Use floating point division for accuracy
    }
}

public class JoinMethod4 {
    public static void main(String[] arg) throws InterruptedException {
        Join4 t1 = new Join4("g", 0);
        t1.t.join();
        Join4 t2 = new Join4("r", 100);
        t2.t.join();
        Join4 t3 = new Join4("s", 200);
        t3.t.join();
        Join4 t4 = new Join4("t", 300);
        t4.t.join();
        Join4 t5 = new Join4("u", 400);
        t5.t.join();
        Join4 t6 = new Join4("v", 500);
        t6.t.join();
        Join4 t7 = new Join4("w", 600);
        t7.t.join();
        Join4 t8 = new Join4("x", 700);
        t8.t.join();
        Join4 t9 = new Join4("y", 800);
        t9.t.join();
        Join4 t10 = new Join4("z", 900);
        t10.t.join();
    }
}
