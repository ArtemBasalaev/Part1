package test;

public class OrderCost {
    public static double getOrderCost(int goodsCount1, double goodsPrice1, int goodsCount2, double goodsPrice2) {
        final int minCost = 1000;
        final int minGoodsCount = 10;
        final int discount1 = 5;
        final int discount2 = 10;

        double finalOrderCost = goodsCount1 * goodsPrice1 + goodsCount2 * goodsPrice2;
        double epsilon = 1e-3;

        if (goodsCount1 + goodsCount2 >= minGoodsCount && finalOrderCost - minCost >= epsilon) {
            return finalOrderCost / 100 * discount2 + finalOrderCost;
        }

        if (goodsCount1 + goodsCount2 >= minGoodsCount || finalOrderCost - minCost >= epsilon) {
            return finalOrderCost / 100 * discount1 + finalOrderCost;
        }

        return finalOrderCost;
    }
}
