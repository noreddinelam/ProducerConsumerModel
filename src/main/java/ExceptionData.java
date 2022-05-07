public class ExceptionData {
    private volatile Throwable exception = null;

    public void read(String threadName) throws InterruptedException {
        synchronized (this) {
            while(exception == null) {
                System.out.println("I am waiting");
                this.wait();
            }
        }
        System.out.println("Thread : "+ threadName + " message exception : " + exception.getMessage());
    }

    public void write(Throwable t) {
        synchronized (this) {
            this.exception = t;
            this.notify();
        }
    }
}
