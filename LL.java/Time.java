import javax.swing.event.DocumentEvent.ElementChange;

import java.util.concurrent.ConcurrentHashMap;

/* 
import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number to check odd or even:");
        int a = sc.nextInt();
       if (a==1 && a % 2 != 0) {
           System.out.println("Odd");
       } else {
           System.out.println("Even");
           
       } 
    }
}

*/

/* 
class Main{
    public static void main(String[] args) {
   String str = "Radar" , reverStr = "";
   int strLength = str.length();
   for(int i = (strLength-1);i >= 0;i--){
    reverStr = reverStr + str.charAt(i);
   }
   if(str.toLowerCase().equals(reverStr.toLowerCase())){
    System.out.println("Given word is palindrome");
   } else{
    System.out.println(str + " is not a palindrome word");
   }
}
}
*/

/*
 import java.util.Scanner;;
class Main{
    public static void main(String[] args) {
        System.out.println("Enter no. to find fibnocci series:");
     Scanner sc = new Scanner(System.in);
     int a = sc.nextInt();
     int firstNumber = 0, secondNumber = 1;
     for(int i = 1;i <= a; i++){
        System.out.println(firstNumber + ", ");
        int nextTerm = firstNumber + secondNumber;
        firstNumber = secondNumber;
        secondNumber = nextTerm;
     }
    }
}
 */

/* class Main{
    public static void main(String[] args) {
        int a = 45, b = 15;
        int gcd = 1;
        for(int i = 1; i <= a && i <= b; i++){
            if(a%i == 0 && b%i == 0){
                gcd = i;
            }
           
        }
        System.out.println("GCD of " + a + " and " + b + " is :" + gcd );
int c = a*b;
int lcm = c / gcd;
System.out.println(lcm);
    }
 }
 */

/* 
import java.util.Scanner;
class Main{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
char operator;
int num1, num2, result;
System.out.println("Choose an operator:");
operator = sc.next().charAt(0);
System.out.println("Enter first number:");
num1 = sc.nextInt();
System.out.println("Enter second number:");
num2 = sc.nextInt();

switch(operator){
case '+' :
result = num1 + num2;
System.out.println(result);
break;
case '-' :
result = num1 - num2;
System.out.println(result);
break;
case '*' :
result = num1 * num2;
System.out.println(result);
break;
case '/' :
result = num1 / num2;
System.out.println(result);
break;
default: 
System.out.println("Invalid operator!");
break;
}
sc.close();
}
}
*/

/*class Main {
   
 public static void main(String[] args) {

   // binary number
   long num = 110110111;

   // call method by passing the binary number
   int decimal = convertBinaryToDecimal(num);

   System.out.println("Binary to Decimal");
   System.out.println(num + " = " + decimal);
 }

 public static int convertBinaryToDecimal(long num) {
   int decimalNumber = 0, i = 0;
   long remainder;
   
   while (num != 0) {
     remainder = num % 10;
     num /= 10;
     decimalNumber += remainder * Math.pow(2, i);
     ++i;
   }
   
   return decimalNumber;
 }
} */

/*class Main {

  public static void main(String[] args) {

    // decimal number
    int num = 19;
    System.out.println("Decimal to Binary");

    // call method to convert to binary
    long binary = convertDecimalToBinary(num);

    System.out.println("\n" + num + " = " + binary);
    }

  public static long convertDecimalToBinary(int n) {

    long binaryNumber = 0;
    int remainder, i = 1, step = 1;

    while (n!=0) {
      remainder = n % 2;
        System.out.println("Step " + step++ + ": " + n + "/2");

        System.out.println("Quotient = " + n/2 + ", Remainder = " + remainder);
        n /= 2;

        binaryNumber += remainder * i;
        i *= 10;
    }
    
    return binaryNumber;
    }
} */

/*
class Main{
    public static void main(String[] args) {
        int r1 = 2, c1 = 3;
        int r2 = 3, c2 = 2;
        int[][] firstMatrics = {{2,3,4},{85,23,12}};
        int[][] secondMatrics = {{2,3},{3,5},{6,5}};
        int[][] product = multipltMatrices(firstMatrics, secondMatrics, r1, c1, c2);
        displayMatrices(product);
    

    }
    public static int[][] multipltMatrices(int[][] firstMatrics, int[][] secondMatrices, int r1, int c1, int c2) {
        int[][] product = new int[r1][c2];
        for(int i = 0 ; i < r1; i++){
            for(int j = 0; j < c2; j++){
                for(int k = 0; k < c1 ; k++){
                    product[i][j] = firstMatrics[i][k] * secondMatrices[k][j]; 
                }
            }
        }
return product;
        
    }
    public static void displayMatrices(int [][]product){
        System.out.println("Product of two matrices is:");
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 2; j++){
                System.out.print(product[i][j] + " ");

            }
            System.out.println();
        }
    }
} 
*/

/*public class Time{
int hour;
int minute;
int second;


public Time(int hour, int minute, int second){
    this.hour = hour;
    this.minute = minute;
    this.second = second;
}
public static void main(String[] args) {
    Time start = new Time(12, 20, 40);
    Time stop = new Time(18, 40,19);
    Time diffTime = diffTime(start, stop);

    System.out.printf(" = %d:%d:%d\n", diffTime.hour, diffTime.minute, diffTime.second);
}

public static Time diffTime (Time start, Time stop) {
    
    Time diff = new Time(0, 0, 0);
    if(start.second > stop.second){
        stop.minute--;
        stop.second += 60;
    }
    diff.second = stop.second - start.second;
    if(start.minute > stop.minute){
        stop.hour--;
        stop.minute += 60;

    }
    diff.minute = stop.minute - start.minute;
    diff.hour = stop.hour - start.hour;
    return(diff);
}
}
 */

 /* 
 import java.time.LocalDateTime;
 import java.time.format.DateTimeFormatter;
class Main{
    public static void main(String[] args) {
        LocalDateTime current = LocalDateTime.now();
DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");
String formatted = current.format((formatter));
        System.out.println("Current Date and Time is: " + formatted);

    }
}

*/


/*
 import java.util.ArrayList;
import java.util.List;

class Main{
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<String>();
        list1.add("a");
        List<String> list2 = new ArrayList<String>();
    list2.add("b");
   List<String> join = new ArrayList<String>();


    join.addAll(list1);
   join.addAll(list2);
    System.out.println(list1);
    System.out.println(list2);
 System.out.println(join);
    

    }
}


 */

/*
  import java.util.ArrayList;
 class Main{
    public static void main(String[] args) {
        ArrayList language = new ArrayList<>();
        language.add("Java");
        language.add("JavaScript");

        language.add("Python");

        System.out.println("Arraylist : " + language);
        String[] arr = new String[language.size()];

        language.toArray(arr);
        System.out.print("Array:");
        for(String item:arr){
            System.out.print(item + ", ");
        }

    }
 }
 */


/*
 import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
class Main{
    public static void main(String[] args) {
        String[] array = {"Java", "Python", "C"};
        System.out.println("Array: " + Arrays.toString(array));
        List languages = new ArrayList<>(Arrays.asList(array));
        System.out.println("List : " + languages);
    }
}

 */


  import java.util.*;
class Main{
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "a");
        map.put(2, "2");
        map.put(3, "c");
        map.put(4, "d");
        List<Integer> keyList = new ArrayList(map.keySet());
        List<String> valueList = new ArrayList(map.values());
        System.out.println("key list : " + keyList);
        System.out.println("value list: " + valueList);
    }
}




