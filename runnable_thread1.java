

class NewThread implements Runnable {
    Thread t;

    NewThread() {
        t = new Thread(this, "Demo Thread");
        System.out.println("Child thread: " + t);
        t.start();
    }

    // This is the entry point for the second thread.
    public void run() {
        try{
            for(int i=5; i>0; i--) {
                System.out.println("Child thread: "+i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Child Interrupted.");
        }
        System.out.println("Exiting child thread.");
    }
}


class runnable_thread1 {
    public static void main(String[] args) {
        // NewThread t = new NewThread(); //can be used instead of the following line, both are same
        new NewThread();

        try {
            for(int i=5; i>0; i--) {
                System.out.println("Main thread: " + i);
                Thread.sleep(1000);
            }
        } catch(InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }
        System.out.println("Main thread exiting.");
        
    }
}