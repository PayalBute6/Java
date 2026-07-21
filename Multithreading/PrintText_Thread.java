/*5. Define a thread called “PrintText_Thread” for printing text on command prompt for n number of times. Create three threads and run them. Pass the text and n as parameters to the thread constructor. Example: 
i. First thread prints “I am in FY” 10 times 
ii. Second thread prints “I am in SY” 20 times
iii. Third thread prints “I am in TY” 30 times */

class PrintText implements Runnable {
    String msg = "";
    int n;

    PrintText(String msg, int n) {
        this.msg = msg;
        this.n = n;
    }

    public void run() {
        for (int i = 1; i <= n; i++) {
            synchronized (System.out) {
                System.out.println(msg + " " + i + " times");
            }
            try {
                Thread.sleep(100); // Adding some delay for demonstration
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class PrintText_Thread {
    public static void main(String a[]) {
        int n = 10; // Default value
        if (a.length > 0) {
            n = Integer.parseInt(a[0]);
        }
        PrintText t1 = new PrintText("I am in FY", n);
        new Thread(t1).start();
        PrintText t2 = new PrintText("I am in SY", n + 10);
        new Thread(t2).start();
        PrintText t3 = new PrintText("I am in TY", n + 20);
        new Thread(t3).start();
    }
}
