package lesson6;

public class OrderAmount {
    public static void main(String[] args) {
        double orderAmountWithDiscount = getOrderAmount(100, 5, 125, 4);
        System.out.println("Сумма вашего заказа составит: " + orderAmountWithDiscount);
    }

    public static double getOrderAmount(double product1Price, int products1Count, double product2Price, int products2Count) {
        final double orderAmountForDiscount = 1000;
        final int orderProductsCountForDiscount = 10;
        final double maxDiscount = 0.9;
        final double minDiscount = 0.95;

        double orderAmount = product1Price * products1Count + product2Price * products2Count;
        int orderProductsCount = products1Count + products2Count;

        double epsilon = 1.0e-6;

        if ((orderAmount - orderAmountForDiscount) >= -epsilon && orderProductsCount >= orderProductsCountForDiscount) {
            return orderAmount * maxDiscount;
        }

        if ((orderAmount - orderAmountForDiscount) >= -epsilon || orderProductsCount >= orderProductsCountForDiscount) {
            return orderAmount * minDiscount;
        }

        return orderAmount;
    }
}