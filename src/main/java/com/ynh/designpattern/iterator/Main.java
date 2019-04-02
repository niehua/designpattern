package com.ynh.designpattern.iterator;

/**
 * Created by niehua.yang on 2019/3/6
 *
 * 类似for遍历循环
 *
 * 实例：将书（Book）放到书架(BookShelf)中，并将书的名字按顺序显示出来
 */

public class Main {
    public static void main(String[] args) {
        BookShelf<Book> bookShelf = new BookShelf<>(4);
        bookShelf.add(new Book("Around the World in 80 Days"));
        bookShelf.add(new Book("Bible"));
        bookShelf.add(new Book("Cinderella"));
        bookShelf.add(new Book("Daddy-Long-Legs"));
        Iterator<Book> it = bookShelf.iterator();
        while (it.hasNext()) {
            Book book = it.next();
            System.out.println(book.getName());
        }
    }
}
