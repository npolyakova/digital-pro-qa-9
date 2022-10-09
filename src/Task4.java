import java.util.Random;

public class Task4 {

    //- [ ] Дан двумерный массив.
    //1. Вывести на экран элемент, расположенный в правом верхнем углу массива
    //2. Вывести на экран элемент, расположенный в левом нижнем углу массива

    public static void main(String[] args) {
        Random r = new Random();
        int[][] array2d = new int[r.nextInt(2, 5)][r.nextInt(2, 5)];

        // [ [1,2], [2,3,4], [1,2,3], [1] ]
        // [
        //  [1,2,3]
        //  [1,4,5]
        // ]
        for (int i = 0; i < array2d.length; i++) {
            for (int j = 0; j < array2d[i].length; j++) {
                array2d[i][j] = r.nextInt(20);
                System.out.print(array2d[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Правый верхний угол " + array2d[0][array2d[0].length - 1]);
        System.out.println("Левый нижний угол " + array2d[array2d.length - 1][0]);
    }
}
