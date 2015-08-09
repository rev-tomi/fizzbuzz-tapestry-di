package com.trev.fizzbuzz.inject.tapestry.services;

import org.apache.tapestry5.ioc.ServiceBinder;

public class FizzBuzzModule
{

    public static void bind(final ServiceBinder binder)
    {
        binder.bind(FizzBuzzNumberProvider.class, DefaultNumberProvider.class);
        binder.bind(FizzBuzzPrinter.class, DefaultFizzBuzzPrinter.class);
        binder.bind(FizzBuzzTextProvider.class, DefaultTextProvider.class);
        binder.bind(FizzBuzzTapestryService.class); // concrete service class

    }

}
