import java.util.Scanner;

public class TrapezoidArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a = ");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter b = ");
        double b = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter h = ");
        double h = Double.parseDouble(scanner.nextLine());
        double result = ((a + b) * h) / 2;
        System.out.print("Area is " + result);
    }
}
