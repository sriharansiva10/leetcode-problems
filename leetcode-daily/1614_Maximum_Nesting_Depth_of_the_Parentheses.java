class Solution {
    public int maxDepth(String s) {
        int open =0;
        int maxOpen=0;
        for (char c:s.toCharArray()) {
            if (c=='(') {
                open++;
                maxOpen=Math.max(open,maxOpen);
            }
            else if (c==')'){
                open--;
            }
        }
        return maxOpen;
    }
}