package com.lti.model;

public class Move {
    public Move(Pair source, Pair destination) {
        this.source = source;
        this.destination = destination;
    }

    private final Pair source;

    public Pair getSource() {
        return source;
    }

    public Pair getDestination() {
        return destination;
    }

    private final Pair destination;



}
