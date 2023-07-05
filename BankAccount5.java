import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void ADD(int amnt,int change){
        System.out.println(amnt+change);
    }
    public static void SUB(int amnt,int change){
        if(change>amnt){
            System.out.print("Insufficient Funds");
            return;
        }
        System.out.println(amnt-change);
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int amnt = sc.nextInt();
        int op = sc.nextInt();
        int change= sc.nextInt();
        switch(op){
            case 1:ADD(amnt,change); break;
            case 2:SUB(amnt,change); break;
        }
        return;
    }
}