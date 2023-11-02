class Permutation {
    public int[] buildArray(int[] nums) {
        int length=nums.length;
        int[] ans = new int[length];
        for(int i=0; i<nums.length; i++) {
            ans[i] = nums[nums[i]];
            System.out.println(ans[i]);
        }
        return ans;
    }

    public static void main(String[] args) {
        Permutation pm = new Permutation();
        int[] nums = new int[]{0,2,1,5,3,4};
        pm.buildArray(nums).toString();
    }
}

