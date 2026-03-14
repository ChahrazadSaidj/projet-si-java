public class Triangle extends Shape {

    public double base;
    public double hauteur;

    public Triangle(String nom, double base, double hauteur) {
        super(nom);
        this.base = base;
        this.hauteur = hauteur;
    }

    public void afficher() {
        System.out.println("Ceci est un triangle appelé " + nom +
                " avec base " + base +
                " et hauteur " + hauteur);
    }

    public double surface() {
        return (base * hauteur) / 2;
    }

}