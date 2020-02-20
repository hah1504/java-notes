
class NewThread extends Thread {

    NewThread() {
        // Create a new, second thread
        super("Demo Thread");   // calls the constructor public Thread(String threadName)
        System.out.println("Child thread: "+ this);
        start();
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

class NewThread2 implements Runnable {
    Thread t;

    NewThread2() {
        t = new Thread(this, "ChildThread2");
        System.out.println("Second Child Thread: "+t);
        t.start();
    }

    public void run() {
        try {
            Thread.sleep(1000);
            System.out.println("Message from child thread 2");
        } catch (InterruptedException e) {
            System.out.println("Child thread 2 interrupted.");
        }
        System.out.println("Exiting child thread 2");
    }
}

class thread_thread1 {
    public static void main(String[] args) {
        new NewThread();    //create a new thread

        try {
            for(int i=5; i>0; i--) {
                System.out.println("Main thread: "+i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }
        System.out.println("Main thread exiting.");
        NewThread2 t2 = new NewThread2();
    }
}