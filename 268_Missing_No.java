//Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int sum=0;
        int total=0;
        for(int i=0;i<n;i++){
          sum+=nums[i];
        }
        for(int j=1;j<=n;j++){
          total+=j;
        }
        int missing=total-sum;
        return missing;
        }
    
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int arr[]=new int[n];
        Solution sol=new Solution();
        System.out.println(sol.missingNumber(arr));
    }
}
