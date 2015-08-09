package com.trev.fizzbuzz.inject.tapestry;

import java.util.stream.Stream;

public interface FizzBuzzNumberProvider
{

    Stream<Integer> getFizzBuzzNumbers();
}
