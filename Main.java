public class Main {
    public static void main(String[] args) {
        MonstreFeu salameche = new MonstreFeu("Salameche", 250, 35, "Feu");
        MonstrePlante vipelierre = new MonstrePlante("Vipelierre", 300, 40, "Plante");
        MonstreEau tiplouf = new MonstreEau("Tiplouf", 150, 20, "Eau");
        Monstre canarticho = new Monstre("Canarticho", 200, 25);

        /*
         * System.out.println(salameche.toString());
         * System.out.println(vipelierre.toString());
         * System.out.println(tiplouf.toString());
         * System.out.println(canarticho.toString());
         */

        /*
         * Test combat Type Plante VS Type Eau
         * while (!tiplouf.estMort() && !vipelierre.estMort()) {
         * try {
         * tiplouf.attaquer(vipelierre);
         * vipelierre.attaquer(tiplouf);
         * 
         * } catch (Exception exception) {
         * System.err.println(exception.getMessage());
         * }
         * }
         * if(tiplouf.getHp() <= 0){
         * tiplouf.estMort();
         * }
         * else{
         * vipelierre.estMort();
         * }
         */

        while (!salameche.estMort() && !vipelierre.estMort()) {
            try {
                vipelierre.attaquer(salameche);
                salameche.attaquer(vipelierre);

            } catch (Exception exception) {
                System.err.println(exception.getMessage());
            }

            
        }
        if (vipelierre.getHp() <= 0) {
            vipelierre.estMort();
        } else {
            salameche.estMort();
        }

    }
}