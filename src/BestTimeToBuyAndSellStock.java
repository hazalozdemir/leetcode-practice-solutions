public class BestTimeToBuyAndSellStock{
        public int maxProfit(int[] prices) {

            int maxProfit = 0;
            int i = 0;
            int j = 1;

            while(j < prices.length ){
                int currentProfit = prices[j]-prices[i];
                if(currentProfit > 0){
                    maxProfit = Math.max(currentProfit,maxProfit);
                }else{
                    i=j;
                    j++;
                }


            }
            return maxProfit;
        }
}
