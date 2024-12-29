//--------PROJECT ON SIMPLE CALCULATOR---->
import java.util.*;
public class Main {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the first number:");	int a = sc.nextInt();
System.out.println("Enter the second number:");  int b = sc.nextInt();
 
   int sum = a+b;
   int sub = a-b;
   int mul = a*b;
   float div = a/b;
   
   System.out.println("for sum type 1");
   System.out.println("for substraction type 2");
  System.out.println("for multiplication type 3");
  System.out.println("for division type 4");
  int calculate = sc.nextInt();
  
  switch(calculate){
       case 1:
       System.out.println("The sum of two number is : "+sum);
       break;
       case 2 :
       System.out.println("The substraction of two number is "+sub);
       break;
       case 3:
       System.out.println("The multiplication of two number is "+mul);
       case 4:
       System.out.println("The division of two number is "+div);
       break;
       default:
       System.out.println("Sorry ! Invalid input.");
      }
   }
}