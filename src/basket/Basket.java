package basket;

import ball.BallCustom;

import java.util.ArrayList;
import java.util.List;

public class Basket {

    public List<BallCustom> ballsList = new ArrayList<>();

    public void addBall(BallCustom ball) {
        ballsList.add(ball);
    }
}
