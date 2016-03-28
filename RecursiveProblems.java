// Gabriel Menescal
// This file contains various solutions to Recursive practice it problems
public class RecursiveProblems {
   // Writes a method writeSequence that accepts an integer n as a parameter and prints 
   // a symmetric sequence of n numbers with descending integers ending in 1 followed 
   // by ascending integers beginning with 1
   // E.g. writeSequence(1); --> Output: 1 writeSequence(2); --> Output: 1 1
   //      writeSequence(3); -->	Output: 2 1 2 writeSequence(5); --> Output: 3 2 1 2 3
   //      writeSequence(7); --> Output: 4 3 2 1 2 3 4 writeSequence(10); --> Output: 5 4 3 2 1 1 2 3 4 5
   public void writeSequence(int n) {
       if (n < 1) {
           throw new IllegalArgumentException();
       }
       if (n % 2 == 0) {
           writeSequence(n, true);
       } else {
           writeSequence(n, false);
       }
   }
   
   public void writeSequence(int n, boolean even) {
       if (even) {
           if(n == 1 || n == 2){
               System.out.print("1 1");
           } else {
               System.out.print(n / 2 + " ");
               writeSequence(n - 2, even);
               System.out.print(" " + (n / 2));
           }
       } else { 
           if(n == 1 || n == 2) {
               System.out.print("1");
           } else {
               System.out.print((n + 1) / 2 + " ");
               writeSequence(n - 2, even);
               System.out.print(" " + ((n + 1) / 2));
           }
       }
   }
}