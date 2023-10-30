package com.pluralsight.abstractFactory;

public class VisaGoldValidator implements Validator {

    @Override
    public boolean isValid(CreditCard creditCard) {
        return false;
    }
}
