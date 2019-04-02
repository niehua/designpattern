package com.ynh.designpattern.composite.entry;

/**
 * Created by niehua.yang on 2019/3/6
 *
 * 角色：树叶，不能放入其他对象
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
    protected void printList(String prefix) {
        System.out.println(prefix + "/" + this);
    }
}
