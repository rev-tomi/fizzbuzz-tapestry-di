package com.trev.fizzbuzz.inject.tapestry;

public class FizzBuzzTapestryService
{

    private final FizzBuzzNumberProvider numberProvider;
    private final FizzBuzzTextProvider textProvider;
    private final FizzBuzzPrinter printer;

    /**
     * A constructor that needs module configuration.
     *
     * @param numberProvider creates a Stream of Integer
     * @param textProvider translates integers to text
     * @param printer prints the texts
     */
    public FizzBuzzTapestryService(final FizzBuzzNumberProvider numberProvider,
        final FizzBuzzTextProvider textProvider,
        final FizzBuzzPrinter printer)
    {
        this.numberProvider = numberProvider;
        this.textProvider = textProvider;
        this.printer = printer;
    }

    public void doFizzBuzz()
    {
        numberProvider.getFizzBuzzNumbers().forEach(num -> {
            final String msg = textProvider.getFizzBuzzText(num);
            printer.printFizzBuzz(msg);
        });
    }
}
