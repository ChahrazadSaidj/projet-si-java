public class Rectangle extends Shape {

    public double largeur;
    public double hauteur;

    public Rectangle(String nom, double largeur, double hauteur) {
        super(nom);
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    public void afficher() {
        System.out.println("Ceci est un rectangle appelé " + nom +
                " avec largeur " + largeur +
                " et hauteur " + hauteur);
    }

    public double surface() {
        return largeur * hauteur;
    }

}