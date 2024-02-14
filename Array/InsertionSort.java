public class InsertionSort {
    public static void insertionSort(int[] arr)
    {
        for(int index = 1; index < arr.length; index++)
        {
            int current = arr[index];
            int i = index-1;
            while(i >= 0 && arr[i] > current)
            {
                arr[i+1] = arr[i];
                i--;
            }
            arr[i+1] = current;
        }
    }
    public static void main(String[] args) {
        int[] arr = {7, 8, 3, 1, 2};
        insertionSort(arr);
        for(int num : arr)
        {
            System.out.print(num + " ");
        }
    }
}
