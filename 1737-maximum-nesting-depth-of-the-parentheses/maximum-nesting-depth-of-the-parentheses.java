class Solution {
    public int maxDepth(String s) {
        int Depth=0;
        int currDepth=0;
        for (int i=0;i<s.length();i++) {
            char c=s.charAt(i);
            if(c=='('){
                currDepth++;
                Depth=Math.max(Depth, currDepth);
            } else if(c==')'){
                currDepth--;
            }
        } 
        return Depth;
    }
}