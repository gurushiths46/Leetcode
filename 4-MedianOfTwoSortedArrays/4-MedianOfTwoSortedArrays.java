// Last updated: 09/07/2026, 11:50:57
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length + nums2.length];
        int k = 0;

        for (int i : nums1)
            arr[k++] = i;

        for (int i : nums2)
            arr[k++] = i;

        Arrays.sort(arr);

        int n = arr.length;

        if (n % 2 == 0)
            return (arr[n/2 - 1] + arr[n/2]) / 2.0;
        else
            return arr[n/2];
    }
}