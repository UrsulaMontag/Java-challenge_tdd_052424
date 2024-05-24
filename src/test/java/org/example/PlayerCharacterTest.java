package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PlayerCharacterTest {
    @BeforeEach
    void setUp() {
        //wird vor jedem Testfall ausgeführt
        PlayerCharacter.y = 0;
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
}
