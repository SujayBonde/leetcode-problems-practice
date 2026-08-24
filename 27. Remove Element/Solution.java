class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0; // pointer for placement
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j]; // move non-val element forward
                i++;
            }
        }
        return i; // number of elements not equal to val
    }
}
