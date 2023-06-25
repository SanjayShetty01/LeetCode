object Solution {
    def maxProfit(prices: Array[Int]): Int = {
        var buyPrice : Int = prices(0)
        var profit : Int = 0

        for(i <- 0 until prices.length){

            if(prices(i) < buyPrice){
                buyPrice = prices(i)
            }
            else{
                var currentProfit : Int = prices(i) - buyPrice
                profit = Math.max(currentProfit, profit)
            }
        }

        profit
    }
}

val prices = Array(7,1,5,3,6,4)

Solution.maxProfit(prices)