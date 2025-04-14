import java.util.Scanner;
public class EvenoddUserInput{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number1:");
        int n1=input.nextInt();

        if(n1<=0)
        {
            System.out.println("Please enter a valid number which is greater than 0");
            
        }
        else if(n1%2==0)
        {
            System.out.println(n1+ "Is an even number");
        }
        else{
            System.out.println(n1+ "is an odd number.");
        }
        input.close();
    }
}