package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ChessBoardTest {
        @Test
        public void wayIs1() {
            int way = ChessBoard.way(0, 0, 1, 1);
            assertThat(way, is(1));
        }

        @Test
        public void wayIs4() {
            int way = ChessBoard.way(0, 0, 4, 4);
            assertThat(way, is(4));
        }

        @Test
        public void wayIs0() {
            int way = ChessBoard.way(0, 0, 5, 6);
            assertThat(way, is(0));
        }
    }