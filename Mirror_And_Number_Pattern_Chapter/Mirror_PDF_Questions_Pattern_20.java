package Mirror_And_Number_Pattern_Chapter;
import java.util.*;
public class Mirror_PDF_Questions_Pattern_20 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int row=1;
        int nsp1=n/2;
        int nsp2=-1;
        while(row<=n) {
        	// Space1
        	int i=1;
        	while(i<=nsp1) {
        		System.out.print(" ");
        		i++;
        	}
        	// Star
        	System.out.print("*");
        	// Between Space
        	int j=1;
        	while(j<=nsp2) {
        		System.out.print(" ");
        		j++;
        	}
        	// Star
        	if(row>=2&&row<n) {
        		System.out.print("*");       		
        	}
        	// Next row
        	// Mirror Concept
        	if(row<=n/2) {
        		nsp1--;
        		nsp2+=2;
        	}else {
        		nsp1++;
        		nsp2-=2;
        	}
        	row++;
        	System.out.println();
        }
	}

}
