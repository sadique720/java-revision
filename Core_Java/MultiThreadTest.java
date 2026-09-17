public class MultiThreadTest {
    public static void main(String[] args) throws InterruptedException {
        // StringBuffer is not thread-safe and non-synchronized,
        StringBuilder sb = new StringBuilder();
        // StringBuilder is thread-safe and synchronized, so if multiple threads try to modify it simultaneously,
        // StringBuffer sb = new StringBuffer();

        // Thread 1: 1000 baar "A" append karega
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                sb.append("A");
            }
        });

        // Thread 2: 1000 baar "A" append karega
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                sb.append("A");
            }
        });

        t1.start();
        t2.start();

        // Dono threads ke finish hone ka wait karein
        t1.join();
        t2.join();

        System.out.println("Expected Length: 2000");
        System.out.println("Actual StringBuilder Length: " + sb.length());
    }
}