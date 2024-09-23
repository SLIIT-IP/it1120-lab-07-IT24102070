import java.util.Scanner;

public class IT24102070Lab7Q1B
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) { 
            System.out.println("Student " + i);
            System.out.print("Enter marks (four subjects): ");
            String[] marks = input.nextLine().split(" "); 

            double sum = 0;
            for (String mark : marks) {
                sum += Integer.parseInt(mark); // Parses and sums the marks
            }
            double average = sum / marks.length;

            System.out.println("Average is: " + average);

              if (average >= 75) {
                System.out.println("Overall Grade is: Distinction");
            } else if (average >= 50) {
                System.out.println("Overall Grade is: Credit");
            } else {
                System.out.println("Overall Grade is: Fail");
            }

            System.out.println(); 
        }
    }
}
  
  