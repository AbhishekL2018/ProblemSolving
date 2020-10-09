package LeetCodeHackerRank;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {

    }
    public static int maxProfit(int[] prices) {
        int start = 0;
        int end = 0;
        int max = 0;
        while(end<prices.length){
            if(prices[start]>prices[end]){
                while(start!=end){
                    start++;
                }
            }
            end++;
        }
        return max;
    }
}
