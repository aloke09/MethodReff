package methodReffStatic1;
public class Static2
{
    public static void display()
    {
        System.out.println("another example of static member fn");
    }

    public static void main(String[] args) {
        Thread t=new Thread(Static2::display);
        t.start();
    }
}
