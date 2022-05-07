public class MyWriterRunnable implements Runnable {
    private final ExceptionData data;

    public MyWriterRunnable(ExceptionData data) {
        this.data = data;
    }

    @Override
    public void run() {
        System.out.println("I will throw an exception after 3 sec...");
        try {
            Thread.sleep(3000);
            throw new RuntimeException("HI EXCEPTION");
        } catch (RuntimeException | InterruptedException e) {
            this.data.write(e);
        }
    }
}
