#Simple Program
~~~
public class RainyDay{
       public static void main (String[] args){
              System.out.println("It's a rainy day!");
                                  }
                         }
~~~
#Area of Rectangle 
~~~
public class rectangle{
    public static void main(String[] args) {

        double width =4.5; 
        double height = 7.9;

        double area = width * height;
        double perimeter = 2 * (width + height);

        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
                           }
                           }
  ~~~
#Area of Trapezium
~~~
import java.util.Scanner;
    public class Trapezium{
              public static void main(String[] args){
Scanner sc=new Scanner(System.in);

       System.out.println("Enter base 1");
       double base1=sc.nextDouble();

       System.out.println("Enter base 2");
       double base2=sc.nextDouble();

      System.out.println("Enter height");
       double height=sc.nextDouble();
double area = 0.5 * (base1 + base2) * height;
      System.out.println("Area of Trapezium: " + area);
        }
             }

~~~
#Area of Circle
~~~
import java.util.Scanner;
          class Circle {
                    private double radius;
                              public Circle(double radius) {
                                     this.radius = radius;
                                  }

    public void setRadius(double radius) {
        this.radius = radius;
                   }

  public double getRadius() {
   return this.radius;
    }
    public double computeArea() {
        return Math.PI * radius * radius;
                 }
       }

public class CircleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double r = input.nextDouble();

        Circle circle = new Circle(r);

        System.out.println("Radius: " + circle.getRadius());
        System.out.printf("Area of the circle: %.2f\n", circle.computeArea());
    }
}
~~~
#Factorion Number
~~~
import java.util.Scanner;
   public class FactorionNumber {
            public static void main(String[] args) {
                           Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the lower bound of the range: ");
        int lowerBound = scanner.nextInt();

        System.out.print("Enter the upper bound of the range: ");
        int upperBound = scanner.nextInt();
        System.out.println("Factorion numbers in the range:gre");

        boolean found = false;
        for (int i = lowerBound; i <= upperBound; i++) {
            if (FactorialUtil.isFactorion(i)) {
                System.out.println(i);
                found = true;
                            }                         
                   }
        if (!found) {
            System.out.println("No factorion numbers found in the given range.”);  
                                }
        scanner.close();
    }                                  
                 }
~~~
#Array Sum Calculation
~~~
import java.util.Scanner;
      public class ArraySumCalculator {
          public static int sumArray(int[] arr) {

        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] array = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        int total = sumArray(array);
        System.out.println("The sum of the array elements is: " + total);

        sc.close();
    }
}
~~~
#Find Smallest Positive Root
~~~
Import java.util.Scanner;
   public class SmallestPositiveRoot {
         public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

        System.out.print("Enter coefficients a, b, and c: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        double discriminant = b * b - 4 * a * c;

        if (discriminant < 0) {
            System.out.println("No real roots.");
        } else {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);

            if (root1 > 0 && root2 > 0) {
         System.out.println("The smallest positive root is: " + Math.min(root1,       root2));
            } else if (root1 > 0) {
                System.out.println("The smallest positive root is: " + root1);
            } else if (root2 > 0) {
                System.out.println("The smallest positive root is: " + root2);
            } else {
                System.out.println("No positive roots.");
            }
        }

        sc.close();
    }
}
~~~
#Character Type Checker
~~~
import java.util.Scanner;
public class CharTypeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char ch = sc.next().charAt(0);

        if (Character.isLetter(ch)) {
            System.out.println("It is a letter.");
        } else if (Character.isDigit(ch)) {
            System.out.println("It is a digit.");
        } else if (Character.isWhitespace(ch)) {
            System.out.println("It is a whitespace.");
        } else {
            System.out.println("It is a special character.");
        }

        sc.close();
    }
}
~~~
#Number Conversion
~~~
public class MainClass {
    public static void main(String[] args) {

        SumClass sc = new SumClass();
        sc.calculateSum();

     DivisorMultipleClass dm = new DivisorMultipleClass();
        dm.findGcdLcm(24, 36);

        NumberConversionClass nc = new NumberConversionClass();
        nc.convert(25);

        CustomPrintClass cp = new CustomPrintClass();
        cp.pr("All operations executed successfully");
    }
}

class BaseClass {
    void printResult(String message) {
        System.out.println(message);
    }
}

