import java.util.Scanner;
public class posnegzero{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number1:");
        int n1=input.nextInt();

        if(n1>0)
        {
          System.out.println(n1+ "is a positive number");
        }

        if(n1==0)
        {
          System.out.println(n1+ "is a zero");
        }

        if(n1<0)
        {
          System.out.println(n1+ "is a negative number");
        }
         input.close();
    }
}