package com.pandapd.chpt1_iterator;

import com.pandapd.chpt1_iterator.api.Iterator;
import com.pandapd.chpt1_iterator.impl.Book;
import com.pandapd.chpt1_iterator.impl.BookShelf;

public class Test {
    public static void main(String[] args) {
        BookShelf bf = new BookShelf(4);
        bf.appendBook(new Book("A"));
        bf.appendBook(new Book("B"));
        bf.appendBook(new Book("C"));
        bf.appendBook(new Book("D"));
        bf.appendBook(new Book("E"));
        bf.appendBook(new Book("F"));
        Iterator<Book> bookIterator = bf.iterator();

        // 使用迭代器对书架进行迭代
        while (bookIterator.hasNext()) {
            Book next = bookIterator.next();
            System.out.println(next.getName());
        }
    }
}
