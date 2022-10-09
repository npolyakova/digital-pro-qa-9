import java.util.Random;

public class Task3 {

    //- Дан массив. Определить:
    //1. максимальный элемент
    //2. минимальный элемент
    //3. индекс максимального элемента
    //4. индекс минимального элемента
    //Поменять местами максимальный элемент с минимальным

    public static void main(String[] args) {
        Random r = new Random();
        int[] array = new int[r.nextInt(4, 10)];

        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(-100,100);
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        int max = array[0];
        int min = array[0];
        int maxIndex = 0;
        int minIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                maxIndex = i;
            }
            if (array[i] < min) {
                min = array[i];
                minIndex = i;
            }
        }

        System.out.println("\nMax = " + max + " index = " + maxIndex);
        System.out.println("Min = " + min + " index = " + minIndex);

        array[maxIndex] = min;
        array[minIndex] = max;

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
