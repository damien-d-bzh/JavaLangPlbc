public class Pets {
    protected String nom;
    protected int age;
    protected Float prix;
    protected String specie;
    
    
    public Pets(char pP ,String pNom, int pAge, Float pPrix){
        this.nom=pNom;
        this.age=pAge;
        this.prix=pPrix;
        if(pP=='c'||pP=='C'){
            this.specie="Chat";
        }
        else if(pP=='d'||pP=='D'){
            this.specie="Chient";
        }
    }

    /*public void getSpecie(){
        if(this.s=='c'||this.s=='C'){
            System.out.print(this.specie);
        }
        else if(this.s=='d'||this.s=='D'){
            System.out.print(this.specie);
        }
    }*/
}
