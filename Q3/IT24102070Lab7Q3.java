import java.util.Scanner;
public class IT24102070Lab7Q3
{
     public static void main(String[] args)
     {
      
     Scanner input = new Scanner(System.in);

     double totalDiscount;
     double lastAmount;
     char paymentType;
     int totalBillAmount;
     int customerCount;

     for(customerCount = 1; customerCount <= 5; customerCount++)
     {
         System.out.println("Customer" + " " + customerCount);
         System.out.print("Enter total bill amount:");
         totalBillAmount = input.nextInt();
     
    
         System.out.print("Enter mode of payment (C for cash, O for other):");
         paymentType = input.next().charAt(0);

         if(paymentType == 'C' || paymentType == 'c') 
         {
            totalDiscount = totalBillAmount * 0.05;
            lastAmount = totalBillAmount - totalDiscount;
            System.out.println("Discount is:" + totalDiscount);
            System.out.println("Amount to be paid:" + lastAmount);

         }

         else if(paymentType == 'O' || paymentType == 'o')
         {
             lastAmount = totalBillAmount; 
             System.out.println("No discount applicable");
             System.out.println("Amount to be paid:" + lastAmount);

         }
        
         else
         {
              System.out.println("Payment Mode is Not Valid");
        
         }

         System.out.println("\n");
     }

     }
}

      

    