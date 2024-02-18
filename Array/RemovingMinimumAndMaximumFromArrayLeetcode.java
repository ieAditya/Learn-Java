public class RemovingMinimumAndMaximumFromArrayLeetcode {
    class Solution {
        public int minimumDeletions(int[] nums) {
            int arrSize = nums.length;
            if(arrSize <= 2)
                return arrSize;
    
            int maxi = nums[0], maxiIndex = 0;
            int mini = nums[0], miniIndex = 0;
            for(int i = 1; i < arrSize; i++)
            {
                if(nums[i] < mini)
                {
                    mini = nums[i];
                    miniIndex = i;
                }
                if(nums[i] > maxi)
                {
                    maxi = nums[i];
                    maxiIndex = i;
                }
            }
            int firstOccurence, lastOccurence;
            if(maxiIndex < miniIndex)
            {
                firstOccurence = maxiIndex;
                lastOccurence = miniIndex;
            }
            else
            {
                firstOccurence = miniIndex;
                lastOccurence = maxiIndex;
            }
            // left + mid
            int firstCase = lastOccurence + 1;
            // left + right
            int secondCase = firstOccurence + 1 + (arrSize - lastOccurence);
            // mid + right
            int thirdCase = arrSize - firstOccurence;
    
            return Math.min(firstCase, Math.min(secondCase, thirdCase));
    
            // if(firstCase <= secondCase && firstCase <= thirdCase)
            //     return firstCase;
            // if(secondCase <= firstCase && secondCase <= thirdCase)
            //     return secondCase;
            // return thirdCase;
        }
    }
}
