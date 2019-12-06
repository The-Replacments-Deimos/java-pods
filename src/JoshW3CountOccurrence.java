import java.io.*;
import java.util.*;

public class JoshW3CountOccurrence{
    public static void main(String a[]) throws Exception
    {

        int[] arr = new int[8];
        int countOccurrence = 0;
        Scanner scan=new Scanner(System.in);
        for(int i=0;i<8;i++)
        {
            System.out.println("Enter Number ["+i+"]:");
            arr[i]=scan.nextInt();
        }
        System.out.println("Enter a number which exist in the array:");
        int number = scan.nextInt();
        for(int i = 0; i<8; i++){
            if(number == arr[i]){
                countOccurrence++;
            }
        }
        //end
        System.out.println("Occurrence of "+number+" :");
        System.out.println(countOccurrence);


    }
}
//    Write a program to take input integer array and a single
//    integer number and find out the occurrence of this number in the array.
//
//        Example :
//        1.If user gives input array 12 15 15 16 14 45 23 15 and a integer 15 then the output should be :
//        Occurrence of 15 :3
//
//        2.If user gives input array 45 45 15 18 24 45 23 45 and a integer 45 then the output should be :
//        Occurrence of 45 :4