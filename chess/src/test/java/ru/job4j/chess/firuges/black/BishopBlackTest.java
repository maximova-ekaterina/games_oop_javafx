package ru.job4j.chess.firuges.black;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;

public class BishopBlackTest {

    @Test
    public void whenPosition() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A1);
        Cell rsl = bishopBlack.position();
        assertThat(rsl, is(Cell.A1));
    }

    @Test
    public void whenCopy() {
        BishopBlack bishopBlack = new BishopBlack(Cell.E1);
        BishopBlack rsl = new BishopBlack(Cell.F2);
        assertThat(rsl, is(bishopBlack.copy(Cell.F2)));
    }

    @Test
    public void whenWayFromC1ToG5() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell[] expected = {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        assertThat(bishopBlack.way(Cell.G5), is(expected));
    }

    @Test
    public void whenIsDiagonalTrue() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C6);
        assertTrue(bishopBlack.isDiagonal(Cell.C6, Cell.E4));
    }

    @Test
    public void whenIsDiagonalFalse() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C6);
        assertFalse(bishopBlack.isDiagonal(Cell.C6, Cell.F6));
    }
}