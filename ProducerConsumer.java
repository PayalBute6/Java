/*8. Write a program to solve producer consumer problem in which a producer produces a value and consumer consume the value before producer generate the next value. 
(Hint: use thread synchronization)*/

import java.util.LinkedList;

class ProducerConsumer1 {
    private LinkedList<Integer> buffer = new LinkedList<>();
    private int capacity;

    public ProducerConsumer1(int capacity) {
        this.capacity = capacity;
    }

    public void produce() throws InterruptedException {
        int value = 0;
        while (true) {
            synchronized (this) {
                while (buffer.size() == capacity) {
                    wait();
                }
                System.out.println("Producer produced: " + value);
                buffer.add(value++);
                notify();
                Thread.sleep(1000); // Simulating production time
            }
        }
    }

    public void consume() throws InterruptedException {
        while (true) {
            synchronized (this) {
                while (buffer.isEmpty()) {
                    wait();
                }
                int value = buffer.removeFirst();
                System.out.println("Consumer consumed: " + value);
                notify();
                Thread.sleep(1000); // Simulating consumption time
            }
        }
    }
}

public class ProducerConsumer {
    public static void main(String[] args) {
        ProducerConsumer1 pc = new ProducerConsumer1(1); // Buffer capacity is 1

        Thread producerThread = new Thread(() -> {
            try {
                pc.produce();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread consumerThread = new Thread(() -> {
            try {
                pc.consume();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        producerThread.start();
        consumerThread.start();
    }
}
