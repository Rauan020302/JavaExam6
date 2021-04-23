public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new JavaThread());
        Thread thread2 = new Thread(new PythonThread());
        Thread thread3 = new Thread(new GoThread());
        Thread thread4 = new Thread(new JavaScriptThread());
        Thread thread5 = new Thread(new PHPThread());
        Thread thread6 = new Thread(new CSharpThread());
        thread1.start();
        thread1.join();
        thread2.start();
        thread2.join();
        thread3.start();
        thread3.join();
        thread4.start();
        thread4.join();
        thread5.start();
        thread5.join();
        thread6.start();
    }
}
