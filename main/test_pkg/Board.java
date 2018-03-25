package test_pkg;

public class Board {
    private Cell[][] cells;
    private Game game;

    public Board() {
        cells = new Cell[3][3];
        game = new Game();
    }

    public boolean makePlay(Position position) {
        if (checkIfACellIsEmpty(position)) {
            char currentChip = game.giveChip(0);
            cells[position.getPosX()][position.getPosY()].setChip(currentChip);
            return true;
        } else {
            return false;
        }
    }

    public Cell[][] getCells() {
        return cells;
    }

    public void setCells(Cell[][] cells) {
        this.cells = cells;
    }

    public boolean checkIfACellIsEmpty(Position position) {
        return cells[position.getPosX()][position.getPosY()].getChip() == ' ';
    }
}
