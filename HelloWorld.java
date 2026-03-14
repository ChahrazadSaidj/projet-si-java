public class HelloWorld {

    public static void main(String[] args) {

        Shape[] formes = new Shape[3];

        formes[0] = new Circle("MonCercle", 5);
        formes[1] = new Rectangle("MonRectangle", 4, 3);
        formes[2] = new Triangle("MonTriangle", 6, 2);

        for (int i = 0; i < formes.length; i++) {
            formes[i].afficher();
            System.out.println("Surface = " + formes[i].surface());
        }

    }

}