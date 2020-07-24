import java.util.Arrays;

/**
 * Created by KPS on 7/24/2020.
 */
public class Main {
    public static void main(String[] args) {
        int[] integers = {1,2,2,3,4,5,5,5,6};
        Arrays.sort(integers);
        int temp = 0;
        int temp2 = 0;
        for (int i = 0 ; i < integers.length-1 ; i++) {
            if (integers[i] % 2 == 0) {
                for (int j = i + 1; j < integers.length - 1; j++) {
                    if (integers[j] % 2 != 0) {
                            temp = integers[i];
                            integers[i] = integers[j];
                            integers[j] = temp;
                            break;
                        }
                    }
                }

        }
        System.out.println(Arrays.toString(integers));
    }
}
