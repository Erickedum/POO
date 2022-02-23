package ejercicioAmdocs;
public class ArrayAmdocs {
    public static int noDup(int array[], int n) {

        if (n == 0 || n == 1) {
            return n;
        }
        int[] arrT = new int[n];
        int j = 0;
        for (int i = 0; i < n - 1; i++) {
            if (array[i] != array[i + 1]) {
                arrT[j++] = array[i];
            }
        }
        arrT[j++] = array[n - 1];
        for (int i = 0; i < j; i++) {
            array[i] = arrT[i];
        }
        return j;
    }
    public static void main(String[] args) {
        int array[] = {5, 8, 9, 9, 30, 30, 30, 80, 100, 100, 101, 120, 120, 120};
        int lenght = array.length;
        lenght = noDup(array, lenght);
        for (int i = 0; i < lenght; i++) {
            System.out.println(array[i] + " ");
        }
    }
}