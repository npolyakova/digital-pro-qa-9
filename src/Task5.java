import java.util.Random;

public class Task5 {

    //- [ ] Дан двумерный массив. Определить:
    //1. сумму всех элементов третьей строки массива
    //2. сумму всех элементов второго столбца массива

    public static void main(String[] args) {
        Random r = new Random();
        int[][] array2d = new int[r.nextInt(4, 6)][r.nextInt(3, 6)];

        for (int i = 0; i < array2d.length; i++) {
            for (int j = 0; j < array2d[i].length; j++) {
                array2d[i][j] = r.nextInt(20);
                System.out.print(array2d[i][j] + " ");
            }
            System.out.println();
        }

        int sumRow = 0;
        for (int i = 0; i < array2d[3].length; i++) {
            sumRow += array2d[3][i];
        }

        System.out.println("Sum = " + sumRow);

        int sumCol = 0;
        for (int i = 0; i < array2d.length; i++) {
            sumCol += array2d[i][2];
        }

        System.out.println("Sum = " + sumCol);
    }
}
