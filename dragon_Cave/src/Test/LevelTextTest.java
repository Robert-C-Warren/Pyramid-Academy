import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LevelTextTest {

    @BeforeEach
    void setUp() {
    }


    @Test
    void levelOne() {
        LevelText levelText = new LevelText();
        levelText.levelOne(2);
    }

    @Test
    void levelTwo() {
        LevelText levelText = new LevelText();
        levelText.levelTwo(2);
    }

    @Test
    void levelThree() {
        LevelText levelText = new LevelText();
        levelText.levelThree(1);
    }

    @Test
    void finalLevel() {
        LevelText levelText = new LevelText();
        levelText.finalLevel(1);
    }

    @AfterEach
    void tearDown() {
    }
}
