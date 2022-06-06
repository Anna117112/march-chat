package ru.geekbrains.march.chat.client;

@FunctionalInterface
public interface Callback {
    void callback(Object... args);
}
