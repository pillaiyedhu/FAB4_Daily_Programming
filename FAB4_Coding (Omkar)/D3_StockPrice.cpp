// https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/

#include <bits/stdc++.h>
using namespace std;

int maxProfit(vector<int> prices){
    int maxprofit = 0;

    for(int i = 1; i < prices.size(); i++){
        if(prices[i] - prices[i - 1] > 0){
            maxprofit += prices[i] - prices[i-1];
        }
    }
    return maxprofit;
}
int main()
{
    int n;
    cin >> n;
    vector<int> prices;
    int push;

    for (int i = 0; i < n  ; i++)
    {
        cin >> push;
        prices.push_back(push);
    }

    int res = maxProfit(prices);
    cout << res;
}
