package model;

import ensta.utils.*;

public class Film 
{
    private int id;
    private String titre;
    private String realisateur;

    public Film() { }
    public Film(int id_, String titre_, String realisateur_){
        this.id = id_;
        this.titre = titre_;
        this.realisateur = realisateur_;
    }

    public void setId(int id_){
        this.id = id_;
    }

    public void setTitre(String titre_){
        this.titre = titre_;
    }

    public void setRealisateur(String realisateur_){
        this.realisateur = realisateur_;
    }

    public int getId(){
        return this.id;
    }

    public String getTitre(){
        return this.titre;
    }

    public String getRealisateur(){
        return this.realisateur;
    }
}
