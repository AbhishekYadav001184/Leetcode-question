class Solution {
    public boolean checkPerfectNumber(int num) {
      boolean per=true;
      int sum=0;
      for(int i=1;i<(num);i++){
        if(num%i==0){
            sum=sum+i;
            
        }
        
      }
      if(sum!=num){
        per=false;
      }
      else{
        per=true;
      }
      return per;
    }
}