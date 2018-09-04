package com.yava.tictactoe.model;

import com.yava.tictactoe.exeptions.AlreadyOccupiedException;
import com.yava.tictactoe.exeptions.InvalidPointException;

import java.awt.*;

public class Field {
    private static final int FIELD_SIZE = 3;
    private final Figure[][] field = new Figure[FIELD_SIZE][FIELD_SIZE];

    public int getSize() {
        return FIELD_SIZE;
    }

    public Figure getFigure(final Point point) throws InvalidPointException {

        if (!checkPoint(point)) {
            throw new InvalidPointException();
        }

        return field[point.x][point.y];
    }

    public void setFigure(final Point point, final Figure figure) throws InvalidPointException {

        if (!checkPoint(point)) {
            throw new InvalidPointException();
        }

        field[point.x][point.y] = figure;
    }

    private boolean checkPoint(Point point) {
        return checkCoordinate(point.x) && checkCoordinate(point.y);
    }

    private boolean checkCoordinate(int coordinate) {
        return coordinate > 0 && coordinate <= FIELD_SIZE;
    }
}
