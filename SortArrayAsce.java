import java.util.Arrays;

public class SortArrayAsce{
    int[] ascending(int[] array){
        for(int i=0;i < array.length; i++){
            for(int j = i + 1;j < array.length; j++){
                int temp;
                if (array[i] > array[j]){
                    temp = array[i];
                    array[j] = temp;
                }
            }

        }
        return array;
    }

    public static void main(String[] args){
        int[] array = new int[]{5, 7, 9, 10, 34};
        SortArrayAsce sorting = new SortArrayAsce();
        System.out.println("Array elements after sorting : ");
        System.out.println("Ascending : ");
        System.out.println(Arrays.toString(sorting.ascending(array)));

    }
}
