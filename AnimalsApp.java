import java.util.Scanner;

public class AnimalsApp {
    public static void main(String[] args){
        int nomberOfPets, catAge, dogAge;
        float catPrix, dogPrix, catWeight, dogWeight;
        String catName, dogName;
        char p;
        Scanner clavier=new Scanner(System.in);
        System.out.print("Entrer le nombre de chat à stocker dans le tableau: ");
        nomberOfPets=clavier.nextInt();
        Pets[] TableauPets=new Pets[nomberOfPets];
        for(int i=0; i<nomberOfPets; ++i){
            System.out.print("Entrer D pour chien ou C pour chat:");
            p=clavier.next().charAt(0);
            if(p=='D'){
            System.out.print("Entrer le nom du chien: ");
            dogName=clavier.next();
            System.out.print("Entrer l'age du chien: ");
            dogAge=clavier.nextInt();
            System.out.print("Entrer le prix du chien: ");
            dogPrix=clavier.nextFloat();
            System.out.print("Entrer la poid du chien: ");
            dogWeight=clavier.nextFloat();
            TableauPets[i] =new Dog(p ,dogName, dogAge, dogPrix, dogWeight);
            }
            if(p=='C'){
                System.out.print("Entrer le nom du chat: ");
                catName=clavier.next();
                System.out.print("Entrer l'age du chat: ");
                catAge=clavier.nextInt();
                System.out.print("Entrer le prix du chat: ");
                catPrix=clavier.nextFloat();
                System.out.print("Entrer le poid du chat: ");
                catWeight=clavier.nextFloat();
                TableauPets[i] =new Cat(p ,catName, catAge, catPrix, catWeight);
            }
        }
        for(int i=0; i<nomberOfPets; ++i){
            System.out.println(TableauPets[i].specie+" "+TableauPets[i].nom+" "+TableauPets[i].age+" "+TableauPets[i].prix);
        }
        //System.out.println();
        //System.out.println("Ce chat s'appelle "+Chat1.nom);
    }

}
