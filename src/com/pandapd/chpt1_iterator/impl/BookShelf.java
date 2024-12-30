package com.pandapd.chpt1_iterator.impl;

import com.pandapd.chpt1_iterator.api.Aggregate;
import com.pandapd.chpt1_iterator.api.Iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 书架类
 */
public class BookShelf implements Aggregate<Book> {

    // 书架书本列表
    private List<Book> bookList;

    public BookShelf(int initSize) {
        this.bookList = new ArrayList<>(initSize);
    }

    /**
     * 增加书本
     */
    public void appendBook(Book newBook) {
        bookList.add(newBook);
    }

    /**
        获取书架现有的书本数量
     */
    public int getLength() {
        return bookList.size();
    }

    /**
        获取书架index位置的书本
     */
    public Book getBookAt(int index) {
        return bookList.get(index);
    }

    @Override
    public Iterator<Book> iterator() {
        return new BookShelfIterator(this);
    }
}
