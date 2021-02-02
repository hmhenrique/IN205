package vehicule;

public class Avion extends Vehicule{

    protected int altitudeMax;

    public Avion (String model, int num, float poid, int altmax){
        super(model, num, poid);
        this.altitudeMax = altmax;
    }


    @Override
    public String toString(){
        String out = ("Vehicule -> Avion ->\n Modele : " + modele + "\n Nombre places : " + nombrePlaces + "\n Poids : " + poids +"\n Altitude Maximale : " + altitudeMax +  "\n"); 
        return (out);
    }
}