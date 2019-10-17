package com.eventRegistry;

public class event {
    private String eventTitle;
    private String city;
    private String ticketPrice;
    private String [] eventList1;

    public String[] getEventList1() {
        return eventList1;
    }

    public void setEventList1(String[] eventList1) {
        this.eventList1 = eventList1;
    }

    public String getEventTitle() {
        return eventTitle;
    }

    public void setEventTitle(String eventTitle) {
        this.eventTitle = eventTitle;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(String ticketPrice) {
        this.ticketPrice = ticketPrice;
    }



}
