package vehicule;

public class Voiture extends Vehicule implements Motorise {

    private int nombrePortes;
    private Propulsion prop;
    private float puissance;

    public Voiture (String model, int num, float poid, int numper){
        super(model, num, poid);
        this.nombrePortes = numper;
        this.prop = Propulsion.DIESEL;
        this.puissance = 500; //
    }

    public Voiture (String model, int num, float poid, int numper, Propulsion propul, float puiss){
        this(model, num, poid, numper);
        this.prop = propul;
        this.puissance = puiss;
    }


    @Override
    public String toString(){
        String out = ("Vehicule -> Voiture -> \n Modele : " + modele + "\n Nombre places : " + nombrePlaces + "\n Poids : " + poids + "\n Nombre Portes : " + nombrePortes + "\n Propultion : " + prop + "\n Puissance : " + puissance + "\n Consumation : " + this.getConsomation() + "\n"); 
        return (out);
    }


    public float getConsomation(){
        float cons=0;
        switch(this.prop){
            case ESSENCE:
                cons = (this.puissance*5)/this.poids;
            break;
            case DIESEL:
                cons = (this.puissance*3)/this.poids;
            break;
        }
        return cons;
    }


}