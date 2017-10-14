import java.util.Scanner;

import static java.lang.Math.sqrt;

public class SquareArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter square side: ");
        int input = Integer.parseInt(scanner.nextLine());
        int result = input * input;
        System.out.print(result);
    }
}
