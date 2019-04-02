package com.ynh.designpattern.iterator;


/**
 * Created by niehua.yang on 2019/3/6
 *
 * 集合： 实现该接口的可以保存多个元素的集合，像数组一样，也就是会被遍历
 * 类比：Iterable<T>
 *
 * 实例程序：迭代添加到书架上的4本书
 */

public interface Aggregate<T> {
    Iterator iterator();//生成遍历集合的迭代器
}
