class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int X = nums2[0]-nums1[0];
        for(int i=0;i<nums1.length;i++){
            if(nums2[i]-nums1[i] != X){
                throw new IllegalArgumentException("Invalid input: inconsistent differences");
            }
        }
        return X;
    }
}