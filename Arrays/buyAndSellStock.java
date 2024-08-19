public class buyAndSellStock {
    public static int getMaxProfit(int[] prices){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int price : prices){
            if(buyPrice < price){//profit
                int profit = price - buyPrice;//todays profit
                maxProfit = Math.max(maxProfit, profit); // global profit
            }else{ //when selling price i.e, price is less make it buying price
                buyPrice = price;
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
        int prices1[] = {7,6,4,3,1};
        System.out.println(getMaxProfit(prices));
        System.out.println(getMaxProfit(prices1));
    }
}
