package com.demo.iterator;

/**
 * @author LiHaoHan
 * @date 2022/12/12
 */
public class Test {
    /**
     * 迭代器模式
     * 它支持以不同的方式遍历一个聚合
     * 迭代器简化了聚合的接口
     * 在同一个聚合上可以有多个遍历
     *
     * @param args
     */
    public static void main(String[] args) {
        BookShelf shelf = new BookShelf(4);
        shelf.appendBook(new Book("数学"))
                .appendBook(new Book("英语"))
                .appendBook(new Book("java"))
                .appendBook(new Book("python"));
        Iterator<Book> iterator = shelf.iterator();
        while (iterator.hasNext()) {
            Book next = iterator.next();
            System.out.println("next = " + next);
        }
    }
}
