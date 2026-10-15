class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);

            // Store opening brackets
            if(ch =='(' || ch == '[' || ch == '{'){
                stack.push(ch);
            }else{
                // No opening brackets match
                if(stack.isEmpty()){
                    return false;
                }

                char top = stack.pop();

                // Check whether brackets match
                if(ch == ')'&& top != '('){
                    return false;
                }
                if(ch == '}' && top != '{'){
                    return false;
                }
                if(ch == ']' && top != '['){
                    return false;
                }
            }
        }

        // No matched opening brackets should restore 
        return stack.isEmpty();
    }
}








