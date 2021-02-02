package vehicule;

public class Chasseur extends Avion implements Motorise {

    private float puissance;

    public Chasseur (String model, int num, float poid, int altmax, float puiss){
        super(model, num, poid, altmax);
        this.puissance = puiss;
    }


    @Override
    public String toString(){
        String out = ("Vehicule -> Avion -> Chasseur ->\n Modele : " + modele + "\n Nombre places : " + nombrePlaces + "\n Poids : " + poids +"\n Altitude Maximale : " + altitudeMax + "\n Puissance : " + puissance + "\n Consommation : " + this.getConsomation() +  "\n"); 
        return (out);
    }


    public float getConsomation(){
        return this.puissance/this.poids;
    }
}