package Model;

import java.util.Random;

public enum Color {
    Red, Blue;

    private static final Random PRNG = new Random();

    public static Color randomColor()  {
        Color[] colors = values();
        return colors[PRNG.nextInt(colors.length)];
    }
}
