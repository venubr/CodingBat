public int array667(int[] nums) {
  int count=0;int one=0;
  for(int i=0;i<nums.length-1;i++) {
  if(nums[i]==6){
  one=i;
  if(nums[one+1]==6 || nums[one+1]==7) {
   count++;
  }
  }
  }
  return count;
}
