import java.util.Scanner;

public class InchesToCentimeters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter inches: ");
        double inches = Double.parseDouble(scanner.nextLine());
        System.out.print("Centimeters: " + inches * 2.54);
    }
}
