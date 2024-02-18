import java.util.PriorityQueue;

public class KthLargestElementInAnArray {
    /*
    // O(n*k)   Space: O(1)
    public int findKthLargest(int[] nums, int k) {
        int ans = -1;
        for(int kth = 1; kth <= k; kth++)
        {
            int kthLargest = nums[0], index = 0;
            for(int i = 0; i < nums.length; i++)
            {
                if(nums[i] >= kthLargest)
                {
                    kthLargest = nums[i];
                    index = i;
                }
            }
            nums[index] = Integer.MIN_VALUE;
            ans = kthLargest;
        }
        return ans;
    }

    // O(nLogn) Space: O(1)
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }
    
    // O(nLogn) Space: O(n)
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
        for(int data:nums)
        pq.add(data);
        for(int i = 1; i < k; i++)
        pq.poll();
        return pq.peek();
    }
    */

    // O(nLogk) Space: O(k)
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        int i = 0;
        for(; i < k; i++)
        {
            pq.add(nums[i]);
        }
        for(; i < nums.length; i++)
        {
            if(nums[i] > pq.peek())
            {
                pq.poll();
                pq.add(nums[i]);
            }
        }
        return pq.peek();
    }
    
}
