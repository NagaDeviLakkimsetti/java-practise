public class constructorclass{
    String name;
    int rollno;


public constructorclass(String n, int a)
{
    name=n;
    rollno=a;
}
public void display(){
    System.out.println("Name:" +name+ "\nRollno:" +rollno);
}
public static void main(String args[])
{
    constructorclass c1=new constructorclass("Devi", 7);
    constructorclass c2=new constructorclass("Somu", 8);
    c1.display();
    c2.display();
}}