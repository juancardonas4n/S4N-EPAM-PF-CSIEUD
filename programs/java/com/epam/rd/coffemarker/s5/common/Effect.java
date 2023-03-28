package com.epam.rd.coffemarker.s5.common;

public interface Effect<T> {
  void apply(T t);
}
