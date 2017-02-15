import java.util.Scanner;

public class PDF_Viewer {
	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int[] h = {4 ,2 ,1 ,2 ,3 ,4 ,3 ,7 ,4 ,1 ,5 ,6 ,1 ,3 ,2 ,6 ,6 ,3 ,7 ,3 ,1 ,1 ,5 ,1 ,1 ,4};
	        /*int h[] = new int[n];
	        for(int h_i=0; h_i < n; h_i++){
	            h[h_i] = in.nextInt();
	        }*/
	        String word = "qjhwkcexec";
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
