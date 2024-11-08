public class MonstrePlante extends Monstre {

    // attribut
    private String typeMonstre;

    // constructeur
    public MonstrePlante(String nom, int hp, int atk, String typeMonstre) {
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
     * Méthode attaquer des Monstres de type plante qui infligent :
     * - 2x les dégâts aux monstres de type Eau
     * - 0.3x aux monstres de type Feu
     * - des dégâts normaux aux monstres de type Normal.
     * 
     * @param cible
     */

    public void attaquer(Monstre cible) throws Exception {
        if (cible.estMort()) {
            throw new Exception("Le monstre est mort !");
        }

        String classeDuMonstre = cible.getClass().getName();
        // [objet].getClass().getName() = pareil que "instanceof"
        System.out.println(classeDuMonstre);

        // Tant que le monstre n'est pas mort

        // Vérifie ici si la cible est une instance de la classe MonstreEau
        if (classeDuMonstre == "MonstreEau") {
            super.attaquer(cible);
            // Infliger Dégâts x2
            int atkFoisDeux = super.getAtk() * 2;
            // Prendre le Hp du monstre et y soustraire le résultat atkFoisDeux
            int hpApresAtkFoisDeux = super.getHp() - atkFoisDeux;
            System.out.println("Comme " + cible.getNom() + " est de type feu, il a reçu 2x plus de dégâts !");
            System.out.println(cible.getNom() + " a maintenant " + hpApresAtkFoisDeux + "HP restants après l'attaque !");
        }
        // Vérifie ici si la cible est une instance de la classe MonstreFeu
        else if (classeDuMonstre == "MonstreFeu") {
            super.attaquer(cible);
            // Infliger Dégâts x0.3
            float atkFoisZeroTrois = super.getAtk() * 0.3f;
            // Prendre le Hp du monstre et y soustraire le résultat atkFoisDeux
            float hpApresAtkFoisZeroTrois = super.getHp() - atkFoisZeroTrois;
            System.out.println("Comme " + cible.getNom() + " est de type feu, il a reçu x0.3 plus de dégâts !");
            System.out.println(cible.getNom() + " a maintenant " + hpApresAtkFoisZeroTrois + "HP restants après l'attaque !");
        } else {
            super.attaquer(cible);
        }

    }

    // methode toString()
    @Override
    public String toString() {
        return "MonstrePlante [typeMonstre=" + typeMonstre + ", getTypeMonstre()=" + getTypeMonstre() + ", getNom()="
                + getNom() + ", getHp()=" + getHp() + ", getAtk()=" + getAtk() + "]";
    }

}
