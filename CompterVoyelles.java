import java.util.*;
public class CompterVoyelles {
    public static void main(String[] args){
        Scanner cl=new Scanner(System.in);
        int a=0, e=0, i=0, o=0, u=0, y=0, voyelles=0;
        String phrase=cl.nextLine();
        cl.close();
        for(int b=0; b<phrase.length(); ++b) {
            if ((phrase.charAt(b) == 'a') || (phrase.charAt(b) == 'A')) {
                a += 1;
            }
            if ((phrase.charAt(b) == 'e') || (phrase.charAt(b) == 'E')) {
                e += 1;
            }
            if ((phrase.charAt(b) == 'i') || (phrase.charAt(b) == 'I')) {
                i += 1;
            }
            if ((phrase.charAt(b) == 'o') || (phrase.charAt(b) == 'O')) {
                o += 1;
            }
            if ((phrase.charAt(b) == 'u') || (phrase.charAt(b) == 'U')) {
                u += 1;
            }
            if ((phrase.charAt(b) == 'y') || (phrase.charAt(b) == 'Y')) {
                y += 1;
            }
        }
            if(a!=0){
                System.out.println("a :"+a);
                voyelles+=a;
            }
            if(e!=0){
                System.out.println("e :"+e);
                voyelles+=e;
            }
            if(i!=0){
                System.out.println("i :"+i);
                voyelles+=i;
            }
            if(o!=0){
                System.out.println("o :"+o);
                voyelles+=o;
            }
            if(u!=0){
                System.out.println("u :"+u);
                voyelles+=u;
            }
            if(y!=0){
                System.out.println("y :"+y);
                voyelles+=y;
            }
            System.out.println("Le nombre total de voyelle est de: "+voyelles);
    }
}
