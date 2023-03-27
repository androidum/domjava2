package domash2;

//Реализуйте алгоритм сортировки пузырьком числового массива,
// результат после каждой итерации запишите в лог-файл.



import java.io.FileWriter;
import java.util.Arrays;

public class zadacha1 {

    public static void task_2() {
        int[] arr = {5, 2, 7, 1, 8, 4, 9, 3, 6};

        // записываем начальный массив в лог-файл
        writeLog(Arrays.toString(arr));

        // сортировка пузырьком
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            // записываем результат после каждой итерации в лог-файл
            writeLog(Arrays.toString(arr));
        }

        // записываем конечный массив в лог-файл
        writeLog(Arrays.toString(arr));
        System.out.println("Результат сортировки записан в лог-файл log.txt");
    }

    private static void writeLog(String message) {
        try {
            FileWriter writer = new FileWriter("log.txt", true);
            writer.write(message + "\n");
            writer.close();
        } catch (Exception e) {
            System.out.println("Ошибка записи в лог-файл");
        }
    }
}