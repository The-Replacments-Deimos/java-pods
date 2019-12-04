import java.util.Scanner;

public class KarliSJava {


    public static void main(String [] args){

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
}



}
