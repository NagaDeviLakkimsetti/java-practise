import java.util.Scanner;
public class Greatestnumber{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the first number");
        int n1= input.nextInt();

        System.out.println("Enter the second number");
        int n2= input.nextInt();

        System.out.println("Enter the third number");
        int n3= input.nextInt();

        if (n1==n2 && n1==n3)
        {
            System.out.println("All the 3 numbers are equal");
        }
        else if (n1>=n2 && n2>=n3)
        {
            System.out.println("The greatest of all 3 numbers is:" +n1);
        }

     else if (n2>=n1 && n2>=n3)
     {
       System.out.println("The greatest of all 3 numbers is:" +n2); 
     }

     else{
        System.out.println("The greatest of all 3 numbers is:" +n3);
     }
    }
}