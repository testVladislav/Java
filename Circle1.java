/**
 * Круг
 */
public class Circle1 extends Shape {
    public Point point;
    public double radius;

    public Circle1(String name, Point point, double radius) {
        super(name);
        this.point = point;
        this.radius = radius;
    }

    @Override
    void show() {
        System.out.println("\n\t\tКруг " + name);
        System.out.println("с центром в точке: " + point);
        System.out.println("и радиусом: " + radius);
    }
}
