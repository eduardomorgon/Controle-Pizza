package br.com.redonda.error;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.ErrorAttributes;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import br.com.redonda.error.exception.ResourceNotFoundException;

@ControllerAdvice
@RequestMapping(produces = "application/json")
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {
    
    @Autowired
    private ErrorAttributes errorAttributes;
    @Autowired
    private WebRequest webRequest;
    @Autowired
    private HttpServletRequest request; 

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<?> handleResourceNotFoundException(ResourceNotFoundException ex) {
        
        webRequest.setAttribute("javax.servlet.error.status_code", HttpStatus.NOT_FOUND.value(), 0); 
        webRequest.setAttribute("javax.servlet.error.request_uri", request.getRequestURI(), 0); 
        return new ResponseEntity<>(errorAttributes.getErrorAttributes(webRequest, false), HttpStatus.NOT_FOUND);
    }

}