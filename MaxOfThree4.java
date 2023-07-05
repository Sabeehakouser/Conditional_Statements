import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static int maxOfThree(int a,int b,int c){
        if(a>b && a>c) return a;
        else if(b>a && b>c) return b;
        else if(c>a && c>b) return c;
        return a;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.print(maxOfThree(a,b,c)); 
        return;
    }
}