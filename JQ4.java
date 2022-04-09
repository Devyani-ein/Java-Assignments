/Devyani Mahale
//Question -4 


interface transport
{
    void deliver();
}
abstract class Animal
{
    String s;
    abstract void deliver();
}
class Tiger extends Animal
{
    public void deliver()
    {
        
    }
}
class Camel extends Animal implements transport
{
    public void deliver()
    {
        System.out.println("Hello"+s);
    }
    Camel(String s1)
    {
        s=s1;
    }     
}
class Deer extends Animal
{
    public void deliver()
    {
        
    }
}
class Donkey extends Animal implements transport
{
    Donkey(String s2)
    {
        s=s2;
    }
    public void deliver()
    {
        System.out.println("Hello world"+s);
    }
}
class interface2 
{
    public static void main(String args[])
    {
        transport[] trans=new transport[4];
        trans[1]=new Camel("My name");
        trans[2]=new Donkey("My name is");
        trans[1].deliver();
        trans[2].deliver();
    }
}