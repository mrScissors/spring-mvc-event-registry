package com.eventRegistry;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.ModelAndViewDefiningException;

import java.util.ArrayList;
import java.util.List;


@Controller
public class packageController {

    List<event> allEvents = new ArrayList<>();

    @RequestMapping(value = "/addEvent", method = RequestMethod.GET)
    public ModelAndView addEvent(ModelMap model) {

        return new ModelAndView("addEvent","eventForm",new event());
    }

    @RequestMapping(value="/submitEvent",  method = RequestMethod.POST)
    public String submitEvent(@ModelAttribute("eventForm")event eventForm, BindingResult result, ModelMap model){

        if (result.hasErrors()) {
            return "error";
        }
        event e = new event();
        e.setEventTitle(eventForm.getEventTitle());
        e.setCity(eventForm.getCity());
        e.setTicketPrice(eventForm.getTicketPrice());
        e.setEventList1(eventForm.getEventList1());
        allEvents.add(e);
        model.addAttribute("events", allEvents);
//        model.addAttribute("city", eventForm.getCity());
//        model.addAttribute("ticketPrice", eventForm.getTicketPrice());
//        //model.addAttribute("eventType", eventForm.getEventType());
//        model.addAttribute("favevent", eventForm.getEventList1());
        return "submitEvent";
    }


    @ModelAttribute("eventList1")
    public List<String> getEventList1(){
        List<String> eventTypeList1 = new ArrayList<>();
        eventTypeList1.add("Cricket");
        eventTypeList1.add("Football");
        eventTypeList1.add("Badminton");
//        model.addAttribute("eventType1", eventTypeList);
        return eventTypeList1;
    }

//    @RequestMapping(value="/submitEvent",  method = RequestMethod.GET)
//    public String submitEventDisplay(ModelMap model) {
//        model.addAttribute("name", "Hello World!");
//        return "submitEvent";
//    }
}
