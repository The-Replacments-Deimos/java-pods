import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Arrays;

public class KarliSJava {


    public static void main(String[] args) {
//public int chickens;
//public int cows;
//public int pigs;
//problem one, make a diamond

        System.out.println("How many * would you like in your diamond?");
        Scanner scan =  new Scanner(System.in);
        int num = scan.nextInt();



    for(int i = 1; i <= num; i ++){
        for(int x = 0; x < i ; x++){
        System.out.print("*");
    }
        System.out.println();
    }

    for(int i = num; i > 0; i--){
        for(int x = 0; x < i ; x++){
            System.out.print("*");
        }
        System.out.println();
    }


        //problem number two

        System.out.println();

        String s = "The quick brown fox jumps over the lazy dog";

        boolean[] mark = new boolean[26];
        boolean pangram = true;
        int index = 0;

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            if (c >= 'A' && c <= 'Z') {
                index = c - 'A';
            } else if (c >= 'a' && c <= 'z') {
                index = c - 'a';
            }
            mark[index] = true;
        }

        for (int i = 0; i < mark.length; i++) {
            if (mark[i] == false) {
                pangram = false;
            }
        }

        System.out.println(pangram);


//The farmer has counted his animals and he gives you a subtotal for each species. You have to implement a function that returns the total number of legs of all the animals.
        System.out.println("how many chickens is there?");
        int chickens = scan.nextInt();
        System.out.println("how many cows is there?");
        int cows = scan.nextInt();
        System.out.println("how many pigs is there?");
        int pigs = scan.nextInt();

            int chickenLegs = chickens * 2;
            int cowLegs = cows * 4;
            int pigLegs = pigs * 4;
            int totalLegs = chickenLegs + cowLegs + pigLegs;
//        System.out.println(chickens * 2 + (cows + pigs) * 4);
//        System.out.println(animals(chickens * 2 + (cows + pigs) * 4));
            System.out.println(chickenLegs + cowLegs + pigLegs);
        System.out.printf("there are %d chickens, %d cows, and %d pigs. In total, they have %d legs", chickens, cows, pigs, totalLegs);
//

    }
}

