package task_4.III_geometry;

class Point {
    private int x;
    private int y;

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setLocation(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String toString() {
        return "(" + x + "," + y + ")";
    }

    public int distanceFromOrigin() {
        return (int) Math.sqrt(x * x + y * y);
    }

    public boolean isInRectangle(Point topLeft, Point bottomRight) {
        return x >= topLeft.getX() && x <= bottomRight.getX()
                && y >= topLeft.getY() && y <= bottomRight.getY();
    }

    public boolean isInCircle(Point center, int radius) {
        int dx = x - center.getX();
        int dy = y - center.getY();
        return dx * dx + dy * dy <= radius * radius;
    }
}
