package lambdas;

import java.util.Random;
import java.util.function.Supplier;

public class GetRandomColor implements Supplier <String> {

    private static final String[] COLORS = {"red", "green", "blue", "yellow", "pink",
            "black", "white"};

    @Override
    public String get() {
        Supplier<Integer> randomGenerator = () -> new Random().nextInt(7);
        return COLORS[randomGenerator.get()];
    }
}

