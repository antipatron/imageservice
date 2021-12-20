package com.fakecompany.micro.image.exception;

public class DataDuplicatedException extends GeneralRuntimeException{

    private static final long serialVersionUID = 1L;

    public DataDuplicatedException(String message){
        super(DataDuplicatedException.class, message);
    }

}
