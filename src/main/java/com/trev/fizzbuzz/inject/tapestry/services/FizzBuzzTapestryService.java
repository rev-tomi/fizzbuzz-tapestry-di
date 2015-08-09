package com.trev.fizzbuzz.inject.tapestry.services;

import org.apache.tapestry5.ioc.annotations.Inject;

public class FizzBuzzTapestryService
{

    @Inject
    private FizzBuzzNumberProvider numberProvider;

    @Inject
    private FizzBuzzTextProvider textProvider;

    @Inject
    private FizzBuzzPrinter printer;

    public void doFizzBuzz()
    {
        for (final Integer num : numberProvider.getFizzBuzzNumbers())
        {
            final String msg = textProvider.getFizzBuzzText(num);
            printer.printFizzBuzz(msg);
        }
    }
}
