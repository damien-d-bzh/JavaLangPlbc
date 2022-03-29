import java.util.Scanner;

//your code goes here
class Converter{
    // création d'un méthode public static (puisque appelée par la
    // class elle-même et non pas une instanciation de la classe.
    // renvoie:String pour la convertion concrete de la valeur
    // nombre en binaire
    public static String toBinary(int num){
        String binary="";
        //Création d'un bjet String pour l'affichage de la variable
        //binary; puis, ci-dessous, decomposition de la valeur du
        //parametre nombre en valeur binaire ar l'utilisation de: num%2.
        //Le tout avec une concaténantion incrémentielle à la variable binary.
        while(num>0){
            binary=(num%2)+binary;
            num/=2;
        }
        return binary;
    }
}


public class BinaryConverter {
    public static void main(String[ ] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.print(Converter.toBinary(x));
    }
}
