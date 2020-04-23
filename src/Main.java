import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите координаты первого вектора: ");
        double[] vector_1 = Utils.readDoubleArrayFromConsole();
        Vector v1 = new Vector(vector_1[0], vector_1[1], vector_1[2], vector_1[3], vector_1[4], vector_1[5]);

        System.out.println("Введите координаты второго вектора: ");
        double[] vector_2 = Utils.readDoubleArrayFromConsole();
        Vector v2 = new Vector(vector_2[0], vector_2[1], vector_2[2], vector_2[3], vector_2[4], vector_2[5]);

        System.out.println("Длина вектора v1 = " + v1.findLengthOfVector());

        System.out.println("Длина вектора v2 = " + v2.findLengthOfVector());

        System.out.println("Умножение векторов на число k:");
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите k = ");
        int k = scan.nextInt();
        System.out.println("Произведение вектора v1 на число k = " + v1.multiplyVectorByNumber(k));
        System.out.println("Произведение вектора v2 на число k = " + v2.multiplyVectorByNumber(k));

        System.out.println("Скалярное произведение векторов = " + v2.findScalarProductOfVectors(v1));

        System.out.println("Векторное произведение векторов = " + Vector.findVectorProductOfVectors(v1, v2));

        System.out.println("Косинус угла между векторами = " + Vector.findCosOfAngleBetweenVectors(v1, v2));

        System.out.println("Сумма векторов = " + v2.findSumOfVectors(v1));

        System.out.println("Разность векторов = " + v2.findDifferenceVector(v1));
    }
}