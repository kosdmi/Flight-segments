
package com.gridnine.testing;

import java.util.List;

/**
 *
 * @author kostya
 */
public class Main {

    
    public static void main(String[] args) {
              
        SegmentFilter segF = new SegmentFilter();
        
        FlightBuilder flB = new FlightBuilder();
        
        List<Flight> flList = flB.createFlights();
        
        segF.showAllSegments(flList);
                
        segF.printDeparture();
        segF.getDepartureTimeBeforeNow(flList);
        
        segF.printArrival();
        segF.getArrivalDateLessDepartureDate(flList);
        
        segF.printTransfer();
        segF.getFlightWithTransferMoreThanTwoHours(flList);
        
        
    }
    
}
