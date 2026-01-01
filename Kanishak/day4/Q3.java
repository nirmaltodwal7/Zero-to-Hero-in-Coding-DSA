package day4;

//  Buy Two Chocolates


class Solution {
    public int buyChoco(int[] prices, int money) {
        int first = 999;
        int second = 999;

        for(int price: prices){
            if(price<=first)
            {
                second = first;
                first = price;
            }
            else if(price < second)
              second = price;
        }
        
        int total_price = first + second;

        if(total_price <= money)
         return money-total_price;
        else
          return money;
    }
}