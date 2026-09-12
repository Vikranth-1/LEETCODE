class StockSpanner {
    int[] price;
    int[] span;
    int top;

    public StockSpanner() {
        price=new int[20];
        span=new int[20];
        top=-1;
    }
    
    public int next(int pr) {
      int sp=1;
      while(top!=-1 && price[top]<=pr) {
        sp+=span[top--];
      }
      price[++top]=pr;
      span[top]=sp;
      return sp;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
