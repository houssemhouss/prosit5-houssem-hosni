package prosit3a23;




public abstract class ProduitAgricole extends ProduitAliementaire implements Critere{
    
    float quantite;
    String saison;

    public ProduitAgricole(float quantite, String saison, int identifiant, String libelle, String marque, float prix) {
        super(identifiant, libelle, marque, prix);
        this.quantite = quantite;
        this.saison = saison;
    }

    

  
    
    
}