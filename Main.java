import java.util.Random;

public class Main {
    public static final int SIZE = 8;

    public static void main(String[] args) {

        int[][] colors = new int[SIZE][SIZE];
        Random random = new Random();
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                colors[i][j] = random.nextInt(256);
            }
        }
        System.out.println("Вывод оригинальной матрицы");
        printColors(colors);
        int[][] rotate = rotatedColors(colors);
        System.out.println("Вывод перевернутой матрицы");
        printColors(rotate);
    }


    public static void printColors(int[][] colors) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.format("%4d", colors[i][j]);
            }

            System.out.println();
        }
    }

    public static int[][] rotatedColors(int[][] colors) {
        int[][] rotate = new int[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                rotate[i][j] = colors[SIZE - 1 - j][i];
            }
        }

        return rotate;
    }
}
