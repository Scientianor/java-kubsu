package task_4.III_geometry;

class Point3D extends Point {
    private int z;

    public Point3D() {
        super();
        this.z = 0;
    }

    public Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public void setLocation(int x, int y) {
        super.setLocation(x, y);
        this.z = 0;
    }

    public void setLocation(int x, int y, int z) {
        super.setLocation(x, y);
        this.z = z;
    }

    public int getZ() {
        return z;
    }

    @Override
    public String toString() {
        return "(" + getX() + "," + getY() + "," + z + ")";
    }

    @Override
    public int distanceFromOrigin() {
        return (int) Math.sqrt(getX() * getX() + getY() * getY() + z * z);
    }

    public boolean isInBox(Point3D corner1, Point3D corner2) {
        int x1 = Math.min(corner1.getX(), corner2.getX());
        int x2 = Math.max(corner1.getX(), corner2.getX());
        int y1 = Math.min(corner1.getY(), corner2.getY());
        int y2 = Math.max(corner1.getY(), corner2.getY());
        int z1 = Math.min(corner1.getZ(), corner2.getZ());
        int z2 = Math.max(corner1.getZ(), corner2.getZ());

        return getX() >= x1 && getX() <= x2
                && getY() >= y1 && getY() <= y2
                && getZ() >= z1 && getZ() <= z2;
    }

    public boolean isInSphere(Point3D center, int radius) {
        int dx = getX() - center.getX();
        int dy = getY() - center.getY();
        int dz = getZ() - center.getZ();
        return dx * dx + dy * dy + dz * dz <= radius * radius;
    }
}
