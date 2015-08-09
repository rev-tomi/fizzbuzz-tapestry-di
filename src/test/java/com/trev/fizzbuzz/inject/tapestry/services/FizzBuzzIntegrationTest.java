package com.trev.fizzbuzz.inject.tapestry.services;

import static org.testng.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.apache.tapestry5.ioc.Registry;
import org.apache.tapestry5.ioc.RegistryBuilder;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FizzBuzzIntegrationTest
{

    private PrintStream sysOut;
    private ByteArrayOutputStream spyStream;
    private String lineBreak;

    @BeforeMethod
    public void setUp()
    {
        sysOut = System.out;
        spyStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(spyStream));
        lineBreak = String.format("%n");
    }

    @AfterMethod
    public void tearDown()
    {
        System.setOut(sysOut);
    }

    @Test
    public void testFizzBuzz()
    {
        // GIVEN
        final FizzBuzzTapestryService sut = createSystemUnderTest();

        // WHEN
        sut.doFizzBuzz();

        // THEN
        final String expected = createExpectedFizzBuzzMessage();
        assertEquals(expected, spyStream.toString());
    }

    private FizzBuzzTapestryService createSystemUnderTest()
    {
        final RegistryBuilder builder = new RegistryBuilder();
        builder.add(FizzBuzzTestModule.class); // test module

        final Registry registry = builder.build();
        registry.performRegistryStartup();

        return registry.getService(FizzBuzzTapestryService.class);
    }

    private String createExpectedFizzBuzzMessage()
    {
        final StringBuilder sb = new StringBuilder();
        appendFizzBuzzMessage(sb, "1");
        appendFizzBuzzMessage(sb, "2");
        appendFizzBuzzMessage(sb, "Fizz");
        appendFizzBuzzMessage(sb, "Buzz");
        appendFizzBuzzMessage(sb, "Fizz");
        appendFizzBuzzMessage(sb, "7");
        appendFizzBuzzMessage(sb, "14");
        appendFizzBuzzMessage(sb, "FizzBuzz");
        appendFizzBuzzMessage(sb, "16");
        return sb.toString();
    }

    private void appendFizzBuzzMessage(final StringBuilder builder, final String msg)
    {
        builder.append(msg).append(lineBreak);
    }

}
