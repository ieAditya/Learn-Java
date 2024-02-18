public class MoveAllNegativesToEnd {
    // O(n) Space: O(n)
    public static void move(int[] nums)
    {
        int[] negatives = new int[nums.length];
        int[] positives = new int[nums.length];
        int n, p, totPos;
        n = p = totPos = 0;
        for(int data : nums)
        {
            if(data < 0)
            {
                negatives[n++] = data;
            }
            else
            {
                positives[p++] = data;
                totPos++;
            }
        }
        int i = 0;
        n = p = 0;
        while(totPos-- > 0)
        {
            nums[i++] = positives[p++];
        }
        while(i < nums.length)
        {
            nums[i++] = negatives[n++];
        }

        negatives = null;
        positives = null;
    }

    // O(n) Space: O(1)
    public void moveUsingTwoPointer(int nums[], int n)
    {
        int neg, pos;
        neg = pos = 0;
        while(neg < n && nums[neg] >= 0)
        {
            neg++;
        }
        pos = neg+1;
        while(neg < n && pos < n)
        {
            while(pos < n && nums[pos] < 0)
            {
                pos++;
            }
            int lastPos = pos;
            while(pos != n && pos > neg)
            {
                int temp = nums[pos - 1];
                nums[pos - 1] = nums[pos];
                nums[pos] = temp;
                pos--;
            }
            neg++;
            pos = lastPos + 1;
        }
    }
    public static void main(String[] args)
    {
        int[] nums = {1, -1, 3, 2, -7, -5, 11, 6};
        // int[] nums = {1, -1, 3, 2, -7, -5, 11, 6};
        move(nums);
        // moveUsingTwoPointer(nums);

        for(int data : nums)
        {
            System.out.print(data + " ");
        }
    }
}
