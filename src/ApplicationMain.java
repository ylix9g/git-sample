import java.util.Arrays;

public class ApplicationMain {

    public static void main(String[] args) {
        System.out.println("--- Application ---");


        SortAlgorithm sortAlgo = new InsertionSort();

        int[] nums = new int[]{7, 5, 9};
        sortAlgo.sort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
