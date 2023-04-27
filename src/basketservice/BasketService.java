package basketservice;

import ball.BallCustom;

import java.util.List;

public class BasketService {

    public double calculateTotalWeight(List<BallCustom> ballsList) {
        double totalWeight = 0.0;
        for (BallCustom a : ballsList) {
            totalWeight += a.getWeight();
        }
        return totalWeight;
    }

    public int countByColor(List<BallCustom> ballsList, String color) {
        int result = 0;
        for (BallCustom ball : ballsList) {
            if (ball.getColor().equalsIgnoreCase(color)) {
                result++;
            }
        }
        return result;
    }
}



