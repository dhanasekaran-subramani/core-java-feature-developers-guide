package com.ds2.java.functional;

@FunctionalInterface
public interface Converter<F, T> {

    T convert(F from);
}