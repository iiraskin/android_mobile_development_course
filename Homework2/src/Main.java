import java.util.Random;


public class Main {

    private static void printArray(int[][] arr)
    {
        for (int[] str : arr) {
            for (int el : str) {
                System.out.print(el);
                System.out.print(" ");
            }
            System.out.println("");
        }
        System.out.println(""); //Чтобы отделить выводимые массивы друг от друга
    }

    /* Выносит максимальный элемент массива на первое место */
    private static void biggestToFirst(int[] arr)
    {
        for (int i = 1; i < arr.length; ++i) {
            if (arr[i] > arr[0]) {
                int tmp = arr[0];
                arr[0] = arr[i];
                arr[i] = tmp;
            }
        }
    }

    public static void main(String[] args) {
        int[][] arr = new int[6][7];
        Random rand = new Random();
        for (int i = 0; i < arr.length; ++i) {
            for (int j = 0; j < arr[i].length; ++j) {
                arr[i][j] = ((int) (rand.nextInt(10)));
            }
        }

        printArray(arr);

        for (int[] str : arr) {
            biggestToFirst(str);
        }

        printArray(arr);

        //Пример работы с созданными классами.
        Point a = new Point(-3, 4);
        Point b = new Point();
        Rect r = new Rect(a, b);

        System.out.println(RectUtils.square(r));
        System.out.println(RectUtils.perimeter(r));
        System.out.println(RectUtils.diagonal(r));
    }
}
