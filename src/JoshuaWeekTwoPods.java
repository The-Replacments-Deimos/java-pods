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
//        Area is = 176.71458676442586
    }
}
