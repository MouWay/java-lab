import Model.Color;
import Model.ColoredCircle;
import Model.Point;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Lab3 {
    public static void main(String[] args) {
        List<ColoredCircle> circles = new ArrayList<ColoredCircle>();
        Random rnd = new Random();
        for (int i = 0; i < 10000; i++){
            circles.add(
                    new ColoredCircle(
                            new Point(rnd.nextInt(1000), rnd.nextInt(1000)),
                            rnd.nextInt(1000) + 1,
                            Color.randomColor()
                    ));
        }

        var resultCircles = circles.stream().filter(
                        c -> c.getColor() == Color.Red && c.getR() < 900
                )
                .sorted(
                        Comparator.comparingInt(ColoredCircle::getR)
                )
                .toList();

        resultCircles.forEach(
                c -> {
                    System.out.printf("R = %d, Color = %s\n", c.getR(), c.getColor());
                }
        );

        var resultPoints = circles.stream().filter(
                        c -> c.getR() >= 100 && c.getR() <= 200
                )
                .map(
                        ColoredCircle::getPos
                ).toList();

        resultPoints.forEach(
                c -> {
                    System.out.printf("X = %d, Y = %d\n", c.getX(), c.getY());
                }
        );
    }
}
