public class Vector {
    private double x1, y1, z1, x2, y2, z2;
    //x1, y1, z1 - начало вектора
    //x2, y2, z2 - конец вектора

    public Vector(double x1, double x2, double y1, double y2, double z1, double z2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
        this.z1 = z1;
        this.z2 = z2;
    }

    public double getX1() {
        return x1;
    }

    public double getY1() {
        return y1;
    }

    public double getZ1() {
        return z1;
    }

    public double getX2() {
        return x2;
    }

    public double getY2() {
        return y2;
    }

    public double getZ2() {
        return z2;
    }

    public double findLengthOfVector() { //найти длину вектора
        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1) + (z2 - z1) * (z2 - z1));
    }

    public double multiplyVectorByNumber(int k) { //умножить вектор на число k
        return k * findLengthOfVector();
    }

    public double findScalarProductOfVectors(Vector v2) { //найти скалярное произведение векторов
        return ((x2 - x1) * (v2.getX2() - v2.getX1()) + (y2 - y1) * (v2.getY2() - v2.getY1()) + (z2 - z1) * (v2.getZ2() - v2.getZ1()));
    }

    public static double findVectorProductOfVectors(Vector v2, Vector v1) { //найти векторное произведение векторов
        double sin = Math.sin(Math.acos(findCosOfAngleBetweenVectors(v2, v1)));
        return sin * v1.findLengthOfVector() * v2.findLengthOfVector();
    }

    public static double findCosOfAngleBetweenVectors(Vector v2, Vector v1) { //найти косинус угла между векторами
        return v1.findScalarProductOfVectors(v2) / (v1.findLengthOfVector() * v2.findLengthOfVector());
    }

    public double findSumOfVectors(Vector v2) { //найти сумму векторов
        double x = (x2 - x1) + (v2.getX2() - v2.getX1());
        double y = (y2 - y1) + (v2.getY2() - v2.getY1());
        double z = (z2 - z1) + (v2.getZ2() - v2.getZ1());
        return Math.sqrt(x * x + y * y + z * z);
    }

    public double findDifferenceVector(Vector v2) { //найти разность векторов
        double x = (x2 - x1) - (v2.getX2() - v2.getX1());
        double y = (y2 - y1) - (v2.getY2() - v2.getY1());
        double z = (z2 - z1) - (v2.getZ2() - v2.getZ1());
        return Math.sqrt(x * x + y * y + z * z);
    }
}