import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first_number = sc.nextInt();
        int second_number = sc.nextInt();
        // int max_number = first_number>second_number ? first_number : second_number;
        if(first_number>second_number) System.out.print(first_number);
        else System.out.print(second_number);
        return;
    }
}