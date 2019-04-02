package com.ynh.designpattern.visitor.entry;

import com.ynh.designpattern.visitor.visite.Visitor;

import java.util.Iterator;
import java.util.ArrayList;

public class Directory extends Entry {

    /**
     * 目录条目集合
     */
    private ArrayList dir = new ArrayList();

    public Directory(String name) {         // 构造函数
        this.name = name;
    }

    @Override
    public int getSize() {                  // 获取大小
        int size = 0;
        Iterator it = dir.iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            size += entry.getSize();
        }
        return size;
    }

    @Override
    public Entry add(Entry entry) {         // 增加目录条目
        dir.add(entry);
        return this;
    }

    @Override
    public Iterator iterator() {      // 生成Iterator
        return dir.iterator();
    }

    @Override
    public void accept(Visitor v) {         // 接受访问者的访问
        v.visit(this);
    }
}
