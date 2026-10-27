class Solution {
    public int jump(int[] nums) {
        return jump_util(nums,0,0);       
    }
    public int jump_util(int[] nums,int idx,int jmp) {
		if(idx>=nums.length-1) return jmp;
		int maxnum=0,maxidx=0;
        for(int i=1;i<=nums[idx];i++){
            int nextidx=i+idx;
            if(nextidx>=nums.length-1) return jmp+1;
            if(nextidx+nums[nextidx]>maxnum){
                maxnum=nextidx+nums[nextidx];
                maxidx=nextidx;
            }
        }
		return jump_util(nums,maxidx,jmp+1);
	}
}
