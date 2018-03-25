package test_pkg;

import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class BoardTest {
    @Test
    public void checkIfACellIsEmptyInTheBoardWorks() {
        Position positionUnderTest = mock(Position.class);
        when(positionUnderTest.getPosX()).thenReturn(1);
        when(positionUnderTest.getPosY()).thenReturn(2);

        Board boardUnderTest = new Board();

        for (int i = 0; i < boardUnderTest.getCells().length; i++) {
            for (int j = 0; j < boardUnderTest.getCells()[0].length; j++) {
                boardUnderTest.getCells()[i][j] = new Cell(' ');
            }
        }

        Assert.assertTrue(boardUnderTest.checkIfACellIsEmpty(positionUnderTest));
    }

    @Test
    public void checkIfACellIsNotEmptyInTheBoardWorks() {
        Position positionUnderTest = mock(Position.class);
        when(positionUnderTest.getPosX()).thenReturn(1);
        when(positionUnderTest.getPosY()).thenReturn(2);

        Board boardUnderTest = new Board();

        for (int i = 0; i < boardUnderTest.getCells().length; i++) {
            for (int j = 0; j < boardUnderTest.getCells()[0].length; j++) {
                boardUnderTest.getCells()[i][j] = new Cell(' ');
            }
        }

        boardUnderTest.getCells()[positionUnderTest.getPosX()][positionUnderTest.getPosY()].setChip('X');

        Assert.assertFalse(boardUnderTest.checkIfACellIsEmpty(positionUnderTest));
    }
}
