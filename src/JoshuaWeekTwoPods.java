import java.sql.SQLOutput;
import java.util.Scanner;
public class JoshuaWeekTwoPods {
    public static void main(String[] args) {
//        7. Write a Java program that takes a number as input and
//        prints its multiplication table up to 10.
//        Input a number: 8
//        Expected Output :
//        8 x 1 = 8
//        8 x 2 = 16
//        8 x 3 = 24
//        ...
//        8 x 10 = 80

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number that will be multiplied by 1 though 10.");
        int userNum = sc.nextInt();
        for(int i = 0; i <= userNum; i++){
            int newNum = userNum * i;
            System.out.printf("%d x %d = %d%n", userNum, i, newNum);
        }


//        Write a Java program to print the area and perimeter of a circle.
//        Radius = 7.5
//        Expected Output
//        Perimeter is = 47.12388980384689
//        Area is = 176.71458676442586 // A=πr2  C=2πr

        System.out.println("Please enter the radius of the circle you'd like to find the area and perimeter for.");
        double radius = sc.nextFloat();

        double area = Math.PI * Math.pow(radius, 2);
        double perimeter = (2 * Math.PI) * radius;

        System.out.printf("The radius equals: %f%n", area);
        System.out.printf("The perimeter equals: %f%n", perimeter);

        // Program to find the sum of natural numbers from 1 to 1000.
//        When you run the program, the output will be:
//
//        Sum = 500500

        int sum = 0;
        for(int i = 1; i <= 1000; i++){

            sum += i;
            int sumTotal = sum + i;
            System.out.printf("%dth iteration: sum = %d%n", i, sum);
        }


    }
}
