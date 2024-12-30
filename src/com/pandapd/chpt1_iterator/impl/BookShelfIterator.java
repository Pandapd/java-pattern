package com.pandapd.chpt1_iterator.impl;

import com.pandapd.chpt1_iterator.api.Iterator;

/**
 * 书架迭代器类
 */
public class BookShelfIterator implements Iterator<Book> {
    // 书架迭代器当前指向的下标
    private int index;
    // 书架迭代器要迭代的书架
    private BookShelf bookShelf;

    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
    }


    @Override
    public boolean hasNext() {
        return index < bookShelf.getLength();
    }

    @Override
    public Book next() {
        Book book = bookShelf.getBookAt(index);
        index++;
        return book;
    }
}
