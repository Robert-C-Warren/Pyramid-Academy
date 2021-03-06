public class LevelText {
    public void levelOne(int userChoice) {
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

    public void levelTwo(int userChoice) {
        if (userChoice == 1)
        {
            System.out.println("""
                   The dragon lets out a heavy breath and replies
                   'Many wander these lands but few find my cave...
                   Now that you face me...You have a decision to make...
            
                   1) Draw your sword and charge full speed at the dragon.
                   2) Ask 'What decision would that be?'
                   3) Say 'Nice to meet you' and exit the cave.""");

        } else if (userChoice == 2) {
            System.out.println("""
                            The dragon laughs and turns its back to you
                            before you can retort it, and all of its treasures,
                            turns to stone and you are left speechless.""");
            System.exit(0);
        }
            System.out.println("Invalid Entry.");
    }

    public void levelThree(int userChoice) {
        if (userChoice == 1) {

            System.out.println("""
                            You take three large steps yelling loudly
                            as you charge...The dragon unleashes its flames
                            and burns you to a crisp before you have a chance
                            to react...........Game Over""");
            System.exit(0); //Game Ends if 1 was chosen

        } else if (userChoice == 2) {   //Three more dialog options become available

            System.out.println("""
                    The dragon says '1) You may take whatever treasures
                    you can carry from this cave but you may never return...
                    Or 2) you may leave and keep my existence a secret which, if
                    you keep to your promise, will be rewarded with a small
                    amount of gold delivered daily to your doorstep'""");

        }  else if (userChoice == 3) {

            System.out.println("""
                                You abruptly leave the cave, feeling lucky
                                you're still alive, but a sense of curiosity
                                looms as you wonder what could have been had you
                                continued conversing with the dragon.""");
            System.exit(0);

        } else {

            System.out.println("Invalid Entry.");
            System.exit(0);

        }
    }

    public void finalLevel(int userChoice) {
        if (userChoice == 1)
        {
            System.out.println("""
                                You take your weight in treasure and exit the cave,
                                Awaiting the praise and stories to be told when you
                                return home.""");
            System.exit(0);
        }
        else if (userChoice == 2)
        {
            System.out.println("""
                                You say goodbye to the dragon, skeptical that it
                                will keep its word, but hopeful at what the future
                                brings.""");
            System.exit(0);
        }
    }
}
