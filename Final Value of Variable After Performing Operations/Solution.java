class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for(int i = 0; i < operations.length; i++) {
            if(operations[i].contains("+")) {
                x = x + 1;
            } else {
                x = x - 1;
            }
        }
        return x;
    }

    public static void main(String[] args) {
        Solution sl = new Solution();
        String[] operations = new String[]{"--X","X++","X++"};
        int finalValue = sl.finalValueAfterOperations(operations);
        System.out.println(finalValue);
    }
}
