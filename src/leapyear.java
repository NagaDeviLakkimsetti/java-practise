import java.util.Scanner;

public class leapyear{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the year:");
        int a=input.nextInt();
        

        if(a/4==0 && a/400==0 && a/100!=0)
        {
            System.out.println(+a+ "is a leap year");
        }
        else{
           System.out.println(+a+ "is not a leap year"); 
        }
    }
}
