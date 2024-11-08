public class Monstre {
    // attributs

    private String nom;
    private int hp;
    private int atk;

    // constructeur
    public Monstre(String nom, int hp, int atk) {
        this.nom = nom;
        this.hp = hp;
        this.atk = atk;
    }

    /*
     * Implémentez une méthode estMort() qui retourne un booléen pour indiquer si le
     * monstre est mort.
     * Implémentez une méthode attaquer(Monstre cible) qui permet au monstre
     * d'attaquer un autre monstre :
     * 
     */

    // méthode estMort(
    /**
     * Méthode qui retourne un booléen pour indique si le monstre est mort
     */
    public boolean estMort() {
        return this.hp <= 0;
    }

    // méthode attaquer()
    /**
     * Méthode qui permet au monstre d'attaquer un autre monstre
     * 
     * @param cible
     */
    public void attaquer(Monstre cible) throws Exception {
        if (estMort()) {
            throw new Exception("Le monstre est mort !");
        }

        // Si monstre adverse pas encore mort, il attaque
        atk = this.getAtk();
        System.out.println(this.nom + " attaque " + cible.getNom() + " !!!");
        // Soustrait le HP avec les dégats infligés
        int hpApresAtk = hp -= atk;
        System.out.println(cible.getNom() + " a perdu " + hpApresAtk + " de HP !!! \n" + cible.getNom() + " reste : " + this.hp
                + " restants.");
    }

    // getters et setters

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    @Override
    public String toString() {
        return "Monstre [nom=" + nom + ", hp=" + hp + ", atk=" + atk + "]";
    }

    // méthode toString()

}