package org.launchcode.techjobs_oo;

import java.util.Objects;

public class CoreCompetency extends JobField {
    private static int nextId = 1;

    public CoreCompetency() {
        super();
        this.id = nextId;
        nextId++;
    }

    public CoreCompetency(String value) {
        super(value);
    }
}
