package com.pandapd.chpt1_iterator.api;

/**
 * 集合
 * @param <T> 集合中的元素
 */
public interface Aggregate<T> {
    Iterator<T> iterator();
}
