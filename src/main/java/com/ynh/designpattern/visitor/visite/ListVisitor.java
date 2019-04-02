package com.ynh.designpattern.visitor.visite;

/**
 * Created by niehua.yang on 2019/3/11
 *
 * 拜访者实例，拜访者处理的逻辑实现，新增处理时，只需要增加一个新的拜访者实例
 *
 * 角色：具体的访问者
 */

import com.ynh.designpattern.visitor.entry.Directory;
import com.ynh.designpattern.visitor.entry.Entry;
import com.ynh.designpattern.visitor.entry.File;

import java.util.Iterator;

public class ListVisitor extends Visitor {
    /**
     * 当前访问的文件夹的名字
     */
    private String currentdir = "";

    @Override
    public void visit(File file) {                  // 在访问文件时被调用
        System.out.println(currentdir + "/" + file);
    }

    @Override
    public void visit(Directory directory) {   // 在访问文件夹时被调用
        System.out.println(currentdir + "/" + directory);
        String savedir = currentdir;
        currentdir = currentdir + "/" + directory.getName();
        Iterator<Entry> it = directory.iterator();
        while (it.hasNext()) {
            Entry entry = it.next();
            entry.accept(this);
        }
        currentdir = savedir;
    }
}
