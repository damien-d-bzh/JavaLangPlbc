import java.util.*;
public class DistanceSeveralPoints{

    public static float abscisse(Scanner cl, int i){
        System.out.print("Entre l'abscisse du point "+(i+1)+" :");
        float absc=cl.nextFloat();
        return absc;
    }

    public static float ordonnee(Scanner cl, int i){
        System.out.print("Entre l'abscisse du point "+(i+1)+" :");
        float ordon=cl.nextFloat();
        return ordon;
    }

    public static double distance(float absciD, float absciF, float ordonnD, float ordonnF){
        double SqrtAbsc=Math.pow(((double)absciF-(double)absciD),(double)2.0);
        double SqrtOrdon=Math.pow(((double)ordonnF-(double)ordonnD), (double)2.0);
        double distancedf=Math.sqrt(SqrtAbsc+SqrtOrdon);
        //System.out.print("Distance between the two points : "+distancedf);
        return distancedf;
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
            float absciD=absci[i];
            float absciF=absci[i+1];
            float ordonnD=ordonn[i];
            float ordonnF=ordonn[i+1];
            System.out.println("La distance entre les deux point i et i+1: "+distance(absciD, absciF, ordonnD, ordonnF));
            distance+=distance(absciD, absciF, ordonnD, ordonnF);
            System.out.println("Distance totale :"+distance);
        }
    }
}
