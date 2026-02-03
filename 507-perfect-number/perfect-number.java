class Solution {
    public boolean checkPerfectNumber(int num) {
      if(num<=1) return false;
      int sum=1;
      int let=(int)(Math.sqrt(num));
      for(int i=2;i<=let;i++){
        if(num%i==0){
            sum=sum+i;
            int other=num/i;
            if(other  != i ){
                sum = sum + other;}
        }
        
        
        
      }
      return sum==num;
    }
}