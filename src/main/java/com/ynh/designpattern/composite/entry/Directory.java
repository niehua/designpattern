package com.ynh.designpattern.composite.entry;

/**
 * Created by niehua.yang on 2019/3/6
 *
 * 角色：复合物：可以放入其他对象和复合物
 */


import java.util.Iterator;
import java.util.ArrayList;

public class Directory extends Entry {

    /**
     * 文件夹中目录条目的集合
     */
    private ArrayList<Entry> directory = new ArrayList<>();

    public Directory(String name) {         // 构造函数
        this.name = name;
    }

    @Override
    public int getSize() {                  // 获取大小
        int size = 0;
        Iterator<Entry> it = directory.iterator();
        while (it.hasNext()) {
            Entry entry = it.next();
            size += entry.getSize();
        }
        return size;
    }

    @Override
    public Entry add(Entry entry) {         // 增加目录条目
        directory.add(entry);
        return this;
    }

    @Override
    protected void printList(String prefix) {       // 显示目录条目一览
        System.out.println(prefix + "/" + this);
        Iterator<Entry> it = directory.iterator();
        while (it.hasNext()) {
            Entry entry = it.next();
            entry.printList(prefix + "/" + name);
        }
    }
}
