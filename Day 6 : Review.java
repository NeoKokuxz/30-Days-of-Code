import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);

        int numberInput = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < numberInput; i++){
            String x = sc.nextLine();
            for(int j = 0; j < x.length(); j++)
            {

                if(j%2 == 0)
                {
                    System.out.print(x.charAt(j));
                }
            }
            System.out.print(" ");
            for( int j = 0; j < x.length(); j++)
            {
                if(j%2==1)
                {
                    System.out.print(x.charAt(j));
                }
            }
            System.out.println();
        }
        
    }
}

