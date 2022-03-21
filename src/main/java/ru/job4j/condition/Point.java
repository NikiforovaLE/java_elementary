package ru.job4j.condition;

public class Point {

    private final int x;
    private final int y;
    private final int z;

    public Point(int x, int y) {
        this(x, y, 0);
    }

    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double distance(Point that) {
        return Math.sqrt(Math.pow(this.x - that.x, 2) + Math.pow(this.y - that.y, 2));
    }

    public double distance3D(Point that) {
        return Math.sqrt(Math.pow(this.x - that.x, 2) + Math.pow(this.y - that.y, 2) + Math.pow(this.z - that.z, 2));
    }

    public void info() {
        System.out.println("Point[" + this.x + ", " + this.y + "]");
    }

    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        System.out.println("the distance is " + a.distance(b) + " metres");
        a.info();
    }
}
