public class MonstreFeu extends Monstre {

    // attribut

    private String typeMonstre;

    // constructeur

    public MonstreFeu(String nom, int hp, int atk, String typeMonstre) {
        super(nom, hp, atk);
        this.typeMonstre = typeMonstre;
    }

    // getter et setter
    public String getTypeMonstre() {
        return typeMonstre;
    }

    public void setTypeMonstre(String typeMonstre) {
        this.typeMonstre = typeMonstre;
    }

    /**
     * Méthode attaquer des Monstres de type feu qui infligent :
     * - 2x les dégâts aux monstres de type Plante
     * - 0.5x aux monstres de type Eau
     * - des dégâts normaux aux monstres de type Normal.
     * 
     * @param cible
     */
    public void attaquer(Monstre cible) throws Exception {
        if (cible.estMort()) {
            throw new Exception("Le monstre est mort !");
        }

        // Vérifie ici si "cible" est une instance de la classe MonstrePlante
        if (cible instanceof MonstrePlante) {
            super.attaquer(cible);
            // Infliger Dégâts x2
            int atkFoisDeux = super.getAtk() * 2;
            // Prendre le Hp du monstre et y soustraire le résultat atkFoisDeux
            int hpApresAtkFoisDeux = super.getHp() - atkFoisDeux;
            System.out.println("Comme " + cible.getNom() + " est de type plante, il a reçu 2x plus de dégâts !");
            System.out.println(cible.getNom() + " a maintenant " + hpApresAtkFoisDeux + "HP restants après l'attaque !");
        }
        // Vérifie ici si la cible est une instance de la classe MonstreEau
        else if (cible instanceof MonstreEau) {
            super.attaquer(cible);
            // Infliger Dégâts x0.5
            float atkFoisZeroCinq = super.getAtk() * 0.5f;
            // Prendre le Hp du monstre et y soustraire le résultat atkFoisDeux
            float hpApresAtkFoisZeroCinq = super.getHp() - atkFoisZeroCinq;
            System.out.println("Comme " + cible.getNom() + " est de type eau, il a reçu 2x plus de dégâts !");
            System.out.println(cible.getNom() + " a maintenant " + hpApresAtkFoisZeroCinq + "HP restants après l'attaque !");
        } else {
            super.attaquer(cible);
        }

        if (cible.getHp() == 0) {
            cible.estMort();
        }
    }

    // méthode toString()
    @Override
    public String toString() {
        return "MonstreFeu [typeMonstre=" + typeMonstre + ", getTypeMonstre()=" + getTypeMonstre() + ", getNom()="
                + getNom() + ", getHp()=" + getHp() + ", getAtk()=" + getAtk() + "]";
    }

}
