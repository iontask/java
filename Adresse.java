/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AMINE
 */
public class Adresse {

    @Override
    public String toString() {
        return "Adresse{" + "Num=" + Num + ", Rue=" + Rue + ", Quartier=" + Quartier + ", Ville=" + Ville + '}';
    }

  
    private int Num;
    private String Rue;
    private String Quartier;
    private String Ville;

    /**
     *
     * @param Num
     * @param Rue
     * @param Quartier
     * @param Ville
     */
    public Adresse(int Num,String Rue, String Quartier, String Ville) {
        this.Num = Num;
        this.Rue = Rue;
        this.Quartier = Quartier;
        this.Ville = Ville;
    }
public Adresse()
{
    this.Num = 0;
        this.Rue = "";
        this.Quartier = "";
        this.Ville = "";
}

public Adresse(Adresse aa)
{
    this.Num = aa.Num;
        this.Rue = aa.Rue;
        this.Quartier = aa.Quartier;
        this.Ville = aa.Ville;
}
        
        
    public int getNum() {
        return Num;
    }

    public void setNum(int Num) {
        this.Num = Num;
    }

    public String getRue() {
        return Rue;
    }

    public void setRue(String Rue) {
        this.Rue = Rue;
    }

    public String getQuartier() {
        return Quartier;
    }

    public void setQuartier(String Quartier) {
        this.Quartier = Quartier;
    }

    public String getVille() {
        return Ville;
    }

    public void setVille(String Ville) {
        this.Ville = Ville;
    }

    
    
}