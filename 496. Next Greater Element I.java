class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] nextGreater=new int[10001];
        int[] stack=new int[nums2.length];
        int top=-1;
        for (int num:nums2) {
            while (top>=0 && stack[top]<num) {
                nextGreater[stack[top--]]=num;
            }
            stack[++top]=num;
        }
        while (top>=0) {
            nextGreater[stack[top--]]=-1;
        }
        int[] ans=new int[nums1.length];
        for (int i=0;i<nums1.length;i++) {
            ans[i]=nextGreater[nums1[i]];
        }
        return ans;
    }
}

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            boolean flag=true;
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    for(int k=j+1;k<nums2.length;k++){
                        if(nums1[i]<nums2[k]){
                            ans[i]=nums2[k];
                            flag=false;
                            break;
                        }
                    }
                }
            }
            if(flag) ans[i]=-1;
        }
        return ans;
    }
}
