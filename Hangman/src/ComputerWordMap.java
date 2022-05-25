import java.util.HashMap;

public class ComputerWordMap {
    public String word;

    public String getWord() {
        int min = 1;
        int max = 8;

        int key = (int) Math.floor(Math.random()*(max - min + 1) + min);

        HashMap<Integer, String> computerMap = new HashMap<>();
        computerMap.put(1, "car");
        computerMap.put(2, "cat");
        computerMap.put(3, "dog");
        computerMap.put(4, "your");
        computerMap.put(5, "candle");
        computerMap.put(6, "help");
        computerMap.put(7, "bowl");
        computerMap.put(8, "torque");


        return computerMap.get(key);
    }

    public void setWord(String word) {
        this.word = word;
    }
}
