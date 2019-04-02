package com.ynh.designpattern.visitor.entry;

import com.ynh.designpattern.visitor.FileTreatmentException;
import lombok.Getter;

import java.util.Iterator;

public abstract class Entry implements Element {

    @Getter
    protected String name;

    public abstract int getSize();

    public Entry add(Entry entry) throws FileTreatmentException {       // 增加目录条目
        throw new FileTreatmentException();
    }

    public Iterator iterator() throws FileTreatmentException {    // 生成Iterator
        throw new FileTreatmentException();
    }

    @Override
    public String toString() {                                          // 显示字符串
        return getName() + " (" + getSize() + ")";
    }
}
