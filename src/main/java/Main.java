public class Main {
    public static void main(String[] args) throws InterruptedException {
        ExceptionData exceptionData = new ExceptionData();
        Thread reader = new Thread(new MyReaderRunnable(exceptionData));
        Thread writer = new Thread(new MyWriterRunnable(exceptionData));
        reader.start();
        writer.start();












//        System.out.println(t.getName());
//        Thread.setDefaultUncaughtExceptionHandler(new MyUncaughtExceptionHandler());
//        t.start();
//        int i = 0;
//        while (i++ < 10) {
//            System.out.println("i : " + i);
//            Thread.sleep(1000);
//        }
    }
}
