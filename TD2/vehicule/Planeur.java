package vehicule;

public class Planeur extends Avion{

    private float portance;

    public Planeur (String model, int num, float poid, int altmax, float lift){
        super(model, num, poid, altmax);
        this.portance = lift;
    }


    @Override
    public String toString(){
        String out = ("Vehicule -> Avion -> Planeur -> \n Modele : " + modele + "\n Nombre places : " + nombrePlaces + "\n Poids : " + poids +"\n Altitude Maximale : " + altitudeMax + "\n Portance : " + portance +  "\n"); 
        return (out);
    }
}