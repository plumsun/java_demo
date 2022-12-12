package com.demo.iterator;

import java.util.ArrayList;

/**
 * 书架
 * @author LiHaoHan
 * @date 2022/12/12
 */
public class BookShelf implements Aggregate<Book> {
    private final ArrayList<Book> books;
    private int last;

    /**
     * 初始化book容器
     *
     * @param last int
     */
    public BookShelf(int last) {
        this.books = new ArrayList<>(last);
    }

    /**
     * 获取对应位置的book
     *
     * @param index int
     * @return Book
     */
    public Book getBookAt(int index) {
        return books.get(index);
    }

    /**
     * 将book存入容器
     *
     * @param book object
     */
    public BookShelf appendBook(Book book) {
        books.add(book);
        last++;
        return this;
    }

    /**
     * 获取容器大小
     *
     * @return int
     */
    public int length() {
        return books.size();
    }

    @Override
    public Iterator<Book> iterator() {
        return new BookShelfIterator(this);
    }
}
