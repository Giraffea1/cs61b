import java.io.*;
public class drawstar {
    public static void main(final String[] args) {
        int x = 1;
        while (x <6) {
            int j = 0;
            while (j < x) {
                j = j+1;
                System.out.print("* ");
            }
            System.out.println();
            x = x+1;
        }
    }
}