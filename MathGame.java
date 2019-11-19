import java.util.Scanner;
public class MathGame
{

   public static void main(String[] args)
   {
      String o = "Try again";
   	
      Scanner in = new Scanner(System.in);
      int count = 0;
   	
      
   	
      System.out.println("Welcome to the Math Game!");
      System.out.println("You have about one minute to answer as many questions as you can");
      System.out.println("To begin, enter anything");
      String jj = in.next();
   	
      System.out.println("****************************************************************************");
      System.out.println("What is 5 + 5");
      
      TimedExit two = new TimedExit(60);
      String rr = in.next();
   	
      while (rr.compareTo("10") != 0)
      {
         System.out.println(o);
         rr = in.next();
      }
      
      count++;
   	
      System.out.println("You have answered " + count + " questions correctly");
      System.out.println("5 * 5?");
      String q = in.next();
   	
      while (q.compareTo("25") != 0)
      {
         System.out.println(o);
         q = in.next();
      }
      
      count++;
      
      System.out.println("You have answered " + count + " questions correctly");
      System.out.println("5 / 5?");
      q = in.next();
   	
      while (q.compareTo("1") != 0)
      {
         System.out.println(o);
         q = in.next();
      }
      
      count++;
   	
      System.out.println("You have answered " + count + " questions correctly");
      System.out.println("5 - 5?");
      q = in.next();
   	
      while (q.compareTo("0") != 0)
      {
         System.out.println(o);
         q = in.next();
      }
      
      count++;
   	
      
      System.out.println("You have answered " + count + " questions correctly");
      System.out.println("pi to the nearest whole number?");
      q = in.next();
   	
      while (q.compareTo("3") != 0)
      {
         System.out.println(o);
         q = in.next();
      }
      
      count++;
   	
      System.out.println("You have answered " + count + " questions correctly");
      System.out.println("e to the nearest whole number?");
      q = in.next();
   	
      while (q.compareTo("2") != 0)
      {
         System.out.println(o);
         q = in.next();
      }
      
      count++;
   	
      
      System.out.println("You have answered " + count + " questions correctly");
      System.out.println("tangent of 45 degrees?");
      q = in.next();
   	
      while (q.compareTo("1") != 0)
      {
         System.out.println(o);
         q = in.next();
      }
      
      count++;
   	
      System.out.println("You have answered " + count + " questions correctly");
      System.out.println("square root of 25?");
      q = in.next();
   	
      while (q.compareTo("5") != 0)
      {
         System.out.println(o);
         q = in.next();
      }
      
      count++;
   	
      
      System.out.println("You have answered " + count + " questions correctly");
      System.out.println("13 * 13?");
      q = in.next();
   	
      while (q.compareTo("169") != 0)
      {
         System.out.println(o);
         q = in.next();
      }
      
      count++;
   	
      System.out.println("You have answered " + count + " questions correctly");
      System.out.println("square root of 100?");
      q = in.next();
   	
      while (q.compareTo("10") != 0)
      {
         System.out.println(o);
         q = in.next();
      }
      
      count++;
   	
      
      System.out.println("You have answered " + count + " questions correctly");
      System.out.println("12 in base 12?");
      q = in.next();
   	
      while (q.compareTo("10") != 0)
      {
         System.out.println(o);
         q = in.next();
      }
      
      count++;
   	
      System.out.println("You have answered " + count + " questions correctly");
      System.out.println("14 * 4?");
      q = in.next();
   	
      while (q.compareTo("56") != 0)
      {
         System.out.println(o);
         q = in.next();
      }
      
      count++;
   	
      
      System.out.println("You have answered " + count + " questions correctly");
      System.out.println("90 / 3?");
      q = in.next();
   	
      while (q.compareTo("30") != 0)
      {
         System.out.println(o);
         q = in.next();
      }
      
      count++;
   	
      System.out.println("You have answered " + count + " questions correctly");
      System.out.println("81 / 3?");
      q = in.next();
   	
      while (q.compareTo("27") != 0)
      {
         System.out.println(o);
         q = in.next();
      }
      
      count++;
   	
      
      System.out.println("You have answered " + count + " questions correctly");
      System.out.println("4 to the power of 0?");
      q = in.next();
   	
      while (q.compareTo("1") != 0)
      {
         System.out.println(o);
         q = in.next();
      }
      
      count++;
   	
      System.out.println("You have answered " + count + " questions correctly");
      System.out.println("1 to the power of 65?");
      q = in.next();
   	
      while (q.compareTo("1") != 0)
      {
         System.out.println(o);
         q = in.next();
      }
      
      count++;
   	
      
      System.out.println("You have answered " + count + " questions correctly");
      System.out.println("(e^(i*p)) + 1?");
      q = in.next();
   	
      while (q.compareTo("0") != 0)
      {
         System.out.println(o);
         q = in.next();
      }
      
      count++;
   	
      System.out.println("You have answered " + count + " questions correctly");
      System.out.println("cosine of 720 degrees?");
      q = in.next();
   	
      while (q.compareTo("1") != 0)
      {
         System.out.println(o);
         q = in.next();
      }
      
      count++;
   	
      
      System.out.println("You have answered " + count + " questions correctly");
      System.out.println("10 to the power of 3?");
      q = in.next();
   	
      while (q.compareTo("1000") != 0)
      {
         System.out.println(o);
         q = in.next();
      }
      
      count++;
   	
      System.out.println("You have answered " + count + " questions correctly");
      System.out.println("prime number between 9 and 12?");
      q = in.next();
   	
      while (q.compareTo("11") != 0)
      {
         System.out.println(o);
         q = in.next();
      }
      
      count++;
   	
      
      System.out.println("You have answered " + count + " questions correctly");
      System.out.println("1064 / 8?");
      q = in.next();
   	
      while (q.compareTo("133") != 0)
      {
         System.out.println(o);
         q = in.next();
      }
      
      count++;
   	
      System.out.println("You have answered " + count + " questions correctly");
      System.out.println("45 * 5?");
      q = in.next();
   	
      while (q.compareTo("225") != 0)
      {
         System.out.println(o);
         q = in.next();
      }
      
      count++;
   	
      
      System.out.println("You have answered " + count + " questions correctly");
      System.out.println("Is 101 a prime? (answer with <yes> or <no>");
      q = in.next();
   	
      while (q.compareToIgnoreCase("yes") != 0)
      {
         System.out.println(o);
         q = in.next();
      }
      
      count++;
   	
      System.out.println("You have answered " + count + " questions correctly");
      System.out.println("67 * 3?");
      q = in.next();
   	
      while (q.compareTo("201") != 0)
      {
         System.out.println(o);
         q = in.next();
      }
      
      count++;
   	
      
      System.out.println("You have answered " + count + " questions correctly");
      System.out.println("54 / 6?");
      q = in.next();
   	
      while (q.compareTo("9") != 0)
      {
         System.out.println(o);
         q = in.next();
      }
      
      count++;
   	
      System.out.println("You have answered " + count + " questions correctly");
      System.out.println("sine of 90 degrees?");
      q = in.next();
   	
      while (q.compareTo("1") != 0)
      {
         System.out.println(o);
         q = in.next();
      }
      
      count++;
   	
      
      System.out.println("You have answered " + count + " questions correctly");
      System.out.println("sine of 1080 degrees?");
      q = in.next();
   	
      while (q.compareTo("0") != 0)
      {
         System.out.println(o);
         q = in.next();
      }
      
      count++;
   	
      System.out.println("You have answered " + count + " questions correctly");
      System.out.println("cotangent of 45 degrees?");
      q = in.next();
   	
      while (q.compareTo("1") != 0)
      {
         System.out.println(o);
         q = in.next();
      }
      
      count++;
   	
      
      System.out.println("You have answered " + count + " questions correctly");
      System.out.println("tangent of 215 degrees?");
      q = in.next();
   	
      while (q.compareTo("1") != 0)
      {
         System.out.println(o);
         q = in.next();
      }
      
      count++;
   	
      System.out.println("You have answered " + count + " questions correctly");
      System.out.println("i is the square root of negative ...?");
      q = in.next();
   	
      while (q.compareTo("1") != 0)
      {
         System.out.println(o);
         q = in.next();
      }
      
      count++;
   	
      
      System.out.println("You have answered " + count + " questions correctly");
      System.out.println("32 / 2?");
      q = in.next();
   	
      while (q.compareTo("16") != 0)
      {
         System.out.println(o);
         q = in.next();
      }
      
      count++;
   	
      System.out.println("You have answered " + count + " questions correctly");
      System.out.println("31 * 9?");
      q = in.next();
   	
      while (q.compareTo("279") != 0)
      {
         System.out.println(o);
         q = in.next();
      }
      
      count++;
   	
      
      System.out.println("You have answered " + count + " questions correctly");
      System.out.println("63 * 2?");
      q = in.next();
   	
      while (q.compareTo("126") != 0)
      {
         System.out.println(o);
         q = in.next();
      }
      
      count++;
   	
      System.out.println("You have answered " + count + " questions correctly");
      System.out.println("126 / 6?");
      q = in.next();
   	
      while (q.compareTo("21") != 0)
      {
         System.out.println(o);
         q = in.next();
      }
      
      count++;
   	
      
      System.out.println("You have answered " + count + " questions correctly");
      System.out.println("51 * 7?");
      q = in.next();
   	
      while (q.compareTo("357") != 0)
      {
         System.out.println(o);
         q = in.next();
      }
      
      count++;
   	
      System.out.println("You have answered " + count + " questions correctly");
      System.out.println("66 * 3?");
      q = in.next();
   	
      while (q.compareTo("198") != 0)
      {
         System.out.println(o);
         q = in.next();
      }
      
      count++;
   	
      
      System.out.println("You have answered " + count + " questions correctly");
      System.out.println("87 * 7?");
      q = in.next();
   	
      while (q.compareTo("609") != 0)
      {
         System.out.println(o);
         q = in.next();
      }
      
      count++;
   	
      System.out.println("You have answered " + count + " questions correctly");
      System.out.println("4 * 4?");
      q = in.next();
   	
      while (q.compareTo("16") != 0)
      {
         System.out.println(o);
         q = in.next();
      }
      
      count++;
   	
      
      System.out.println("You have answered " + count + " questions correctly");
      System.out.println("0 * 172?");
      q = in.next();
   	
      while (q.compareTo("0") != 0)
      {
         System.out.println(o);
         q = in.next();
      }
      
      count++;
   	
      System.out.println("You have answered " + count + " questions correctly");
      System.out.println("55 / 5?");
      q = in.next();
   	
      while (q.compareTo("11") != 0)
      {
         System.out.println(o);
         q = in.next();
      }
      
      count++;
   	
      
      System.out.println("You have answered " + count + " questions correctly");
      System.out.println("32 * 32?");
      q = in.next();
   	
      while (q.compareTo("1024") != 0)
      {
         System.out.println(o);
         q = in.next();
      }
      
      count++;
   	
      System.out.println("You have answered " + count + " questions correctly");
      System.out.println("99 / 9?");
      q = in.next();
   	
      while (q.compareTo("11") != 0)
      {
         System.out.println(o);
         q = in.next();
      }
      
      count++;
   	
      
      System.out.println("You have answered " + count + " questions correctly");
      System.out.println("3 + 3?");
      q = in.next();
   	
      while (q.compareTo("6") != 0)
      {
         System.out.println(o);
         q = in.next();
      }
      
      count++;
   	
      System.out.println("You have answered " + count + " questions correctly");
      System.out.println("cosecant of 90 degrees?");
      q = in.next();
   	
      while (q.compareTo("1") != 0)
      {
         System.out.println(o);
         q = in.next();
      }
      
      count++;
   	
      
      System.out.println("You have answered " + count + " questions correctly");
      System.out.println("Absolute value of 3?");
      q = in.next();
   	
      while (q.compareTo("3") != 0)
      {
         System.out.println(o);
         q = in.next();
      }
      
      count++;
   	
      System.out.println("You have answered " + count + " questions correctly");
      System.out.println("459 / 3?");
      q = in.next();
   	
      while (q.compareTo("153") != 0)
      {
         System.out.println(o);
         q = in.next();
      }
      
      count++;
   	
      
      System.out.println("You have answered " + count + " questions correctly");
      System.out.println("71 * 92?");
      q = in.next();
   	
      while (q.compareTo("6532") != 0)
      {
         System.out.println(o);
         q = in.next();
      }
      
      count++;
   	
      System.out.println("You finished!");
      System.out.println("You have answered " + count + " questions correctly");
      System.out.println("-------------------------");
      System.out.println("Game created by The Communist Panda");
   }
}