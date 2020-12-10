import java.util.*;
public class DistanceSeveralPoints{

    public static float abscisse(Scanner cl, int i){
        System.out.print("Entre l'abscisse du point "+(i+1)+" :");
        float absc=cl.nextFloat();
        return absc;
    }

    public static float ordonnee(Scanner cl, int i){
        System.out.print("Entre l'ordonnée du point "+(i+1)+" :");
        float ordon=cl.nextFloat();
        return ordon;
    }

    public static double distance(float absci[], float ordonn[], int i){
        double SqrtAbsc=Math.pow(((double)absci[i+1]-(double)absci[i]), (double)2.0);
        double SqrtOrdon=Math.pow(((double)ordonn[i+1]-(double)ordonn[i]),(double)2.0);
        double distancedf=Math.sqrt(SqrtAbsc+SqrtOrdon);
        //System.out.print("Distance between the two points : "+distancedf);
        return distancedf;
    }

    public static double distanceFirstlastPoint(float absci[], float ordonn[], int i){
        double SqrtAbscFL=Math.pow(((double)absci[0]-(double)absci[i-1]), (double)2.0);
        double SqrtOrdonFL=Math.pow(((double)ordonn[0]-(double)ordonn[i-1]),(double)2.0);
        double distanceFLPoint=Math.sqrt(SqrtAbscFL+SqrtOrdonFL);
        return distanceFLPoint;
    }

    public static void main(String[] args) {
        // write your code here
        Scanner cl=new Scanner(System.in);
        System.out.print("Entrer le nombre de points à prendre en compte: ");
        int nbrsPoints=cl.nextInt();
        double distance=0.0;
        float absci[]=new float[nbrsPoints];
        float ordonn[]=new float[nbrsPoints];
        for(int i=0; i<nbrsPoints; ++i){
            absci[i]=abscisse(cl, i);
            //System.out.println(absci[i]);
            ordonn[i]=ordonnee(cl, i);
            //System.out.println(ordonn[i]);
        }
        for(int i=0; i<(nbrsPoints-1); ++i){
            //float absciD=absci[i];
            //float absciF=absci[i+1];
            //float ordonnD=ordonn[i];
            //float ordonnF=ordonn[i+1];
            System.out.printf("La distance entre les deux point %d et %d: %.2f \n", i, (i+1), distance(absci, ordonn, i));
            distance+=distance(absci, ordonn, i);
            System.out.printf("Distance totale :"+distance);
        }
        System.out.println("La distance entre le premier et le dernier point est de : "+distanceFirstlastPoint(absci, ordonn, nbrsPoints));
    }
}

