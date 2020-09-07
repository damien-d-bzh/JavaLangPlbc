import java.util.*;
public class CompterVoyelles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0, e=0, i=0, o=0, u=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Entrer une phrase :");
		String phrase=sc.nextLine();
		for(int b=0; b<phrase.length(); ++b) {
			if(phrase.charAt(b)=='a'||phrase.charAt(b)=='A') {
				a+=1;
			}
			if(phrase.charAt(b)=='e'||phrase.charAt(b)=='E') {
				e+=1;
			}
			if(phrase.charAt(b)=='i'||phrase.charAt(b)=='I') {
				i+=1;
			}
			if(phrase.charAt(b)=='o'||phrase.charAt(b)=='O') {
				o+=1;
			}
			if(phrase.charAt(b)=='u'||phrase.charAt(b)=='U') {
				U+=1;
			}
		}
		System.out.println("a :"+a);
		System.out.println("e :"+e);
		System.out.println("i :"+i);
		System.out.println("o :"+o);
		System.out.println("u :"+u);

}
}
