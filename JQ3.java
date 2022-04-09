//Devyani Mahale
//Question -3

import java.util.Scanner;

interface GrandParent

{
    void g1();
}

interface Parent1 extends GrandParent
{
    void p1();
}

interface Parent2 extends GrandParent
{
    void p2();
}

interface child extends Parent1,Parent2
{
    void c1();
}

class Family implements child
{
    public void g1()
    {
        System.out.println("this is method from grandparent class");
    }

    public void p1()
    {  
        System.out.println("this is method from Parent1t class");
    }

    public void p2()
    {
        System.out.println("Method from Parent2 class");
    }
    public void c1()
    {
        System.out.println("Method from child class");
    }
}

class Demo
{
    public static void main(String args[])
    {
        Family f = new Family();
        f.g1();
        f.p1();
        f.p2();
        f.c1();
    }

}