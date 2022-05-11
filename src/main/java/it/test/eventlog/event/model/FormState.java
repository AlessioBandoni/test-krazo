package it.test.eventlog.event.model;

import javax.mvc.RedirectScoped;


import java.io.Serializable;

@RedirectScoped
public class FormState implements Serializable {

    private Object obj;
    private String message;

    public <T> T getObj() {
        return (T) obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
