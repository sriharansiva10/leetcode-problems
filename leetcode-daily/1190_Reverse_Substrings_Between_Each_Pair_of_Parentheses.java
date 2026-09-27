class Solution {
    public String reverseParentheses(String s) {
        Stack<String> stack= new Stack<>();
        String current="";
        for (char c:s.toCharArray()) {
            if (c=='(') {
                stack.push(current);
                current="";
            }
            else if (c==')'){
                current=new StringBuilder(current).reverse().toString();
                String prev = stack.pop();
                current = prev+current;
            }
            else {
                current =current + c;
            }
        }
        return current;
    }

}