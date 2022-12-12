package com.demo.iterator;


/**
 * 针对书架的迭代器
 *
 * @author LiHaoHan
 * @date 2022/12/12
 */
public class BookShelfIterator implements Iterator<Book> {

    private BookShelf bookShelf;
    private int index;

    /**
     * 初始化book容器
     *
     * @param bookShelf BookShelf
     */
    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < bookShelf.length();
    }

    @Override
    public Book next() {
        Book book = bookShelf.getBookAt(index);
        index++;
        return book;
    }
}
