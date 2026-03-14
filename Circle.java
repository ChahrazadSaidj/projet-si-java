public class Circle extends Shape {

    public double rayon;

    public Circle(String nom, double rayon) {
        super(nom);
        this.rayon = rayon;
    }

    public void afficher() {
        System.out.println("Ceci est un cercle appelé " + nom + " avec un rayon de " + rayon);
    }

    public double surface() {
        return Math.PI * rayon * rayon;
    }

}