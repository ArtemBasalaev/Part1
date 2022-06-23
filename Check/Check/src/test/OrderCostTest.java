package test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderCostTest {
    @Test
    void getOderCost1() {
        double result = OrderCost.getOrderCost(4, 100, 4, 100);

        assertEquals(800, result);
    }

    @Test
    void getOderCost2() {
        double result = OrderCost.getOrderCost(5, 100, 4, 125);

        assertEquals(950, result);
    }

    @Test
    void getOderCost3() {
        double result = OrderCost.getOrderCost(10, 49.9, 10, 49.9);

        assertEquals(948.1, result);
    }

    @Test
    void getOderCost4() {
        double result = OrderCost.getOrderCost(5, 100, 5, 100);

        assertEquals(900, result);
    }
}