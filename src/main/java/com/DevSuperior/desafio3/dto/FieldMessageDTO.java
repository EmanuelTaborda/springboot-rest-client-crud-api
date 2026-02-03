package com.DevSuperior.desafio3.dto;

public class FieldMessageDTO {

    private String fieldName;
    private String error;

    public FieldMessageDTO(String fieldName, String error) {
        this.fieldName = fieldName;
        this.error = error;
    }

    public String getFieldName() {
        return fieldName;
    }

    public String getError() {
        return error;
    }
}
