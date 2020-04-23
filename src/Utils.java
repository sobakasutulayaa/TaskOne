import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Utils {
    public static double[] toPrimitive(Double[] arr) {
        if (arr == null) {
            return null;
        }
        double[] result = new double[arr.length];
        for (int i = 0; i < arr.length; i++) {
            // автоматическая распаковка из объекта
            result[i] = arr[i];
        }
        return result;
    }

    public static double[] toDoubleArray(String str) {
        Scanner scanner = new Scanner(str);
        scanner.useLocale(Locale.ROOT);
        scanner.useDelimiter("(\\s|[,;])+");
        List<Double> list = new ArrayList<>();
        while (scanner.hasNext()) {
            list.add(scanner.nextDouble());
        }

        // из List<Double> можно получить Double[]
        Double[] arr = list.toArray(new Double[0]);
        // Double[] -> double[]
        return Utils.toPrimitive(arr);
    }

    public static double[] readDoubleArrayFromConsole(String arrName) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                if (arrName == null || arrName.length() == 0) {
                    arrName = "";
                } else {
                    arrName = " " + arrName;
                }
                String line = scanner.nextLine();
                return toDoubleArray(line);
            }
            catch(Exception e) {
                System.out.print("Вы ошиблись, попробуйте еще раз! ");
            }
        }
    }

    public static double[] readDoubleArrayFromConsole() {
        return readDoubleArrayFromConsole(null);
    }


}
