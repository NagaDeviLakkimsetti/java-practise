public class multiclass{
    String name;
    int rollno;

    public void display(){
        System.out.println("Name:" + name + "\nRoll no:" + rollno);
    }
    public static void main(String args[]){
        multiclass s1=new multiclass();
        s1.name="Devi";
        s1.rollno=7;

        multiclass s2=new multiclass();
        s2.name="somu";
        s2.rollno=8;
        s1.display();
        s2.display();
    }
}