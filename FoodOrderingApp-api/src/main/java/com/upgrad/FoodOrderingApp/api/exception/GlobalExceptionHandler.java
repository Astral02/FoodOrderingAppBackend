package com.upgrad.FoodOrderingApp.api.exception;

import com.upgrad.FoodOrderingApp.api.model.ErrorResponse;
import com.upgrad.FoodOrderingApp.service.exception.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalExceptionHandler extends Exception {

    /**
     *  Used by Signup Restriction
     * @param exe
     * @param request
     * @return
     */
    @ExceptionHandler(SignUpRestrictedException.class)
    public ResponseEntity<ErrorResponse> signUpRestrictedException(SignUpRestrictedException exe, WebRequest request) {
        return new ResponseEntity<ErrorResponse>(
                new ErrorResponse().code(exe.getCode()).message(exe.getErrorMessage()), HttpStatus.BAD_REQUEST
        );
    }
    /**
     *  Used when Authentication failed exception is raised
     *  @param exe
     * @param request
     * @return
     */
    @ExceptionHandler(AuthenticationFailedException.class)
    public ResponseEntity<ErrorResponse> authenticationFailedException(AuthenticationFailedException exe, WebRequest request) {
        return new ResponseEntity<ErrorResponse>(
                new ErrorResponse().code(exe.getCode()).message(exe.getErrorMessage()), HttpStatus.UNAUTHORIZED
        );
    }
    /**
     *  Called when authorization is failed
     * @param exe
     * @param request
     * @return
     */
    @ExceptionHandler(AuthorizationFailedException.class)
    public ResponseEntity<ErrorResponse> authorizationFailedException(AuthorizationFailedException exe, WebRequest request) {
        return new ResponseEntity<ErrorResponse>(
                new ErrorResponse().code(exe.getCode()).message(exe.getErrorMessage()), HttpStatus.FORBIDDEN
        );
    }
    /**
     *  Called when customer update fails
     * @param exe
     * @param request
     * @return
     */
    @ExceptionHandler(UpdateCustomerException.class)
    public ResponseEntity<ErrorResponse> updateCustomerException(UpdateCustomerException exe, WebRequest request) {
        return new ResponseEntity<ErrorResponse>(
                new ErrorResponse().code(exe.getCode()).message(exe.getErrorMessage()), HttpStatus.BAD_REQUEST
        );
    }
    /**
     * Coupon not found exception
     * @param exe
     * @param request
     * @return
     */
    @ExceptionHandler(CouponNotFoundException.class)
    public ResponseEntity<ErrorResponse> couponNotFoundException(CouponNotFoundException exe, WebRequest request) {
        return new ResponseEntity<ErrorResponse>(
                new ErrorResponse().code(exe.getCode()).message(exe.getErrorMessage()), HttpStatus.NOT_FOUND
        );
    }
    /**
     *  Payment method not found exception
     * @param exe
     * @param request
     * @return
     */
    @ExceptionHandler(PaymentMethodNotFoundException.class)
    public ResponseEntity<ErrorResponse> paymentMethodNotFoundException(PaymentMethodNotFoundException exe, WebRequest request) {
        return new ResponseEntity<ErrorResponse>(
                new ErrorResponse().code(exe.getCode()).message(exe.getErrorMessage()), HttpStatus.NOT_FOUND
        );
    }
    /**
     *  When restaurant nor found exception is raised
     * @param exe
     * @param request
     * @return
     */
    @ExceptionHandler(RestaurantNotFoundException.class)
    public ResponseEntity<ErrorResponse> restaurantNotFoundException(RestaurantNotFoundException exe, WebRequest request) {
        return new ResponseEntity<ErrorResponse>(
                new ErrorResponse().code(exe.getCode()).message(exe.getErrorMessage()), HttpStatus.NOT_FOUND
        );
    }

    /**
     *  Item not found exception
     * @param exe
     * @param request
     * @return
     */
    @ExceptionHandler(ItemNotFoundException.class)
    public ResponseEntity<ErrorResponse> itemNotFoundException(ItemNotFoundException exe, WebRequest request) {
        return new ResponseEntity<ErrorResponse>(
                new ErrorResponse().code(exe.getCode()).message(exe.getErrorMessage()), HttpStatus.NOT_FOUND
        );
    }

    /**
     *  Category Not found exception
     * @param exe
     * @param request
     * @return
     */
    @ExceptionHandler(CategoryNotFoundException.class)
    public ResponseEntity<ErrorResponse> categoryNotFoundException(CategoryNotFoundException exe, WebRequest request) {
        return new ResponseEntity<ErrorResponse>(
                new ErrorResponse().code(exe.getCode()).message(exe.getErrorMessage()), HttpStatus.NOT_FOUND
        );
    }
}