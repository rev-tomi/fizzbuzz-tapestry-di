package com.trev.fizzbuzz.inject.tapestry.services;

import java.util.Arrays;

public class TestNumberProvider implements FizzBuzzNumberProvider
{

    @Override
    public Iterable<Integer> getFizzBuzzNumbers()
    {
        return Arrays.asList(1, 2, 3, 5, 6, 7, 14, 15, 16);
    }

}
