public class ClassNameHere {
    /** Returns the maximum value from m. */
    public static int max(int[] m) {
        
        for (int x = 1; x < m.length; x = x+1){
            if (m[x] >m[0]){
                int r = m[0];
                m[0] = m[x];
                m[x] = r;
            }
        }
        return m[0];
    }
    public static void main(String[] args) {
       int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};
       System.out.println(max(numbers));      
    }
}