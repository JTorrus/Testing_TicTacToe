package test_pkg;

public class Game {
    public char giveChip(int currentTurn) {
        if (currentTurn % 2 == 0) {
            return 'X';
        } else {
            return 'O';
        }
    }
}
