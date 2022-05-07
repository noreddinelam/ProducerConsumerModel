public class Main {
    public static void main(String[] args) throws InterruptedException {
        ExceptionData exceptionData = new ExceptionData();
        Thread reader = new Thread(new MyReaderRunnable(exceptionData));
        Thread writer = new Thread(new MyWriterRunnable(exceptionData));
        reader.start();
        writer.start();
    }
}
