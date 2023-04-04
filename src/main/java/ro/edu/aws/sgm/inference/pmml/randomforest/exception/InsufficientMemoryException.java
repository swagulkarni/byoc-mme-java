package ro.edu.aws.sgm.inference.pmml.randomforest.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

public class InsufficientMemoryException extends RuntimeException {

    @ResponseStatus(HttpStatus.INSUFFICIENT_STORAGE)
    public InsufficientMemoryException(String exception){
        super(exception);
    }
}
