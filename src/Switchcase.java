import java.util.Scanner;
public class Switchcase{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the operation:1.Add" +"\n"+ "2.sub" +"\n"+ "3.product" +"\n"+ "4.Division");
        String operator=input.nextLine();

        System.out.print("Enter number1:");
        int n1=input.nextInt();

        System.out.print("Enter number2:");
        int n2=input.nextInt();

        switch(operator){
            case "Add":
                int n3=n1+n2;
                System.out.println("The addition of the numbers is:" +n3);
                break;

            case "sub":
                {
                if(n1>n2)
                {
                
                  n3=n1-n2;
                System.out.println("The subtraction of the numbers is:" +n3);
                }
                else
                {
                     n3=n2-n1;
                    System.out.println("The subtraction of the numbers is:" +n3);
                }
                }
                break; 


            case "product":
                  n3=n1*n2;
                System.out.println("The product of the numbers is:" +n3);
                break;

            case "Division":
                  n3=n1/n2;
                System.out.println("The dividion of the numbers is:" +n3);
                break; 

            default:
                System.out.println("Enter valid numbers to perform operation");    
        }

    }}
