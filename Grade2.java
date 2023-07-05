import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        // If percentage >= 90% : Grade A If percentage >= 80% but <90 : Grade B If percentage >= 70% but <80: Grade C If percentage >= 60% but <70: Grade D If percentage >= 40% but <60: Grade E If percentage < 40%: Grade F
        Scanner sc = new Scanner(System.in);
        int i=0,sum=0;
        while(i<5){
            int a= sc.nextInt();
            sum+=a;
            i++;
        }
        double sum_=(sum*100.0/500.0);
        sum = (int)sum_;
        String ch="";
        if(sum_>=90) ch=" A";
        else if(sum_>=80 && sum_<90) ch="B";
        else if(sum_>=70 && sum_<80) ch="C";
        else if(sum_>=60 && sum_<70) ch="D";
        else if(sum_>=40 && sum_<60) ch="E";
        else ch="F";
        System.out.println(sum);
        System.out.println(ch);
        return;
    }
}