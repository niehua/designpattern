package com.ynh.designpattern.visitor.entry;

import com.ynh.designpattern.visitor.visite.Visitor;

/**
 * Created by niehua.yang on 2019/3/11
 *
 * ConcreteElement
 */

public class File extends Entry {

    private int size;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
