package methodreff;

public class NonStatic 
{
    public static void main(String[] args)
    {
        Student1 s1=new Student1();
        STU stu=s1::display;
        stu.display();

    }
}
