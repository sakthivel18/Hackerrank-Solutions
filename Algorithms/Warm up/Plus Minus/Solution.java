import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float pos,neg,zer;
        int n = in.nextInt();
        int a[] = new int[n];
        pos=neg=zer=0;
        for(int i=0; i < n; i++){
            a[i] = in.nextInt();
            if(a[i]>0) pos++;
            else if(a[i]<0) neg++;
            else zer++;
            }
        System.out.println(pos/n);
        System.out.println(neg/n);
        System.out.println(zer/n);
    }
}
