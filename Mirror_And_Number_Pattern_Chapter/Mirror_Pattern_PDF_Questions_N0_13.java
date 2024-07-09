package Mirror_And_Number_Pattern_Chapter;
import java.util.*;
public class Mirror_Pattern_PDF_Questions_N0_13 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int nst = 1;
		while (row <= 2 * n - 1) {
		// Star
			int i=1;
			while(i<=nst) {
				System.out.print("* ");
				i++;
			}
			// Next Row Pre
			// Mirror
			if(row<n) {
				nst++;				
			}else {
				nst--;
			}
			// Go Next Row
			row++;
			System.out.println();
		}
	}
}
