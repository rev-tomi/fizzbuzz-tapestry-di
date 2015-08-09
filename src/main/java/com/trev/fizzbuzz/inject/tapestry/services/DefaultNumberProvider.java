package com.trev.fizzbuzz.inject.tapestry.services;

import java.util.Iterator;

public class DefaultNumberProvider implements FizzBuzzNumberProvider
{
    @Override
    public Iterable<Integer> getFizzBuzzNumbers()
    {
        final Iterator<Integer> iterator = new Iterator<Integer>()
        {

            private int current = 1;
            private final int max = 100;

            @Override
            public boolean hasNext()
            {
                return current <= max;
            }

            @Override
            public Integer next()
            {
                return current++;
            }

            @Override
            public void remove()
            {
                throw new UnsupportedOperationException();
            }

        };
        return new Iterable<Integer>()
        {

            @Override
            public Iterator<Integer> iterator()
            {
                return iterator;
            }

        };
    }
}
