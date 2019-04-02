package com.ynh.designpattern.chainOfResponsibility.suppport;

import com.ynh.designpattern.chainOfResponsibility.Trouble;

/**
 * Created by niehua.yang on 2019/3/11
 * <p>
 * 责任链模式，推卸责任
 * <p>
 * 将多个链尾对象组成一条责任链，然后按照他们在职责链上的顺序一个一个找出谁应该负责处理，最后的人必须负责处理所发生的问题
 * 当一个人要求做一件事时如果他能做就自己做，如果不能做就将“要求”转给另外一个人。。。
 * <p>
 * 角色：处理者，解决问题的抽象类
 *
 * 特点：
 *      优点：
 *      1、弱化了发出请求的人和处理请求的人之间的关系
 *      2、动态的改变责任链
 *      3、专注于自己的工作
 *      缺点：
 *      1、推卸请求会导致处理延迟
 *
 */

public abstract class Support {
    private String name;
    /**
     * 要推卸给的对象
     */
    private Support next;

    public Support(String name) {           // 生成解决问题的实例
        this.name = name;
    }

    public Support setNext(Support next) {  // 设置要推卸给的对象
        this.next = next;
        return next;
    }

    public void support(Trouble trouble) {  // 解决问题的步骤
        if (resolve(trouble)) {
            done(trouble);
        } else if (next != null) {
            next.support(trouble);
        } else {
            fail(trouble);
        }
    }

    @Override
    public String toString() {              // 显示字符串
        return "[" + name + "]";
    }

    /**
     * 解决问题的方法
     * @param trouble
     * @return
     */
    protected abstract boolean resolve(Trouble trouble);

    protected void done(Trouble trouble) {  // 解决
        System.out.println(trouble + " is resolved by " + this + ".");
    }

    protected void fail(Trouble trouble) {  // 未解决
        System.out.println(trouble + " cannot be resolved.");
    }
}
