package com.gridnine.testing;

import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author kostya
 */
public class Flight {
    private final List<Segment> segments;
    private final Integer number;

    Flight(final List<Segment> segs, Integer number) {
        segments = segs;
        this.number = number;
    }

    Flight(List<Segment> segments) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public Integer getId() {
    return number;
    }

    List<Segment> getSegments() {
        return segments;
    }

    @Override
    public String toString() {
        return segments.stream().map(Object::toString)
            .collect(Collectors.joining(" "));
    }
}
