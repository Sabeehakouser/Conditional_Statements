import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a==b && b==c) System.out.print("equilateral");
        else if((a==b && b!=c) ||(a==c && b!=c) || (c==b && a!=b) ) System.out.print("isosceles");
        else System.out.print("scalene");
        return;
    }
}