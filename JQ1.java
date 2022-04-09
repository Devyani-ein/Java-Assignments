//Devyani Mahale
//Question-1

interface Drawing

{

    void draw();

}

interface Programming

{

    void coding();

}

abstract class Engineering

{

    abstract void display();

}

class Computer extends Engineering implements Programming

{

    public void display()

    {

        System.out.println("display method of Computer class\n");

    }

    public void coding()

    {

        System.out.println("This is the coding method\n");

    }

}

class Mechanical extends Engineering implements Drawing

{

    public void display()

    {

        System.out.println("display method of Mechanical class\n");

    }

    public void draw()

    {

        System.out.println("draw method\n");

    }
}
public class Demo 
{
    public static void main(String args[])
    {
        Computer c = new Computer();
        Mechanical m = new Mechanical();
        c.display();
        c.coding();
        m.display();
        m.draw();
    }
}