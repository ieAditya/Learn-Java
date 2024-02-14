public class SelectionSort {
    public static void selectionSort(int[] arr)
    {
        for(int it = 0; it < arr.length; it++)
        {
            int smallestIndex = it;
            int index = it + 1;
            while(index < arr.length)
            {
                if(arr[index] < arr[smallestIndex])
                    smallestIndex = index;
                index++;
            }
            int temp = arr[it];
            arr[it] = arr[smallestIndex];
            arr[smallestIndex] = temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = {7, 8, 3, 1, 2};
        selectionSort(arr);
        for(int num : arr)
        {
            System.out.print(num + " ");
        }
    }
}
