import java.util.Scanner;

public class PDF_Viewer {
	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = 26;
	        int h[] = new int[n];
	        for(int h_i=0; h_i < n; h_i++){
	            h[h_i] = in.nextInt();
	        }
	        String word = in.next();
	        word = word.toUpperCase();
	        int max = h[0];
	        for(int i=0;i<word.length();i++)
	            {
	             if(h[word.charAt(i)-65]>=max)
	             { 
	            	 max = h[word.charAt(i)-65];
	             	
	             }
	        }
	        System.out.println(word.length()*max);
	        
	        
	    in.close();
	 }}
