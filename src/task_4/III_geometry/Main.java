package task_4.III_geometry;

public class Main {
    public static void main(String[] args) {
        Point3D point = new Point3D(1, 2, 3);
        System.out.println("Точка: " + point);
        System.out.println("Расстояние от места происхождения: " + point.distanceFromOrigin());

        Point3D corner1 = new Point3D(0, 0, 0);
        Point3D corner2 = new Point3D(5, 5, 5);
        System.out.println("В коробке: " + point.isInBox(corner1, corner2));

        Point3D center = new Point3D(0, 0, 0);
        System.out.println("Находится в сфере (радиус 5): " + point.isInSphere(center, 5));
    }
}
