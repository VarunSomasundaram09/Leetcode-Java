int maxProfit(int* prices, int pricesSize) {
      int min=prices[0];
        int max=-1;
        for(int i=1;i<pricesSize;i++){
         max = (max > prices[i] - min) ? max : prices[i] - min;
            min=(min<prices[i])? min: prices[i] ;
        }
        return max==-1 ? 0:max;
}