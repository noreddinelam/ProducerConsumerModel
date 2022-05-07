public class MyReaderRunnable implements Runnable{
    private final ExceptionData data;
    public MyReaderRunnable(ExceptionData data) {
        this.data = data;
    }
    @Override
    public void run() {
        System.out.println("I will read the exception");
        try {
            this.data.read("ThreadReader");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
