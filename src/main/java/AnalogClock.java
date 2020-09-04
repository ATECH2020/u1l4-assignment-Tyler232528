import java.util.Scanner;

class AnalogClock {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        int hourDeg = scanner.nextInt();

        /*
         *  your code goes here
         */
          int minDeg = (hourDeg%30)*12;
          System.out.print(minDeg);
        // closing the scanner object
        scanner.close();
    }
}