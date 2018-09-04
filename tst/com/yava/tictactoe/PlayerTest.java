package com.yava.tictactoe;

import com.yava.tictactoe.model.Player;

import static org.junit.Assert.*;

public class PlayerTest {
    @org.junit.Test
    public void getName() throws Exception {
        final String actualValue = "TestName";

        Player player = new Player(actualValue, null);

        assertEquals(actualValue, player.getName());
    }

    @org.junit.Test
    public void getFigure() throws Exception {

    }

}