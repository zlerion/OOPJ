import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter 1st nnumber: ");
        float num1 = scan.nextFloat();
        System.out.print("Enter 2nd nnumber: ");
        float num2 = scan.nextFloat();

        System.out.println("The Sum of " + num1 + " and " + num2 + " is: " + (num1+num2));
        System.out.println("The Difference of " + num1 + " and " + num2 + " is: " + (num1-num2));
        System.out.println("The Product of " + num1 + " and " + num2 + " is: " + (num1*num2));
        if (num2 != 0) {
            System.out.println("The Quotient of " + num1 + " and " + num2 + " is: " + (num1/num2));
        }
        else{
            System.out.println("Not Divisible");
        }


    }
}