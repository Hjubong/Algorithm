class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String aa = Integer.toString(a);
        String bb = Integer.toString(b);
        
        String c = aa+bb;
        
        int cc = Integer.parseInt(c);
        int ee = 2 * a * b;
        
        if(cc>ee){
            answer=cc;
        } else if(cc<ee){
            answer=ee;
        } else{
            answer=cc;
        }
        
        return answer;
    }
}