package ru.netology.calculator;

@FunctionalInterface
public interface Supplier<Calculator> {
    Calculator get();
}
