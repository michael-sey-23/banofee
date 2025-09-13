import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {

        Scanner getInput = new Scanner(System.in);

        System.out.print("Enter value for a: ");
        double a = getInput.nextDouble();
        System.out.print("Enter value for b: ");
        double b = getInput.nextDouble();
        System.out.print("Enter value for c: ");
        double c = getInput.nextDouble();
        System.out.print("Enter value for d: ");
        double d = getInput.nextDouble();
        System.out.print("Enter value for e: ");
        double e = getInput.nextDouble();
        System.out.print("Enter value for f: ");
        double f = getInput.nextDouble();

        double x = ( e * d - b * f) / (a * d - b * c);
        double y = (a * f - e * c)/ (a * d - b * c);

        String formattedString = String.format("x = %f, y = %f", x, y);

        System.out.println(formattedString);
    }
}
