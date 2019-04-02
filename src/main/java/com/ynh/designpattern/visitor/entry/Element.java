package com.ynh.designpattern.visitor.entry;

import com.ynh.designpattern.visitor.visite.Visitor;

/**
 * Created by niehua.yang on 2019/3/11
 *
 * 元素
 */

public interface Element {
    void accept(Visitor v);
}
