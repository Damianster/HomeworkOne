public class exercise3 {
    public static void main(String[] args) {
        int i;
        int[] array = {1, 1, 2, 3, 1, 2, 5, 1, 5, 3};
        int j = array.length;
        for (i = 0; i < (j - 2); i++) {
            if ((array[i] == 1) & (array[i + 1] ==2) & (array[i + 2] == 3)) {

                System.out.println("true");
                System.out.println("\n");
            }
        }
    }
}

