package Mirror_And_Number_Pattern_Chapter;
import java.util.*;
public class Number_Pattern_PDF_Questions_No_23 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
	        int n=sc.nextInt();
	        int row=1;
	        int num=1;
	        int nsp=n-1;
	        while(row<=n) {
	        	// Space
	        	int i=1;
	        	while(i<=nsp) {
	        		System.out.print("  ");
	        		i++;
	        	}
	        	// Num
	        	int j=1;
	        	while(j<=num) {
	        		System.out.print("1 ");	        		
	        		j++;
	        	}
	        	// Next Row Pre
	        	num+=2;
	        	nsp--;
	        	// Go next row
	        	row++;
	        	System.out.println();
	        }
	}

}
