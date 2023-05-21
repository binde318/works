package com.bindebackend.bindebackend.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class StudentNotFoundException extends RuntimeException{
    private static final long serialVersionUID = 1l;
    private String resourcesName;
    private String fieldName;
    private Object fieldValue;



    public StudentNotFoundException(String resourcesName, String fieldName, Object fieldValue) {
        super(String.format("%s not found with %s : '%s'", resourcesName, fieldName, fieldValue));
        this.resourcesName = resourcesName;
        this.fieldName = fieldName;
        this.fieldValue = fieldValue;
    }

    public String getResourcesName() {
        return resourcesName;
    }

    public String getFieldName() {
        return fieldName;
    }

    public Object getFieldValue() {
        return fieldValue;
    }
}
