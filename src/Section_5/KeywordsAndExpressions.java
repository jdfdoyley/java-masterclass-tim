package Section_5;

public class KeywordsAndExpressions {
    public static void main(String[] args) {
        double kilometers = (100 * 1.609344);
        int highScore = 50;

        // add bonus points
        if (highScore > 25) highScore += 1000;

        int health = 100;
        if ((health < 25) && (highScore > 1000)) highScore -= 1000;
    }
}
