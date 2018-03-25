package test_pkg;

import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class GameTest {
    @Test
    public void checkWinnerWithCellsInColumnWorks() {
        Position positionUnderTest = mock(Position.class);
        when(positionUnderTest.getPosX()).thenReturn(1);
        when(positionUnderTest.getPosY()).thenReturn(0);

        Board boardUnderTest = new Board();
        Game gameUnderTest = new Game();

        for (int i = 0; i < boardUnderTest.getCells().length; i++) {
            for (int j = 0; j < boardUnderTest.getCells()[0].length; j++) {
                boardUnderTest.getCells()[i][j] = new Cell('?');
            }
        }

        boardUnderTest.getCells()[positionUnderTest.getPosX()][positionUnderTest.getPosY()].setChip('X');
        boardUnderTest.getCells()[positionUnderTest.getPosX() + 1][positionUnderTest.getPosY()].setChip('X');
        boardUnderTest.getCells()[positionUnderTest.getPosX() - 1][positionUnderTest.getPosY()].setChip('X');

        Assert.assertTrue(gameUnderTest.checkWinner(boardUnderTest));
    }

    @Test
    public void checkWinnerWithCellsInRowWorks() {
        Position positionUnderTest = mock(Position.class);
        when(positionUnderTest.getPosX()).thenReturn(0);
        when(positionUnderTest.getPosY()).thenReturn(1);

        Board boardUnderTest = new Board();
        Game gameUnderTest = new Game();

        for (int i = 0; i < boardUnderTest.getCells().length; i++) {
            for (int j = 0; j < boardUnderTest.getCells()[0].length; j++) {
                boardUnderTest.getCells()[i][j] = new Cell('?');
            }
        }

        boardUnderTest.getCells()[positionUnderTest.getPosX()][positionUnderTest.getPosY()].setChip('X');
        boardUnderTest.getCells()[positionUnderTest.getPosX()][positionUnderTest.getPosY() + 1].setChip('X');
        boardUnderTest.getCells()[positionUnderTest.getPosX()][positionUnderTest.getPosY() - 1].setChip('X');

        Assert.assertTrue(gameUnderTest.checkWinner(boardUnderTest));
    }

    @Test
    public void checkWinnerWithCellsInDiagonalWorks() {
        Position positionUnderTest = mock(Position.class);
        when(positionUnderTest.getPosX()).thenReturn(1);
        when(positionUnderTest.getPosY()).thenReturn(1);

        Board boardUnderTest = new Board();
        Game gameUnderTest = new Game();

        for (int i = 0; i < boardUnderTest.getCells().length; i++) {
            for (int j = 0; j < boardUnderTest.getCells()[0].length; j++) {
                boardUnderTest.getCells()[i][j] = new Cell('?');
            }
        }

        boardUnderTest.getCells()[positionUnderTest.getPosX()][positionUnderTest.getPosY()].setChip('X');
        boardUnderTest.getCells()[positionUnderTest.getPosX() + 1][positionUnderTest.getPosY() + 1].setChip('X');
        boardUnderTest.getCells()[positionUnderTest.getPosX() - 1][positionUnderTest.getPosY() - 1].setChip('X');

        Assert.assertTrue(gameUnderTest.checkWinner(boardUnderTest));
    }

    @Test
    public void checkWinnerWithCellsInDiagonalInverseWorks() {
        Position positionUnderTest = mock(Position.class);
        when(positionUnderTest.getPosX()).thenReturn(0);
        when(positionUnderTest.getPosY()).thenReturn(2);

        Board boardUnderTest = new Board();
        Game gameUnderTest = new Game();

        for (int i = 0; i < boardUnderTest.getCells().length; i++) {
            for (int j = 0; j < boardUnderTest.getCells()[0].length; j++) {
                boardUnderTest.getCells()[i][j] = new Cell('?');
            }
        }

        boardUnderTest.getCells()[positionUnderTest.getPosX()][positionUnderTest.getPosY()].setChip('X');
        boardUnderTest.getCells()[positionUnderTest.getPosX() + 1][positionUnderTest.getPosY() - 1].setChip('X');
        boardUnderTest.getCells()[positionUnderTest.getPosX() + 2][positionUnderTest.getPosY() - 2].setChip('X');

        Assert.assertTrue(gameUnderTest.checkWinner(boardUnderTest));
    }

    @Test
    public void checkDrawWhenThereIsNoMoreRoomForPuttingCellsWorks() {
        Board boardUnderTest = new Board();
        Game gameUnderTest = new Game();

        for (int i = 0; i < boardUnderTest.getCells().length; i++) {
            for (int j = 0; j < boardUnderTest.getCells()[0].length; j++) {
                boardUnderTest.getCells()[i][j] = new Cell('?');
            }
        }

        Assert.assertTrue(gameUnderTest.gameHasFinished(boardUnderTest));
    }
}