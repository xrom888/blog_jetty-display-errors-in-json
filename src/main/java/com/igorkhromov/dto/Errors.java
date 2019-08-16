package com.igorkhromov.dto;

import java.util.ArrayList;
import java.util.List;

public class Errors {

    private String message;

    private List errors = new ArrayList();

    public Errors(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List getErrors() {
        return errors;
    }

    public void setErrors(List errors) {
        this.errors = errors;
    }
}
