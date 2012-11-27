/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AMINE
 */
public class Fac {
    private String nom;
    private String[]personne;

    public String getNom() {
        return nom;
    }

    public String[] getPersonne() {
        return personne;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPersonne(String[] personne) {
        this.personne = personne;
    }

    public Fac(String nom, String[] personne) {
        this.nom = nom;
        this.personne = personne;
         this.personne=new String[personne.length];
        for(int i=0;i<personne.length;i++) {
            this.personne[i]=personne[i];
        }
    }
    /**
     *
     */
   

        
   }
