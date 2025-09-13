public class ProgrammingExercises {
    public static void main(String[] args) {
        // Print table header
        System.out.println("a\ta^2\ta^3\ta^4");

        // Print rows for a = 1 to 4
        for (int a = 1; a <= 4; a++) {
            int a2 = a * a;           // a^2
            int a3 = a * a * a;       // a^3
            int a4 = a * a * a * a;   // a^4

            System.out.println(a + "\t" + a2 + "\t" + a3 + "\t" + a4);
        }
    }
}