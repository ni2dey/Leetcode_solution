//Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.You must implement a solution with a linear runtime complexity and use only constant extra space.


class Solution {
    public int singleNumber(int[] nums) {
        int n=nums.length;
        int a=0;
        for(int i=0;i<n;i++){
            a^=nums[i];
        }
        return a;
    }
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int num[]=new int[n];
        for(int i=0;i<n;i++){
        num[i]=input.nextInt();
        }
        Solution sol=new Solution();
        System.out.println(sol.singleNumber(num));

    }
}
