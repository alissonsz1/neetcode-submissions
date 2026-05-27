class Solution {
    public int maxProfit(int[] prices) {
        int melhorCompra = 0;
        int minimaCompra = prices[0];

        for(int venda : prices){
            melhorCompra = Math.max(melhorCompra, venda - minimaCompra);
            minimaCompra = Math.min(minimaCompra, venda);
        }
        return melhorCompra;
    }
}
