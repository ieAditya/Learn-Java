import java.util.ArrayList;
import java.util.Arrays;

public class IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int pt1, pt2;
        pt1 = pt2 = 0;
        while(pt1 < nums1.length && pt2 < nums2.length)
        {
            if(nums1[pt1] == nums2[pt2])
            {
                if(list.isEmpty())
                    list.add(nums1[pt1]);
                else if(list.get(list.size() - 1) != nums1[pt1])
                    list.add(nums1[pt1]);
                pt1++;
                pt2++;
            }
            else if(nums1[pt1] < nums2[pt2])
                pt1++;
            else
                pt2++;
        }
        int[] ans = new int[list.size()];
        int pt = 0;
        for(int num:list)
        {
            ans[pt++] = num;
        }
        return ans;
    }
    public static void main(String[] args)
    {
        
    }
}
