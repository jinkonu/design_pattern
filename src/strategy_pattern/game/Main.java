package strategy_pattern.game;

public class Main {

    public static void main(String[] args) {

        Character queen = new Queen();
        queen.fight();

        Character king = new King();
        king.fight();
    }
}
