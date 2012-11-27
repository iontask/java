/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AMINE
 */
public class Enseignant extends personne{
        private String ppR;

    public Enseignant(String ppR, String nom, String prenom) {
        super(nom, prenom);
        this.ppR = ppR;
    }

        
     @Override
        public void afficher(){
            super.afficher();
            System.out.println("le ppR d'Enseignant est:" +ppR);
        }
        
    }
