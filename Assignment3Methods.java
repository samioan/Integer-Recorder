//’σκηση 3
//Καταγραφή ακέραιων αριθμών, τύπωση του τετραγώνου τους, τύπωση αθροισμάτων θετικών και αρνητικών αριθμών
//Μέθοδοι κύριας κλάσης
//Assignment3Methods.java

import java.util.Scanner;

public class Assignment3Methods{

   Scanner input = new Scanner(System.in);
   
   //Μεταβλητές
   private int number = 0; //αριθμός που εισάγουμε
   private int numberSquared = 0; //τετράγωνου εισαχθέντα αριθμού
   private int positiveNumberSum = 0; //σύνολο θετικών αριθμών
   private int negativeNumberSum = 0; //σύνολο αρνητικών αριθμών
   
   //Αρχικοποίηση μεταβλητών
   public Assignment3Methods(){
   
      number = 0;
      numberSquared = 0;
      positiveNumberSum = 0;
      negativeNumberSum = 0;   
   
   }//τέλος constructor
      
   //Καταγραφή ακέραιων αριθμών και τύπωση του τετραγώνου τους
   public void squareNumbers(){
   
      do {
   
         System.out.print("Please enter a number or 0 to terminate the program: ");
      
         number = input.nextInt();
      
         if (number > 0) {
      
            numberSquared = number * number;
            System.out.println("Your number squared is: " +numberSquared);
            System.out.println("");
            positiveNumberSum += number;    
      
         }//τέλος if
      
         if (number < 0) {
      
            numberSquared = number * number;
            System.out.println("Your number squared is: " +numberSquared);
            System.out.println("");
            negativeNumberSum += number;    
      
         }//τέλος if
      
      }//τέλος do
   
      while (number !=0);
   
   }//τέλος μεθόδου squareNumbers
   
   //Tύπωση αθροισμάτων θετικών και αρνητικών αριθμών
   public void sumCalculator(){
   
      if (positiveNumberSum!= 0 && negativeNumberSum!= 0) {
      
         System.out.println("");
         System.out.println("The sum of positive numbers is: " +positiveNumberSum);
         System.out.println("The sum of negative numbers is: " +negativeNumberSum);
         
      } else if (positiveNumberSum!= 0) {
      
         System.out.println("");
         System.out.println("The sum of positive numbers is: " +positiveNumberSum);
         
      } else if (negativeNumberSum!= 0) {  
      
         System.out.println("");
         System.out.println("The sum of negative numbers is: " +negativeNumberSum);
      
      } else {
            
      }//τέλος if
   
   }//τέλος μεθόδου sumCalculator

}//τέλος κλάσης Assignment3Methods