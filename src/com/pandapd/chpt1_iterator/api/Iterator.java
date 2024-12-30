package com.pandapd.chpt1_iterator.api;

/**
 * 集合迭代器
 */
public interface Iterator<T> {
    boolean hasNext();
    T next();
}
