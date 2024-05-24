package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PlayerCharacterTest {
    @BeforeEach
    void setUp() {
        //wird vor jedem Testfall ausgeführt
        PlayerCharacter.y = 0;
        PlayerCharacter.x = 0;
    }

    @Test
    void getX_returns0_initially() {
        int expected = 0;
        int actual = PlayerCharacter.getX();
        assertEquals(expected, actual);
    }

    @Test
    void getY_returns0_initially() {
        int expected = 0;
        int actual = PlayerCharacter.getY();
        assertEquals(expected, actual);
    }

    @Test
    void move_returns1forY_whenPlayerPressW() {
        int expected = 1;
        PlayerCharacter.move("W");
        int actual = PlayerCharacter.getY();
        assertEquals(expected, actual);
    }

    @Test
    void move_returnsMinus1forY_whenPlayerPressS() {
        int expected = -1;
        PlayerCharacter.move("s");
        int actual = PlayerCharacter.getY();
        assertEquals(expected, actual);
    }

    @Test
    void move_returnsMinus1forX_whenPlayerPressA() {
        int expected = -1;
        PlayerCharacter.move("a");
        int actual = PlayerCharacter.getX();
        assertEquals(expected, actual);
    }

    @Test
    void move_returns1forX_whenPlayerPressD() {
        int expected = 1;
        PlayerCharacter.move("d");
        int actual = PlayerCharacter.getX();
        assertEquals(expected, actual);
    }

    @Test
    void move_returns2forX_whenPlayerPressDTwice() {
        int expected = 2;
        PlayerCharacter.move("d");
        PlayerCharacter.move("d");
        int actual = PlayerCharacter.getX();
        assertEquals(expected, actual);
    }

    @Test
    void move_returnsMinus3forY_whenPlayerPressSThrice() {
        int expected = -3;
        PlayerCharacter.move("s");
        PlayerCharacter.move("s");
        PlayerCharacter.move("s");
        int actual = PlayerCharacter.getY();
        assertEquals(expected, actual);
    }

    @Test
    void move_returnsMinus2forX_whenPlayerPressATwice() {
        int expected = -2;
        PlayerCharacter.move("a");
        PlayerCharacter.move("a");
        int actual = PlayerCharacter.getX();
        assertEquals(expected, actual);
    }

    @Test
    void move_returnsMinus2forXAnd1ForY_whenPlayerPressATwiceAndW() {
        int expectedX = -2;
        int expectedY = 1;
        PlayerCharacter.move("a");
        PlayerCharacter.move("a");
        PlayerCharacter.move("w");
        int actualX = PlayerCharacter.getX();
        int actualY = PlayerCharacter.getY();
        assertEquals(expectedX, actualX);
        assertEquals(expectedY, actualY);
    }
}
