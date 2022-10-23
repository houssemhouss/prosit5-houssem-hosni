package prosit3a23;

public class ProduitFruits extends ProduitAgricole {
	
	public ProduitFruits(float quantite, String saison, int identifiant, String libelle, String marque, float prix) {
        super(quantite, saison, identifiant, libelle, marque, prix);
    }

    @Override
    public boolean estFrais(String saison) {
        return this.saison.equals(saison);
    }
    
}


