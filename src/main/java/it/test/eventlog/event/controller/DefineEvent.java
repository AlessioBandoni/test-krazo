package it.test.eventlog.event.controller;

import it.test.eventlog.event.forms.DefineEventForm;
import it.test.eventlog.event.model.FormState;

import javax.inject.Inject;
import javax.mvc.Controller;
import javax.mvc.Models;
import javax.mvc.binding.BindingResult;
import javax.validation.Valid;
import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;


@Path("/define-event")
@Controller
public class DefineEvent {


    @Inject
    private FormState formState;

    @Inject
    private BindingResult bindingError;

    @Inject
    private Models models;

    @GET
    public String get() {
        models.put("event", formState.getObj());
        return "event/define-event.jsp";
    }

    @POST
    public String post(@BeanParam @Valid DefineEventForm form) {

        return "redirect:/define-event";
    }
}
