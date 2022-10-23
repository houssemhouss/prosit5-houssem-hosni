package prosit3a23;

public class ProduitLegumes extends ProduitAgricole {

    String[] mois = {"janvier", "février", "mars", "avril", "mai", "juin", "juillet", "août", "septembre", "octobre", "novembre", "décembre", "janvier"};

    public ProduitLegumes(float quantite, String saison, int identifiant, String libelle, String marque, float prix) {
        super(quantite, saison, identifiant, libelle, marque, prix);
    }

    @Override
    public boolean estFrais(String saison) {
        int indexOfSaison = 0;
        for (int i = 0; i < mois.length - 1; i++) {
            if (mois[i].equals(this.saison)) {
                indexOfSaison = i;
            }
        }
        if (saison.equals(mois[indexOfSaison]) || saison.equals(mois[indexOfSaison + 1])) {
            return true;
        }
        return false;

    }

}
