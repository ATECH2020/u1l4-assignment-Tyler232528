import java.util.Scanner;

class StudentDesks {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        int r1 = scanner.nextInt();
        int r2 = scanner.nextInt();
        int r3 = scanner.nextInt();

        /*
         *  your code goes here
         */
          int dr1 = r1/2;
          int dr2 = r2/2;
          int dr3 = r3/2;
          int total = dr1 + dr2 + dr3;
          System.out.print(total);

        // closing the scanner object
        scanner.close();
    }
}