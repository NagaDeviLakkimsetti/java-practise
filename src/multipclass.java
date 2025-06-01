public class multipclass{
    String name;
    int rollno;

    public void display(){
        System.out.println("Name:"+name+ "Roll no:"+rollno);
    }
    public static void main(String args[]){
        multipclass s1=new multipclass();
        s1.name="Devi";
        s1.rollno=7;

        multipclass s2=new multipclass();
        s2.name="somu";
        s2.rollno=8;

        s1.display();
        s2.display();
    }
}