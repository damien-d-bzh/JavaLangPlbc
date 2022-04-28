package LesBases;

import java.util.Random;
import java.util.Scanner;

public class PapierPierreCiseaux {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Damien Debroize 28/04/2022 copywrite
		 * Ce n'est que ma première version en java du jeu de Pierre Papier ciseaux.
		 * Il Y aurait encore pas mal de chose à ameliorer, notamment pour ce qui est
		 * de la gestion d'erreur. A suivre.
		 */
		Scanner clv=new Scanner(System.in);
		Random randNb=new Random();
		int opposition;
		int i=0;
		int score=0;
		while(i<5) {
		opposition=randNb.nextInt(2)+1;
		System.out.println("Choisissez entre: ");
		System.out.println("1 : Papier");
		System.out.println("2 : Pierre");
		System.out.println("3 : Ciseaux");
		int choix=clv.nextInt();
		while(choix!=1 & choix!=2 & choix!=3) {
			System.out.println("Choix entre 1 ou 2 ou 3 ! :");
			choix=clv.nextInt();
		}
		//System.out.println(bataille(choix, opposition));
		score+=bataille(choix, opposition);
		System.out.println();
		++i;
		}
		if (score>0) {
			System.out.println("Match gagné");
		}
		else if (score<0) {
			System.out.println("Match perdu");
		}
		else {
			System.out.println("Match nul");
		}
		clv.close();
	}
	public static int bataille(int choix, int oppo) {
		if(choix==1 & oppo==2) {
			System.out.print("Gagné: Papier");
			return 1;
		}
		else if (choix==1 & oppo==3) {
			System.out.println("Perdu: Ciseaux");
			return -1;
		}
		else if (choix==2 & oppo==1) {
			System.out.println("Perdu: Papier");
			return -1;
		}
		else if (choix==2 & oppo==3) {
			System.out.println("Gagné: Pierre");
			return 1;
		}
		else if (choix==3 & oppo==1) {
			System.out.println("Gagné: Ciseaux");
			return 1;
		}
		else if (choix==3 & oppo==2) {
			System.out.println("Perdu: Pierre");
			return -1;
		}
		else {
			System.out.println("coup nul");
			return 0;
		}
	}

}
