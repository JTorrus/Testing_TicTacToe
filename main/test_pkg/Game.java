package test_pkg;

public class Game {
    public char giveChip(int currentTurn) {
        if (currentTurn % 2 == 0) {
            return 'X';
        } else {
            return 'O';
        }
    }

    public boolean checkWinner(Board board) {
        if (gameHasFinished(board)) {
            return (board.getCells()[0][0].getChip() == 'X' && board.getCells()[0][1].getChip() == 'X' && board.getCells()[0][2].getChip() == 'X' ||
                    board.getCells()[1][0].getChip() == 'X' && board.getCells()[1][1].getChip() == 'X' && board.getCells()[1][2].getChip() == 'X' ||
                    board.getCells()[2][0].getChip() == 'X' && board.getCells()[2][1].getChip() == 'X' && board.getCells()[2][2].getChip() == 'X') ||
                    (board.getCells()[0][0].getChip() == 'X' && board.getCells()[1][0].getChip() == 'X' && board.getCells()[2][0].getChip() == 'X' ||
                            board.getCells()[0][1].getChip() == 'X' && board.getCells()[1][1].getChip() == 'X' && board.getCells()[2][1].getChip() == 'X' ||
                            board.getCells()[0][2].getChip() == 'X' && board.getCells()[1][2].getChip() == 'X' && board.getCells()[2][2].getChip() == 'X') ||
                    (board.getCells()[0][0].getChip() == 'X' && board.getCells()[1][1].getChip() == 'X' && board.getCells()[2][2].getChip() == 'X') ||
                    (board.getCells()[2][0].getChip() == 'X' && board.getCells()[1][1].getChip() == 'X' && board.getCells()[0][2].getChip() == 'X');
        } else {
            return false;
        }

    }

    public boolean gameHasFinished(Board board) {
        int counter = 0;

        for (int i = 0; i < board.getCells().length; i++) {
            for (int j = 0; j < board.getCells()[0].length; j++) {
                if (board.getCells()[i][j].getChip() != ' ') {
                    counter++;
                }
            }
        }

        return counter == board.getCells().length * board.getCells().length;
    }
}
