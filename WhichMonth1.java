import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String res="";
        switch(num){
            case 1: res="January"; break;
            case 2: res="February"; break;
                case 3: res="March"; break;
                case 4: res="April"; break;
                case 5: res="May"; break;
                case 6: res="June"; break;
                case 7: res="July"; break;
                case 8: res="August"; break;
                case 9: res="September"; break;
                case 10: res="October"; break;
                case 11: res="November"; break;
                case 12: res="December"; break;
        }
        System.out.print(res);
        return;
    }
}