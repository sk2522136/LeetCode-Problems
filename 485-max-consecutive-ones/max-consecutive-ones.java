class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int k=0;
        int count=0;
          for(int num:nums){
            k=(num==1) ? k+1:0;
            if(k>count){
                count=k;
            }
          }
          return count;
           }
          

        }
        
  