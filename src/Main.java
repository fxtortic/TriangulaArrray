// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static int[][] result = new int[10][];

    public static void main(String[] args) {
        int[][] array = new int[10][];
        for (int i = 0; i < array.length; i++) {
            array[i] = new int[i +1];
            for (int j = 0; j <= i; j++) {
                array[i][j] = i +j;
            }
        }
        result = array;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}