package com.trev.fizzbuzz.inject.tapestry.services;

import java.util.stream.Stream;

public interface FizzBuzzNumberProvider
{

    Stream<Integer> getFizzBuzzNumbers();
}
