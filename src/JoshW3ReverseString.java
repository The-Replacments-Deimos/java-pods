import java.util.Scanner;

class JoshW3ReverseString {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string to reverse:");
        String str = scanner.next();

        String reverse = "";

        for(int i = str.length() -1; i >= 0; i--){
            reverse = reverse + str.charAt(i);
        }
        System.out.printf("The reversed string is: %s", reverse);

    }

}
