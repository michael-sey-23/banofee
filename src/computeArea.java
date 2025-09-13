import java.util.Scanner;

public class computeArea {
    public static void main(String[] args){
        Scanner getInput = new Scanner(System.in);
        final double pi = Math.PI;

        System.out.print("Enter radius: ");
        double radius = getInput.nextDouble();

        double area = Math.pow(radius, 2) * pi;
        System.out.printf("Area of circle is %f",area);
    }
}
