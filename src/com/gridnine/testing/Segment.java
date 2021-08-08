package com.gridnine.testing;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

/**
 *
 * @author kostya
 */
public class Segment {
    
    private final LocalDateTime departureDate;

    private final LocalDateTime arrivalDate;
    
    private final Integer id;

    Segment(final LocalDateTime dep, final LocalDateTime arr, Integer id) {
        departureDate = Objects.requireNonNull(dep);
        arrivalDate = Objects.requireNonNull(arr);
        this.id = id;
    }

    Segment(LocalDateTime date, LocalDateTime date0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public Integer getId() {
    return id;
    }

    LocalDateTime getDepartureDate() {
        return departureDate;
    }

    LocalDateTime getArrivalDate() {
        return arrivalDate;
    }

    @Override
    public String toString() {
        DateTimeFormatter fmt =
            DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm");
        return '|' + departureDate.format(fmt) + '|' + arrivalDate.format(fmt)
            + '|';
    }
    
    
}
