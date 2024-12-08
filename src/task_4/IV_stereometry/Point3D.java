package task_4.IV_stereometry;

class Point3D extends Point {
    private double z;

    // Конструкторы
    public Point3D() {
        super();
        this.z = 0;
    }

    public Point3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    // Методы
    public double getZ() {
        return z;
    }

    public void setLocation(double x, double y, double z) {
        super.setLocation(x, y);
        this.z = z;
    }

    @Override
    public String toString() {
        return "(" + getX() + ", " + getY() + ", " + z + ")";
    }

    // Метод для вычисления объема тетраэдра
    public static double calculateTetrahedronVolume(Point3D p1, Point3D p2, Point3D p3, Point3D p4) {
        // Определитель для вычисления объема
        double determinant =
                p1.getX() * (p2.getY() * (p3.getZ() - p4.getZ()) + p3.getY() * (p4.getZ() - p2.getZ()) + p4.getY() * (p2.getZ() - p3.getZ()))
                        - p2.getX() * (p1.getY() * (p3.getZ() - p4.getZ()) + p3.getY() * (p4.getZ() - p1.getZ()) + p4.getY() * (p1.getZ() - p3.getZ()))
                        + p3.getX() * (p1.getY() * (p2.getZ() - p4.getZ()) + p2.getY() * (p4.getZ() - p1.getZ()) + p4.getY() * (p1.getZ() - p2.getZ()))
                        - p4.getX() * (p1.getY() * (p2.getZ() - p3.getZ()) + p2.getY() * (p3.getZ() - p1.getZ()) + p3.getY() * (p1.getZ() - p2.getZ()));

        return Math.abs(determinant / 6.0);
    }
}
