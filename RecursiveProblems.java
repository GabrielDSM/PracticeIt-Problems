// Gabriel Menescal
// This file contains various solutions to Recursive practice-it problems

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
   
   private void writeSequence(int n, boolean even) {
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
   
   // A method that accepts an integer parameter n and returns a string of stars (asterisks) 
   // 2n long (i.e., 2 to the nth power) 
   // E.g. starString(0); --> Output: "*" starString(3); --> Output: "********"	
   public String starString(int n) {
      if (n < 0) {
         throw new IllegalArgumentException();
      }
      n = (int) Math.pow(2, n);
      return starString("", n);
   }
   
   private String starString(String answer, int remaining) {
      if (remaining > 0) {
         answer += "*";
         answer = starString(answer, remaining - 1);
      }
      return answer;
   }
   
   // A method that accepts an integer parameter n and prints the first n integers starting 
   // with 1 in sequential order, separated by commas. E.g. writeNums(5); --> Output: 1, 2, 3, 4, 5
   public void writeNums(int n) {
      if (n < 1) {
         throw new IllegalArgumentException();
      }
      writeNums(1, n);
   }
   
   private void writeNums(int curr, int n) {
      if (curr <= n) {
         if (curr == 1) {
            System.out.print("1");
            curr++;
            writeNums(curr, n);
         } else {
            System.out.print(", " + curr);
            curr++;
            writeNums(curr, n);
         }
      }
   }
   
   // A method that accects two integers as parameters and uses them to calculate the first parameter
   // to the power of the second parameter. E.g. pow(2,4) --> Output: 16
   public int pow(int x, int y) {
      if (n == 0) {
         return 1;
      } else {
         return x * pow(x, y-1);
      }
      
   }
   
   // A method that takes in a given number (n) and return the factorial of that number through
   // recursion. E.g. factorial(5) --> Output: 120
   public int factorial(int n) {
      if (n < 0) {
         throw new IllegalArgumentException("Invalid number entered.");
      }
      if (n == 0) {
         return 1;
      } else {
         reutrn n * factorial(n - 1);
      }
   }
   
   // A method that takes in a stack of integers (easily adjusted for other data types) and doubles
   // each of the elements in the stack while preserving the original order.
   // E.g. [1,2,3,4] --> Output: [1,1,2,2,3,3,4,4]
   public void stutter(Stack<Integer> s) {
      if (!s.isEmpty()) {
         int n = s.pop();
         stutter(s);
         s.push(n);
         s.push(n);
      }
   }
}
