package com.Damien;
import java.util.*;
public class DemandrID {

    public static String Prenom(Scanner sc){
        System.out.print("Entrer un prenom : ");
        String prenom= sc.nextLine();
        return prenom;
    }
    public static String Nom(Scanner sc){
        System.out.print("Entrer un nom : ");
        String nom= sc.nextLine();
        return nom;
    }
    public static float salaireActuel(Scanner sc){
        System.out.print("Entrer le salaire de départ de l'individue : ");
        float salaire = sc.nextFloat();
        //System.out.println("math.pow(anciennetée, taux) : "+Math.pow(anciennetee(sc), augmntationAnnuelle(sc)));
        salaire*=Math.pow(anciennetee(sc), augmntationAnnuelle(sc));
        boolean elligible;
        System.out.print("le salarie a-t-il le droit à une prime exceptionnelle 'true' or 'false': ");
        elligible=sc.nextBoolean();
        if (elligible!=false){
            System.out.print("Montant de la prime: ");
            float primeExceptnl= sc.nextFloat();
            salaire+=primeExceptnl;
            return salaire;
        }
        else {
            return salaire;
        }
    }
    public static int anciennetee(Scanner sc){
        System.out.print("Entrer le nombre d'année d'anciènnetée de l'individue : ");
        int ancienne= sc.nextInt();
        return ancienne;
    }
    public static float augmntationAnnuelle(Scanner sc){
        System.out.print("Entrer le taux d'augmentation annuel : ");
        float augmntationAnnuel= sc.nextFloat();
        return augmntationAnnuel;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nom : "+Prenom(sc)+" "+Nom(sc));
        //System.out.println("nom : "+Nom(sc));
        //System.out.println("anciennetée: "+ancienneteeMois(sc));
        System.out.println("salaire actuelle: "+salaireActuel(sc));
    }
    
}
