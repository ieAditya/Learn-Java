public class Sort0s1sAnd2s {

    public static void sort(int[] nums)
    {
        int count0s, count1s;
        count0s = count1s = 0;
        for(int data : nums)
        {
            if(data == 0)
                count0s++;
            if(data == 1)
                count1s++;
        }
        int i = 0;
        while(count0s-- > 0)
        {
            nums[i++] = 0;
        }
        while(count1s-- > 0)
        {
            nums[i++] = 1;
        }
        while(i < nums.length)
        {
            nums[i++] = 2;
        }
    }
    public static void main(String[] args) {
        int[] nums = {0,2,1,2,0};
        sort(nums);
        for(int data : nums)
            System.out.print(data + " ");
    }
}
