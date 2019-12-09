package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Employer extends JobField {

    private static int nextId = 1;

    public Employer() {
        super();
        id = nextId;
        nextId++;
    }

    public Employer(String value) {
        super(value);
    }

}
