import java.util.Arrays;

public class Selectionsort {
    void Selectionsort(int[] array) {
        int size = array.length;
        for (int step = 0; step < size - 1; step++) {

            
            int min_idx = step;
            for (int i = step + 1; i < size; i++) {
                if (array[i] < array[min_idx]) {
                    min_idx = i;
                }
            }
            int temp = array[min_idx];
            array[min_idx] = array[step];
            array[step] = temp;
        }
    }

    public static void main(String[] args) {
        Selectionsort ss = new Selectionsort();
        int[] data = { 10, 8, 7, 6, 5, 4 };
        ss.Selectionsort(data);
        System.out.println("Sorted array in ascending order:");
        System.out.println(Arrays.toString(data));
    }
}
