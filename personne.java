/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AMINE
 */
public class personne {
    
     private String nom;
    private String prenom;
    
    private Adresse a;
    /**
     *
     * @param nom
     * @param prenom
     * @param adresse
     */
    public personne(String nom, String prenom, Adresse a) {
        this.nom = nom;
        this.prenom = prenom;
        Adresse this.a=new Adresse();
    }

    public String getNom() {
        return nom;
    }

  
    public String getPrenom() {
        return prenom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

   
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    
    public void afficher(){
       System.out.println("voici le nom :"+nom+ "  et le prenom :"+prenom);
   }
    
    }
    
    


    

