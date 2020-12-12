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
		char continuer='o';
		Scanner clavier=new Scanner(System.in);
		while((continuer=='o')||(continuer=='O')) {
		System.out.print("Voulez-vous verifier une serie de nombre (s) ou un nombre seul (n):");
		choix=clavier.next().charAt(0); //clavier.next().charAt(0) methodes à retenir pour mettre en ploace des choix
		while((choix!='s')&&(choix!='n')) {
			//System.out.print("Voulez-vous verifier une serie de \n nombre ou un nombre seul S ou s pour une serie \n et n ou N pour un nombre seul: ");
			System.out.print("Voulez-vous verifier une serie de nombre (s) ou un nombre seul (n):");
			choix=clavier.next().charAt(0);
		}
		if((choix=='s')) {
			System.out.print("Entrer le nombre de valeur � v�rifier : ");
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
		else if(choix=='n') {
			System.out.print("Entrer le nombre � v�rifier : ");
			nmbrs=clavier.nextInt();
			if (EstPremier(nmbrs)) {
				System.out.printf("Le nombre %d est primaire\n", nmbrs);
			}
			else {
				System.out.printf("Le nombre %d n'est pas primaire\n", nmbrs);
			}
		}
		System.out.print("Continuer o ou O pour oui (toutes autres saisie pour terminer) :");
		continuer=clavier.next().charAt(0);
		//clavier.close();
}
		//while(continuer);
		System.out.printf("Programme terminé!");
		clavier.close();		
}
		
}
		