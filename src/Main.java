import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double x;
        double y;
        Scanner scanner= new Scanner(System.in);

        System.out.println("enter the value of x:");
        x = scanner.nextDouble();
        System.out.println("enter the value of y:");
        y = scanner.nextDouble();
        System.out.println("Hypotenuse:"+ Math.sqrt((Math.pow(x,2)) + (Math.pow(y,2))));

    }
}