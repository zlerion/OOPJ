import java.util.Scanner;

public class RectanglePerimeter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the Lenght: ");
        float len = scan.nextFloat();
        System.out.print("Enter the Breadth: ");
        float brd = scan.nextFloat();

        System.out.println("Area is: " + (len*brd));
        System.out.println("Perimeter is: " + (2*(len+brd)));


    }
}