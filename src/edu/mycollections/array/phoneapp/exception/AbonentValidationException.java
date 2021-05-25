package edu.mycollections.array.phoneapp.exception;

import edu.mycollections.array.phoneapp.model.Abonent;

public class AbonentValidationException extends RuntimeException{

    Abonent abonent;
    protected static final String DEFAULT_MESSAGE = "Abonent is not valid for operation";
    public Abonent getAbonent (){

        return abonent;
    }

    public AbonentValidationException(){

        super();
    }
    public AbonentValidationException(String operation){
        super(operation != null ? (DEFAULT_MESSAGE + " " + operation) : (DEFAULT_MESSAGE));
    }
    public AbonentValidationException(String operation, Abonent abonent){
        this(operation);
        this.abonent = abonent;
    }
}
