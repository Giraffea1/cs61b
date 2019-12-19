import java.util.Arrays;

public class BreakContinue {
    public static void WindowPosNum(int[] a, int x){
        for (int i = 0; i < a.length; i ++){
            if (a[i] > 0){
                int total = 0;
                for (int j = 0; j<=x; j+= 1){
                    if ((i + j) < a.length){
                        total += a[i+j];
                    }
                    a[i] = total;
                }
            }
        }
    }
    public static void main(String[] args) {
        int a[] = {1, 2, -3, 4, 5, 4};
        int x = 3;
        WindowPosNum(a, x);
        System.out.println(Arrays.toString(a));
    }
}