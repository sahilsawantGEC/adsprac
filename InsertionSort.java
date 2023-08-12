import java.util.Arrays;

public class InsertionSort {
    void insertionSort(int[] array){
        int size=array.length;
        for(int step=1;step<size;step++){
            int key=array[step];
            int j=step-1;
            while(j>=0 && key<array[j]){
                array[j+1]=array[j];
                --j;
            }
            array[j+1]=key;
        }
    }
    public static void main(String[] args){
        InsertionSort is=new InsertionSort();
        int[] data={20,10,9,8,7,6,1};
        is.insertionSort(data);
        System.out.println("Sorted array in ascending order:");
        System.out.print(Arrays.toString(data));
    }
    
}
