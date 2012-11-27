/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AMINE
 */
public class Etudiant extends personne {
   private String CNE;

    public Etudiant(String CNE, String nom, String prenom) {
        super(nom, prenom);
        this.CNE = CNE;
    }

   
    @Override
   public void afficher(){
       super.afficher();
       System.out.println("le CNE d'ETUDIANT est:" +CNE);
   }
   
   
}
