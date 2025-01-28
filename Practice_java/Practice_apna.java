
/* 
import java.util.Scanner;
public class Practice_apna{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Double r = input.nextDouble();
        Double area;
        area = 3.14 * r * r;
        System.out.println("Area : " + area);

    }
}
*/


/* 

public class Practice_apna{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int a1 = input.nextInt();
        System.out.println("Enter second number : ");
        int a2 = input.nextInt();
        if(a1 > a2){
            System.out.println("first is greater");
        } else{
            System.out.println("Second is greater");
        }
       

    }
}
*/

/* 

public class Practice_apna{
    public static void main(String[] args) {
        int start = 9, upto = 100;
        for(int i = start; i < upto; i++)
        if(i%2 == 0){
            System.out.print(i + "  ");
        }
    }
}
*/

/* 
import java.util.Scanner;
public class Practice_apna{
    public static void main(String[] args) {
       int n = 25, result = 0;
       double avg;
       Scanner sc = new Scanner(System.in);
       for(int i = 1;i <= n; i++){
        int a = sc.nextInt();
        result += a;
       }
       
       System.out.println("Result : " + result);
       avg = result/n;
       System.out.println("Average: " + avg);


    }
}
*/

/* 
import java.util.Scanner;
class Practice_apna{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first: ");
        int a = sc.nextInt();
        System.out.println("Enter second: ");
        int b = sc.nextInt();
        System.out.println("Enter third: ");
        int c = sc.nextInt();
    int n = 3;
    double avg = (a + b + c) / n;
    System.out.println("Average: " + avg);

    }
}

*/

/* 
import java.util.Scanner;
class Practice_apna{
    public static void main(String[] args) {
        System.out.println("Enter the length of side of square: ");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        double square = Math.pow(a, 2);
        System.out.println("Area of square: " + square);
    }
}
*/

/* 
class Practice_apna{
    public static void main(String[] args) {
        float pencil = (5.32f * 18)/100 + 5.32f;
        float pen = (6.50f * 18)/100 + 6.50f;
        float eraser = (3f * 18)/100 + 3f;

        float total_cost = pencil + pen + eraser;
        System.out.println("Total cost: " + total_cost);


    }
}
*/

/* 
class Practice_apna{
    public static void main(String[] args) {
        int b = 4;
        char c = 'a';
        short s = 512;
        int i = 1000;
        float f = 3.14f;
        double d = 99.9954;
        double result = (f * b) + (i % c) - (d * s);
        System.out.println("Result: " + result);

    }
}
 */

import java.util.Scanner;


class Practice_apna{
    public static int sumOfDigit(int a){
        int result = 0, remainder;
        while(a != 0){
            remainder = a % 10;
            result += remainder;
            a = a / 10;
        }
        return result;
        
    }

        
      
    public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter number: ");
int a = sc.nextInt();
System.out.println("Sum of digits: " +  sumOfDigit(a));
   
   
}
}