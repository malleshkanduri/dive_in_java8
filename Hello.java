public class Hello {
    static public void main(String str[]) {
        System.out.println("Helllo");
        Thread tt = new Thread(() -> System.out.println("I am inside Runnable..."));
        tt.start();
    }
}