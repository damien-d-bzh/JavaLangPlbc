import java.util.*;
public class SapinTronc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int height, blank, asterix, i, j;
		Scanner clavier=new Scanner(System.in);
		System.out.print("Entrer la hauteur de sapin: ");
		height=clavier.nextInt();
		i=1;
		while (i<=height) {
			blank=height-i;
			j=1;
			while (j<=blank) {
				System.out.print(' ');
				++j;
			}
			j=1;
			asterix=i+(i-1);
			while (j<=asterix) {
				System.out.print("*");
				++j;
			}
			System.out.print("\n");
		++i;
		}
		i=1;
		while(i<4) {
		j=1;
		while(j<(height-1)) {
			System.out.print(' ');
			++j;
		}
		j=1;
		while(j<=3) {
			System.out.print("*");
			++j;
		}
		System.out.print("\n");
		++i;
		}
		clavier.close();
	}
	
}
