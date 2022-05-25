public class HangmanVisual {
    private int fail = 0;
    private String missed = "";

    public String getMissed() {
        return missed;
    }

    public void setMissed(String missed) {
        this.missed = missed;
    }

    public int getFail() {
        return fail;
    }

    public void setFail(int fail) {
        this.fail = fail;
    }

    public Object hangmanVisual(int fail) {
        switch (fail) {
            case 0: {
                return ("+---+\n\n" +
                        "    |\n\n" +
                        "    |\n\n" +
                        "    |\n\n" +
                        "   ===\n");
            }
            case 1: {
                return ("+---+\n\n" +
                        "  O |\n\n" +
                        "    |\n\n" +
                        "    |\n\n" +
                        "   ===\n") + ("Missed Letters: " + missed + "\n");
            }
            case 2: {
                return ("+---+\n\n" +
                        "  O |\n\n" +
                        " |  |\n\n" +
                        "    |\n\n" +
                        "   ===\n") + ("Missed Letters: " + missed + "\n");
            }
            case 3: {
                return ("+---+\n\n" +
                        "  O |\n\n" +
                        " | ||\n\n" +
                        "    |\n\n" +
                        "   ===\n") + ("Missed Letters: " + missed + "\n");
            }
            case 4: {
                return ("+---+\n\n" +
                        "  O |\n\n" +
                        " ||||\n\n" +
                        "    |\n\n" +
                        "   ===\n") + ("Missed Letters: " + missed + "\n");
            }
            case 5: {
                return ("+---+\n\n" +
                        "  O |\n\n" +
                        " ||||\n\n" +
                        " /  |\n\n" +
                        "   ===\n") + ("Missed Letters: " + missed + "\n");
            }
            case 6: {
                return ("+---+\n\n" +
                        "  O |\n\n" +
                        " ||||\n\n" +
                        " / \\|\n\n" +
                        "   ===\n") + ("Missed Letters: " + missed + "\n");
            }
            case 7: {
                return ("+---+\n" +
                        "  | |\n" +
                        "  O |\n\n" +
                        " ||||\n\n" +
                        " / \\|\n\n" +
                        "   ===\n") + ("You Lose");
            }
            default: {
                return null;
            }
        }
    }
}
