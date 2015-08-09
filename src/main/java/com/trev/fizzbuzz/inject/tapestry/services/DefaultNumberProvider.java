package com.trev.fizzbuzz.inject.tapestry.services;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class DefaultNumberProvider implements FizzBuzzNumberProvider
{
    @Override
    public Stream<Integer> getFizzBuzzNumbers()
    {
        return IntStream.rangeClosed(1, 100).boxed();
    }

}
