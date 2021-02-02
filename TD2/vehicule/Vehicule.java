package vehicule;

public abstract class Vehicule{

    protected String modele;
    protected int nombrePlaces;
    protected float poids;

    static int nbVehicule = 0;

    public Vehicule ( String model, int num, float poid){
        this.modele = model;
        this.nombrePlaces = num;
        this.poids = poid;
        nbVehicule++;
    }


    public static int getNbVehicule(){
        return nbVehicule;
    }


    //Override ToString()

    @Override
    public String toString(){
        String out = ("Vehicule ->\n Modele : " + modele + " \n Nombre places : " + nombrePlaces + " \n Poids : " + poids + "\n"); 
        return (out);
    }
    
    //  getter et un setter
    public String GetModele(){
        return this.modele;
    }
    public void SetModele(String m){
        this.modele = m;
    }

    public int GetNombrePlaces(){
        return this.nombrePlaces;
    }
    public void  GetNombrePlaces(int n){
        this.nombrePlaces = n;
    }

    public float GetPoids(){
        return this.poids;
    }
    public void SetPoids(float p){
        this.poids = p;
    }

}