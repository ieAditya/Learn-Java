public class BubbleSort {

    private static void bubbleSort(int[] arr)
    {
        int size = arr.length;
        for(int i = 0; i < size; i++)
        {
            int index = 0;
            while(index+1 < size-i)
            {
                if(arr[index] > arr[index+1])
                {
                    int temp = arr[index+1];
                    arr[index+1] = arr[index];
                    arr[index] = temp;
                }
                index++;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {7, 8, 3, 1, 2};
        bubbleSort(arr);
        for(int num:arr)
        {
            System.out.print(num + " ");
        }
    }
}
