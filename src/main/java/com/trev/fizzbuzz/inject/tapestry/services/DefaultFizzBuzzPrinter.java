package com.trev.fizzbuzz.inject.tapestry.services;

public class DefaultFizzBuzzPrinter implements FizzBuzzPrinter
{

    @Override
    public void printFizzBuzz(final String msg)
    {
        System.out.println(msg);
    }

}
