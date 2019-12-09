package org.launchcode.techjobs_oo;

import java.util.Objects;

public class PositionType extends JobField {
    private static int nextId = 1;

    public PositionType() {
        super();
        this.id = nextId;
        nextId++;
    }

    public PositionType(String value) {
        super(value);
    }

}
