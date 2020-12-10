import java.util.*;

public class NombrePremiersFunct {
		
	public static boolean EstPremier(int a) {
		boolean estPrime=false;
		if((a==1)||(a==2)||(a==3)||(a==5)||(a==7)||(a==11)||(a==13)) return estPrime=true;
		
		else if ((a%2==0)||(a%3==0)||(a%5==0)||(a%7==0)||(a%11==0)||(a%13==0)) return estPrime;			
		
		else return estPrime=true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i, nmbrs;
		Scanner clavier=new Scanner(System.in);
		System.out.print("Entrer le nombre de valuer à vérifier : ");
		nmbrs=clavier.nextInt();
	
	i=1;
	while(i<=nmbrs)
	{
		if (EstPremier(i)) {
			System.out.printf("Le nombre %d est premier!\n", i);
		}
		else {
			System.out.printf("le nombre %d n'est pas premier!\n", i);
		}
		++i;
	}
	clavier.close();
}
}