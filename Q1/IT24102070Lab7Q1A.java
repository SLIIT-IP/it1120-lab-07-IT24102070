import java.util.Scanner;

public class IT24102070Lab7Q1A
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter Marks for four Subjects:");

        int subMark1, subMark2, subMark3, subMark4;
        double average;

        System.out.print("Enter Subject Mark 1: ");
        subMark1 = input.nextInt();

        System.out.print("Enter Subject Mark 2: ");
        subMark2 = input.nextInt();

        System.out.print("Enter Subject Mark 3: ");
        subMark3 = input.nextInt();

        System.out.print("Enter Subject Mark 4: ");
        subMark4 = input.nextInt();

        average = (subMark1 + subMark2 + subMark3 + subMark4) / 4.0;

        System.out.println("\nAverage is: " + average);

        if (average <= 100 && average >= 75) {
            System.out.println("Overall Grade is: Distinction");
        } else if (average <= 74 && average >= 50) {
            System.out.println("Overall Grade is: Credit");
        } else {
            System.out.println("Overall Grade is: Fail");
        }
    }
}
