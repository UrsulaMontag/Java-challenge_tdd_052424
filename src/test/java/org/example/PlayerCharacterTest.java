package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PlayerCharacterTest {
    @Test
    void getX_returns0_initially() {
        int expected = 0;
        int actual = PlayerCharacter.getX();
        assertEquals(expected, actual);
    }
}
