import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

import java.util.HashMap;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class ComputerWordMapTest {
    private String word;
    @Test
    void testGetWord() {
        int min = 1;
        int max = 3;

        int key = (int) Math.floor(Math.random()*(max - min + 1) + min);

        HashMap<Integer, String> computerMap = new HashMap<>();
        computerMap.put(1, "car");
        computerMap.put(2, "cat");
        computerMap.put(3, "dog");
        computerMap.put(4, "yell");
        computerMap.put(5, "candle");
        computerMap.put(6, "hello");
        computerMap.put(7, "biscuit");
        computerMap.put(8, "total");

        System.out.println(computerMap.get(key));
        word = computerMap.get(key);
    }

}