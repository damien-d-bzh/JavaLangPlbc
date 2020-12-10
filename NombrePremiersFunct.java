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
		
		int i, nmbrs, choix;
		boolean continuer=true;
		Scanner clavier=new Scanner(System.in);
		while(continuer) {
		System.out.print("Voulez-vous verifier une serie de nombre (1) ou un nombre seul (2):");
		choix=clavier.nextInt();
		while((choix!=1)&&(choix!=2)) {
			//System.out.print("Voulez-vous verifier une serie de \n nombre ou un nombre seul S ou s pour une serie \n et n ou N pour un nombre seul: ");
			System.out.print("Voulez-vous verifier une serie de nombre (1) ou un nombre seul (2):");
			choix=clavier.nextInt();
		}
		if((choix==1)) {
			System.out.print("Entrer le nombre de valeur à vérifier : ");
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
		}
		else if(choix==2) {
			System.out.print("Entrer le nombre à vérifier : ");
			nmbrs=clavier.nextInt();
			if (EstPremier(nmbrs)) {
				System.out.printf("Le nombre %d est primaire\n", nmbrs);
			}
			else {
				System.out.printf("Le nombre %d n'est pas primaire\n", nmbrs);
			}
		}
		System.out.print("Continuer true/false :");
		continuer=clavier.nextBoolean();
		//clavier.close();
}
		//while(continuer);
		clavier.close();		
}
		
}
		