class SumClass extends BaseClass {
    void calculateSum() {
        double sum = 0.0;
        for (double i = 1.0; i >= 0.1; i -= 0.1) {
            sum += i;
        }
        printResult("Sum of the series = " + sum);
    }
}
class DivisorMultipleClass extends BaseClass {
    int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    void findGcdLcm(int a, int b) {
        int g = gcd(a, b);
        int l = (a * b) / g;
        printResult("GCD = " + g);
        printResult("LCM = " + l);
    }
}

class NumberConversionClass extends BaseClass {
    void convert(int num) {
        printResult("Decimal: " + num);
        printResult("Binary: " + Integer.toBinaryString(num));
        printResult("Hexadecimal: " + Integer.toHexString(num));
        printResult("Octal: " + Integer.toOctalString(num));
    }
}

class CustomPrintClass extends BaseClass {
    void pr(String msg) {
        System.out.println("**********");
        System.out.println(msg);
        System.out.println("**********");
    }
}
~~~
#Student CGPA
~~~
import java.util.Scanner;
public class Main {
    public static double gradePoint(int marks) {

        if (marks >= 80) return 4.00;
        else if (marks >= 75) return 3.75;
        else if (marks >= 70) return 3.50;
        else if (marks >= 65) return 3.25;
        else if (marks >= 60) return 3.00;
        else if (marks >= 55) return 2.75;
        else if (marks >= 50) return 2.50;
        else if (marks >= 45) return 2.25;
        else if (marks >= 40) return 2.00;
        else return 0.00;
    }
    public static String grade(double cgpa) {
        if (cgpa >= 4.00) return "A+";
        else if (cgpa >= 3.75) return "A";
        else if (cgpa >= 3.50) return "A-";
        else if (cgpa >= 3.25) return "B+";
        else if (cgpa >= 3.00) return "B";
        else if (cgpa >= 2.75) return "B-";
        else if (cgpa >= 2.50) return "C+";
        else if (cgpa >= 2.25) return "C";
        else if (cgpa >= 2.00) return "D";
        else return "F";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Student ID: ");
        String studentId = sc.nextLine();
        System.out.print("No. of courses: ");
        int n = sc.nextInt();
        int totalCredit = 0;
        double totalWeightedGP = 0.0;

        for (int i = 1; i <= n; i++) {
            System.out.print("C" + i + ": Credit (Max 3): ");
            int credit = sc.nextInt();
            System.out.print("CT (Max 30): ");
            int ct = sc.nextInt();
            System.out.print("AT (Max 10): ");
            int at = sc.nextInt();
            System.out.print("FE (Max 60): ");
            int fe = sc.nextInt();
            int totalMarks = ct + at + fe;
            double gp = gradePoint(totalMarks);
            totalCredit += credit;
            totalWeightedGP += credit * gp;
        }

        double cgpa = totalWeightedGP / totalCredit;
        String finalGrade = grade(cgpa);
        System.out.printf("\nStudent ID: %s\n Credit Taken: %d\n Credit Earned: %d\n CGPA: %.2f, Grade: %s\n",
                studentId, totalCredit, totalCredit, cgpa, finalGrade);
        sc.close();
    }
}
~~~
#Math Puzzle
~~~
import java.io.*;
import java.util.*;

public class MathPuzzle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter difficulty level (1-Easy, 2-Medium, 3-Hard): ");
        int level = sc.nextInt();

        String filename = "";
        if (level == 1) filename = "easy.txt";
        else if (level == 2) filename = "medium.txt";
        else if (level == 3) filename = "hard.txt";
        else filename = "easy.txt";

        int score = 0;
        try {
            BufferedReader br = new BufferedReader(new FileReader(filename));
            String question;

            while ((question = br.readLine()) != null) {
                System.out.println("Solve: " + question + " = ?");
                int answer = sc.nextInt();
                int correctAnswer = evaluate(question);

                if (answer == correctAnswer) {
                    System.out.println("Correct!\n");
                    score++;
                } else {
            System.out.println("Wrong! Correct answer is: " + correctAnswer + "\n");
                }
            }
            br.close();

         BufferedWriter bw = new BufferedWriter(new FileWriter("score.txt", true));
            bw.write(name + ": " + score + " points\n");
            bw.close();

            System.out.println("Your total score: " + score);
            System.out.println("Score saved in score.txt");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
    public static int evaluate(String expr) {
        String[] parts = expr.split(" ");
        int a = Integer.parseInt(parts[0]);
        int b = Integer.parseInt(parts[2]);
        String op = parts[1];

        switch (op) {
            case "+": return a + b;
            case "-": return a - b;
            case "*": return a * b;
            case "/": return a / b;
            case "%": return a % b;

            default: return 0;
        }
    }
}
~~~
