import java.util.Scanner;
public class Calculator{
    public static void main(String args[]){
        System.out.println("Enter the number1:");
       Scanner input = new Scanner(System.in);
       int number1 = input.nextInt();
       
       System.out.println("Enter the number2:");
       int number2 = input.nextInt();

       System.out.println("Choose operation:" +"\n"+ "1.Add" +"\n"+ "2.Subtraction" +"\n"+ "3.Multiplication" +"\n"+ "4.Division" +"\n");
       System.out.println("Enter your choise:");
       int choise = input.nextInt();

       if(choise == 1)
       {
        int sum= number1+number2;
        System.out.println("The addition of given numbers is:" +sum);
       }

       else if(choise == 2 && number1>number2)
       {
        int sub = number1-number2;
        System.out.println("The subtraction of given numbers is:" +sub);
       }

       else if(choise == 2 &&  number1 < number2)
       {
        int sub = number2-number1;
        System.out.println("The subtraction of given numbers is:" +sub);
       }

       else if(choise ==3)
       {
        int product = number1*number2;
        System.out.println("The product of given numbers is:" +product);
       }

       else if (choise == 4)
       {
        double div = number1/number2;
        System.out.println("The division of given numbers is:" +div);
       }

       else
       System.out.println("Cannot perform the operation");

    }
}
