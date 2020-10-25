import java.util.*;

public class FaireDesCercles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0, x, y, r;
		Scanner cl=new Scanner(System.in);
		System.out.println("entrer le nombre de cercles à prendre en compte: ");
		int nmbreCercles=cl.nextInt();
		Cercles[] liste=new Cercles[nmbreCercles];
		//char[] Crcles=new char[nmbreCercles];
		while (i<nmbreCercles)
		{
			System.out.print("Entrer la position en x de cercle "+(i+1)+": ");
			x=cl.nextInt();
			System.out.print("Entrer la position en y: "+(i+1)+":  ");
			y=cl.nextInt();
			System.out.print("Entrer la valeur du rayon r:  "+(i+1)+": ");
			r=cl.nextInt();
			liste[i]=new Cercles(x, y, r);
			i++;
		}
		i=0;
		while(i<nmbreCercles)
		{
			liste[i].afficher();
			System.out.println("perimetre de cerle "+(i+1)+" :"+liste[i].perimetre());
			System.out.println("Aire de cerle "+(i+1)+" :"+liste[i].aire());
			
			++i;			
		}
		System.out.println("Le cerle plus grande est le numero: "+CerclePlusGrand.plusGrandDesCercles(liste, nmbreCercles));
		i=0;
		while(i<nmbreCercles)
		{
			System.out.println("Agrandir le cercle "+(i+1)+":");
			liste[i].agrandir(cl.nextInt());
			++i;
		}
		i=0;
		while(i<nmbreCercles)
		{
			
			//float b=(float) liste[i].aire();
			System.out.println("Nouveau rayon du cercle"+" "+(i+1)+" :"+liste[i].getNewRayon());
			System.out.println("Nouveau perimetre de cerle "+(i+1)+" :"+liste[i].perimetre());
			System.out.println("Nouvelle Aire de cerle "+(i+1)+" :"+liste[i].aire());
			//System.out.println("rayon du cercle"+" "+(i+1)+" :"+b);
			++i;
		}
		System.out.println();
		//System.out.println("une ligne juste comme ça...");
		System.out.println("Le cerle plus grande est le numero: "+CerclePlusGrand.plusGrandDesCercles(liste, nmbreCercles));
		//CerclePlusGrand.plusGrandDesCercles(liste[], i, nmbreCercles)
		//Cercles A=new Cercles();
		/*A.afficher();
		System.out.println("Entrer la position en x: ");
		A.x=cl.nextInt();
		System.out.println("Entrer la position en y: ");
		A.y=cl.nextInt();
		System.out.println("Entrer la valeur du rayon r: ");
		A.r=cl.nextInt();
		A.afficher();
		
		double p=A.perimetre();
		System.out.println("Votre cercle est de perim"
				+ "etre : "+p);
		System.out.println("Entrer la nouvelle position en x: ");
		A.x=cl.nextInt();
		System.out.println("Entrer la nouvelle position en y: ");
		A.y=cl.nextInt();
		A.deplacer(A.x, A.y);
		System.out.println("Après deplacement : ");
		A.afficher();
		System.out.println("Entrer l'agrandissement du rayon r: ");
		A.r=cl.nextInt();
		A.agrandir(A.r);
		System.out.println("Après agrandissement : ");
		A.afficher();
		System.out.println("Votre cercle est de perimetre : "+A.perimetre());*/
		cl.close();
	}

}
