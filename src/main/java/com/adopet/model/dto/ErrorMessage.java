package com.adopet.model.dto;

import lombok.Data;

@Data
public class ErrorMessage extends Exception {
    private String error;
    private String message;
    public ErrorMessage(String error, String message){
        super(message);
        this.error = error;
        this.message= message;
    }
}
