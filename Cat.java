public class Cat extends Pets
    {
    //private String nom;
    //private int age;
    //private Float prix;
    private Float catWeight;

    public Cat(char pP ,String pNom, int pAge, Float pPrix, Float pWeight)
    {
        super(pP, pNom, pAge, pPrix);
        this.catWeight=pWeight;
    //this.nom=pNom;
    //this.age=pAge;
    //this.prix=pPrix;
    //System.out.println("Je m'appelle "+ this.nom);
    //System.out.print("J'ai "+ this.age+ "ans");
    }

    public String getCatName(){
        return this.nom;
    }

    public void setCatName(String pNom){
        this.nom=pNom;
    }

    public int getCatAge(){
        return this.age;
    }
    
    public void setCatAge(int pAge){
        this.age=pAge;
    }

    public Float getCatPrix(){
        return this.prix;
    }

    public void setCatPrix(Float pPrix){
        this.prix=pPrix;
    }

    public Float getCatWeight(){
        return this.catWeight;
    }

    /*public String getSpecie(){
        return this.specie;
    }*/
}
