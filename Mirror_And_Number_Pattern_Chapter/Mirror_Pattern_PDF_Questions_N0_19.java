package Mirror_And_Number_Pattern_Chapter;
import java.util.*;
public class Mirror_Pattern_PDF_Questions_N0_19 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int row=1;
        int nst=n/2+1;
        int nsp=-1;
        while(row<=n) {
        	// Star
        	int i=1;
        	while(i<=nst) {
        		System.out.print("* ");
        		i++;
        	}
        	// Space
        	int j=1;
        	while(j<=nsp) {
        		System.out.print("  ");
        		j++;
        	}
        	// Star
        	int k=1;
        	if(row==1||row==n) {
        		k=2;
        	}
        	while(k<=nst) {
        		System.out.print("* ");
        		k++;
        	}
        	// Next Row
        	if(row<=n/2) {
        		nst--;
        		nsp=+2;      		
        	}else {
        		nst++;
        		nsp-=2;
        	}
        	// Go next Row
        	row++;
        	System.out.println();        	 
        }
	}

}
