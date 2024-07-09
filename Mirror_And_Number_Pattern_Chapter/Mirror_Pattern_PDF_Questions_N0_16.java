package Mirror_And_Number_Pattern_Chapter;
import java.util.*;
public class Mirror_Pattern_PDF_Questions_N0_16 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int row=1;
        int nst=n;
        int nsp=n-1;
        while(row<=2*n-1) {
        	// Space
        	int i=1;
        	while(i<=nsp) {
        		System.out.print("  ");
        		i++;
        	}
        	// Star
        	int j=1;
        	while(j<=nst) {
        		System.out.print("* ");
        		j++;
        	}
        	// Next Row Pre
        	// Mirror Concept
        	if(row<n) {
        		nst--;
        		nsp--;
        	}else {
        		nst++;
        		nsp++;
        	}
        	// Go Next Row
        	row++;
        	System.out.println();       	
        }
	}

}
