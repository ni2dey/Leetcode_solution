//You are given an array prices where prices[i] is the price of a given stock on the ith day.You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int max_prof=0;
        int min_price=prices[0];
        for(int i=0;i<n;i++){
            if(prices[i]<min_price){
                min_price=prices[i];
            }else{
                if((prices[i]-min_price)>max_prof){
                    max_prof=prices[i]-min_price;
                }
            }
        }
        return max_prof;
    }
}
public class Main{
    public static void main(String args[]){
         Scanner scan=new Scanner(System.in);
         System.out.println("Enter no.of prices:");
         int n=scan.nextInt();
         int prices[]=new int[n];
          for(int i=0;i<n;i++){
            prices[i]=scan.nextInt();
          }
          Solution sol=new Solution();
          int max=sol.maxProfit(prices);
          System.out.println(max);



    }
}
