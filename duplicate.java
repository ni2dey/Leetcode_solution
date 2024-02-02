//Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
class Solution {
    public boolean containsDuplicate(int[] nums) {
     Arrays.sort(nums);
     int n=nums.length;
     for (int i=0;i<n-1;i++){
               if (nums[i]==nums[i+1]){
                  return true;
               }

           } 
     
     return false;
}
 public static void main(String args[]){
        System.out.println("Enter the no of elements:");
        Solution sol=new Solution();
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
           arr[i]=input.nextInt();
        }
        System.out.println(sol.containsDuplicate(arr));    
    }
}
