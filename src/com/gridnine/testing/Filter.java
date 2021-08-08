
package com.gridnine.testing;

import java.util.List;
import java.util.Set;

/**
 *
 * @author kostya
 */
public interface Filter {
    
    void showAllSegments(List<Flight> flights);
    Set<Flight> getDepartureTimeBeforeNow(List<Flight> flights);
    Set<Flight> getArrivalDateLessDepartureDate(List<Flight> flights);
    Set<Flight> getFlightWithTransferMoreThanTwoHours(List<Flight> flights);
}
