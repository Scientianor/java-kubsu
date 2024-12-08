package task_4.IV_stereometry;

public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(4, 0);
        Point p3 = new Point(0, 3);
        double area = Point.calculateTriangleArea(p1, p2, p3);
        System.out.println("Площадь треугольника: " + area);

        Point3D t1 = new Point3D(0, 0, 0);
        Point3D t2 = new Point3D(1, 0, 0);
        Point3D t3 = new Point3D(0, 1, 0);
        Point3D t4 = new Point3D(0, 0, 1);
        double volume = Point3D.calculateTetrahedronVolume(t1, t2, t3, t4);
        System.out.println("Объем тетраэдра: " + volume);
    }
}
