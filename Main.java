package com.DamienDebroize;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        int i, nmbs;
        Scanner clavier=new Scanner(System.in);
        System.out.print("Entrer le nombre de rectangles à prendre en compte: ");
        nmbs=clavier.nextInt();
        Rectangle [] rectngl= new Rectangle[nmbs];
        for (i=0; i<nmbs; ++i){
            System.out.print("Entrer la valeur x de depart de rectangle "+i+" :");
            float x_a=clavier.nextFloat();
            System.out.print("Entrer la valeur x de fin de rectangle "+i+" :");
            float x_b=clavier.nextFloat();
            System.out.print("Entrer la valeur y de depart de rectangle "+i+" :");
            float y_a=clavier.nextFloat();
            System.out.print("Entrer la valeur y de fin de rectangle "+i+" :");
            float y_b=clavier.nextFloat();
            rectngl[i]= new Rectangle(x_a, x_b, y_a, y_b);
        }
        for (i=0; i<nmbs; ++i){
            System.out.printf("La longueur et la largeur du Rectangle %d sont %.2f et %.2f \n", i, rectngl[i].getLongueurRectangle(), rectngl[i].getLargeurRectangle());
            System.out.printf("Le périmetre du Rectangle %d est de : %.2f \n", i, rectngl[i].getPerimetre());
            System.out.printf("L'aire du rectangle %d est de : %.2f \n", i, rectngl[i].getAire());
        }
    }
}
