package vehicule;

import java.util.ArrayList;

public class Test{

    public static void main(String[] args){

        ArrayList<Vehicule> lista = new ArrayList<Vehicule>();

        //Vehicule generic_vehicule = new Vehicule ("bike", 1, 100);
        //System.out.print(generic_vehicule + "\n");

        Voiture voiture = new Voiture ("clio", 5, 1000, 4);
        //System.out.print(voiture + "\n");

        Voiture voiture2 = new Voiture ("mustang", 5, (float)1500.4, 4, Propulsion.ESSENCE, 1000);
        //System.out.print(voiture2 + "\n");

        Avion avion = new Avion ("777", 550, 247200, 12930);
        //System.out.print(avion + "\n");

        Chasseur chasseur = new Chasseur ("chasseur", 2, 207200, 7000, 1500);
        //System.out.print(chasseur + "\n");

        Planeur planeur = new Planeur ("planeur", 4, 207200, 7000, 50);

        lista.add(voiture);
        lista.add(voiture2);
        lista.add(avion);
        lista.add(chasseur);
        lista.add(planeur);

        for (Vehicule v : lista){
            System.out.println(v);
        }

        System.out.println("Nb vehicules: " + Vehicule.getNbVehicule());

    }
}