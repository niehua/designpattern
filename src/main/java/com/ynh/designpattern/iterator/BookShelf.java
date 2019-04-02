package com.ynh.designpattern.iterator;

/**
 * Created by niehua.yang on 2019/3/6
 *
 * 具体的集合
 * 参考ArrayList
 * 不用泛型就只能存储一种对象
 */

import lombok.Getter;

public class BookShelf<E> implements Aggregate<E> {
    private Object[] books;//不能用E，因为new E[]不能初始化

    @Getter
    private int size = 0;

    public BookShelf(int maxsize) {
        this.books = new Object[maxsize];
    }

    public E get(int index) {
        return (E)books[index];
    }

    /**
     * 添加书，泛型起作用了
     */
    public void add(E book) {
        this.books[size++] = book;
    }

    @Override
    public Iterator iterator() {
        return new BookShelfIterator();
    }//获取迭代器


    /**
     *
     * 具体的迭代器
     * 作用：内部类迭代器遍历书架
     *  不能写成BookShelfIterator<E>，如果这样，那就是新定义了一个泛型，
     *  和集合BookShelf存的东西不一样了
     */
    private class BookShelfIterator implements Iterator<E> {
        private int index;

        @Override
        public boolean hasNext() {
            if (index < getSize()) {
                return true;
            } else {
                return false;
            }
        }

        @Override
        public E next() {
            return get(index++);
        }

    }
}
