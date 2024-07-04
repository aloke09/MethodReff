package methodreff;

public class nonStatic2
{
    public void display()
    {
        System.out.println("another example of non static member fn");
    }

    public static void main(String[] args) {
        Thread t=new Thread(new nonStatic2()::display);
        t.start();
    }
}
