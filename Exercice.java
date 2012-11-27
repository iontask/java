/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AMINE
 */
public class Exercice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        Etudiant etud=new Etudiant("TALHAOUI","Mohamed Amine","1245/14","xxxx");
        Enseignant ens=new Enseignant("ELIdrissi","Mohammed","1245B","yyyy");
        etud.afficher();
        ens.afficher();
    }
}

