package basketservice.test;

import ball.BallCustom;
import basket.Basket;
import basketservice.BasketService;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class BasketServiceTest {

    @org.junit.jupiter.api.Test
    void calculateTotalWeightPositive() {
        double expected = 8.0;
        BallCustom ball = new BallCustom(4, "green");
        BallCustom ball1 = new BallCustom(4, "green");
        Basket basket = new Basket();
        BasketService basketService = new BasketService();
        basket.addBall(ball);
        basket.addBall(ball1);
        double actual = basketService.calculateTotalWeight(basket.ballsList);
        Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void countByColor() {
        int expected = 2;
        BallCustom ball = new BallCustom(4, "green");
        BallCustom ball1 = new BallCustom(5, "green");
        Basket basket = new Basket();
        BasketService basketService = new BasketService();
        basket.addBall(ball);
        basket.addBall(ball1);
        int actual = basketService.countByColor(basket.ballsList, "green");
        Assertions.assertEquals(expected, actual);
    }
}