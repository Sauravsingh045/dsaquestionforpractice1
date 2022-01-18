import java.util.Arrays;
import java.util.Scanner;

public class Twodarray {
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        int[][] arr = new int[3][3];
        System.out.println(arr.length); // no of rows
        // input

        for (int row = 0; row < arr.length; row++) {
            // for each col in every row
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = s.nextInt();
            }
        }
        for (int row = 0; row < arr.length; row++) {
            // for each col in every row
            for (int col = 0; col < arr[row].length; col++) {
                System.out.println(Arrays.toString(arr));
            }
        }

            }
        }



