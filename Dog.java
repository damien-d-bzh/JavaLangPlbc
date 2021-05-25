public class Dog extends Pets{
    //private String nom;
    //private int age;
    //private Float prix;
    private Float dogWeight;
    

    public Dog(char pP ,String pNom, int pAge, Float pPrix, Float pWeight)
    {
        super(pP, pNom, pAge, pPrix);
        this.dogWeight=pWeight;
    //this.age=pAge;
    //this.prix=pPrix;
    //System.out.println("Je m'appelle "+ this.nom);
    //System.out.print("J'ai "+ this.age+ "ans");
    }

    public String getDogName(){
        return this.nom;
    }

    public void setDogName(String pNom){
        this.nom=pNom;
    }

    public int getDogAge(){
        return this.age;
    }
    
    public void setDogAge(int pAge){
        this.age=pAge;
    }

    public Float getDogPrix(){
        return this.prix;
    }

    public void setDogPrix(Float pPrix){
        this.prix=pPrix;
    }

    public Float getDogWeight(){
        return this.dogWeight;
    }

    /*public String getSpecie(){
        return this.specie;
    }*/
}

