class Solution {
    public boolean isNumber(String s) {
        boolean digit = false;
        boolean dot = false;
        boolean exp = false;
        boolean digitAfterExp = true;

        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);

            if(Character.isDigit(ch)){
                digit = true;

                if(exp){
                    digitAfterExp = true;
                }
            }else if(ch == '+' || ch=='-'){
                if(i>0 && s.charAt(i-1)!='e' && s.charAt(i-1) != 'E'){
                    return false;
                }

                if(i>0 && s.charAt(i-1) == 'e' || i>0 && s.charAt(i-1) == 'E'){
                    // sign immediately after exponent is allowed
                }else if(i != 0){
                    return false;
                }
            }else if(ch == '.'){
                if(dot || exp){
                    return false;
                }
                dot = true;
            }else if(ch == 'e' || ch == 'E'){

                if(exp || !digit){
                    return false;
                }

                exp = true;
                digitAfterExp = false;
            }else{
                return false;
            }
        }

        return digit && digitAfterExp;
    }
}