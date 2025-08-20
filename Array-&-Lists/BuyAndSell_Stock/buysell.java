public class buysell {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;

        for(int price : prices){
            if(price < minPrice){
                minPrice = price;
            }
            int profit = price - minPrice;
            if(maxProfit < profit){
                maxProfit = profit;
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        buysell bs = new buysell();
        int[] prices = {2,4,1};
        System.out.println("Max profit : "+bs.maxProfit(prices));
    }
}
