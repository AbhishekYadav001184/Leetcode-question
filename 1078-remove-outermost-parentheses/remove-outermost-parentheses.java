class Solution {
    public String removeOuterParentheses(String s) {
        int n=s.length();
        int depth=0;
        StringBuilder r=new StringBuilder();

        for(int i=0;i<n;i++){
            char ch=s.charAt(i);

            if(ch=='('){
                if(depth>0){
                    r.append(ch);
                }
                depth++;
            }
            else{
                depth--;
                if(depth>0){
                    r.append(ch);
                }
            }
        }
        return r.toString();
    }
}