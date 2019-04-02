package com.ynh.designpattern.flyweight;

/**
 * Created by niehua.yang on 2019/3/12
 *
 * 角色：轻量级工厂
 */

import java.util.HashMap;

public class BigCharFactory {
    /**
     * 管理已经生成的BigChar的实例
     * 注意不要让共享的实例被GC回收了
     */
    private HashMap<String, BigChar> pool = new HashMap<>();
    /**
     * Singleton模式
     */
    private static final BigCharFactory singleton = new BigCharFactory();

    /**
     * 构造函数
     */
    private BigCharFactory() {
    }

    /**
     * 获取唯一的实例
     * @return
     */
    public static BigCharFactory getInstance() {
        return singleton;
    }

    /**
     * 生成（共享）BigChar类的实例
     * @param charname
     * @return
     */
    public synchronized BigChar getBigChar(char charname) {
        BigChar bc =  pool.get("" + charname);
        if (bc == null) {
            bc = new BigChar(charname);
            pool.put("" + charname, bc);
        }
        return bc;
    }
}
