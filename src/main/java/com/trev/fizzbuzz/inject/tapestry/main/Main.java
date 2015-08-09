package com.trev.fizzbuzz.inject.tapestry.main;

import org.apache.tapestry5.ioc.Registry;
import org.apache.tapestry5.ioc.RegistryBuilder;

import com.trev.fizzbuzz.inject.tapestry.services.FizzBuzzModule;
import com.trev.fizzbuzz.inject.tapestry.services.FizzBuzzTapestryService;

public class Main
{

    public static void main(final String[] args)
    {
        // code inspired by http://wiki.apache.org/tapestry/Tapestry5HowToIocOnly
        final RegistryBuilder builder = new RegistryBuilder();
        builder.add(FizzBuzzModule.class);

        final Registry registry = builder.build();
        registry.performRegistryStartup();

        final FizzBuzzTapestryService fizzBuzz = registry.getService(FizzBuzzTapestryService.class);
        fizzBuzz.doFizzBuzz();
    }

}
