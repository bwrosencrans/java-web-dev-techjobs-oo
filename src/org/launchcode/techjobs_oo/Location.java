package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Location extends JobField {
    private static int nextId = 1;

    public Location() {
        super();
        this.id = nextId;
        nextId++;
    }

    public Location(String value) {
        super(value);
    }

}