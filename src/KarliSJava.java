import java.sql.SQLOutput;
import java.util.Scanner;

public class KarliSJava {


    public static void main(String [] args){

//problem one, make a diamond
//
//        System.out.println("How many * would you like in your diamond?");
//        Scanner scan =  new Scanner(System.in);
//        int num = scan.nextInt();
//
//
//
//    for(int i = 1; i <= num; i ++){
//        for(int x = 0; x < i ; x++){
//        System.out.print("*");
//    }
//        System.out.println();
//    }
//
//    for(int i = num; i > 0; i--){
//        for(int x = 0; x < i ; x++){
//            System.out.print("*");
//        }
//        System.out.println();
//    }


    //problem number two

    System.out.println();

        String s = "The quick brown fox jumps over the lazy dog";

        boolean[] mark = new boolean[26];
        boolean pangram = true;
        int index = 0;

        for(int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            if(c >= 'A' && c <= 'Z'){
                index = c - 'A';
            } else if (c >= 'a' && c <= 'z'){
                index = c - 'a';
            }
            mark[index] = true;
        }

        for(int i = 0; i < mark.length; i++){
            if(mark[i] == false) {
                pangram = false;
            }
        }

        System.out.println(pangram);
}


}