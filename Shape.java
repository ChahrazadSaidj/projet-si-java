public class Shape {

    public String nom;

    public Shape(String nom) {
        this.nom = nom;
    }

    public void afficher() {
        System.out.println("Ceci est une forme appelée " + nom);
    }

    public double surface() {
        return 0;
    }

}