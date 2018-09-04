package com.yava.tictactoe;

import static org.junit.Assert.*;

/**
 * Created by Yaroslav on 9/4/2018.
 */
public class PlayerTest {
    @org.junit.Test
    public void getName() throws Exception {
        final String actualValue = "TestName";
        final String expectedValue = actualValue;

        Player player = new Player(actualValue, null);

        assertEquals(expectedValue, player.getName());
    }

    @org.junit.Test
    public void getFigure() throws Exception {

    }

}