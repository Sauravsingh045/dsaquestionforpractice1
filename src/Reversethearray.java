import java.util.Scanner;

public class Reversethearray {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);

int n=s.nextInt();
        int no = s.nextInt();
        int m = s.nextInt();
        int arr[] = new int[no];
while(n>0) {
    for (int i = 0; i < no; i++) {
        arr[i] = s.nextInt();
    }
    for (int k = 0; k <= m; k++) {
        System.out.println(arr[k]);
    }
    for (int j = no - 1; j > m; j--) {

        System.out.println(arr[j]);

    }
    n--;
}
        }
    }
