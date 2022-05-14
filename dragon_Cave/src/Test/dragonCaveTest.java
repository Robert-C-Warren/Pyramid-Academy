import org.junit.jupiter.api.*;

import java.util.concurrent.ThreadLocalRandom;

class dragonCaveTest{

    @BeforeEach
    void levelOne() {
    }

    @Test
    public void levelOne(int userChoice) {
        userChoice = 1;
        if (userChoice == 1) {
            System.out.println("""
                        You approach the cave...
                        It is dark and spooky...
                        A large dragon jumps out in front of you! He opens his jaws and...
                        Gobbles you down in one bite!""");
            System.exit(0);//If one is selected game is over
        }
        else if (userChoice == 2) {
            System.out.println("""
                        You approach the cave...
                        You see the silhouette of a large dragon...
                        Before you can see it clearly, the dragon asks
                        'what brings you to these parts?'""");//Game continues if 2 is selected
        }
        //Quit if 1 or 2 is not selected
        else {
            System.out.println("Invalid Entry.");
            System.exit(0);
        }
    }

    @AfterEach
    void tearDown() {
    }

}