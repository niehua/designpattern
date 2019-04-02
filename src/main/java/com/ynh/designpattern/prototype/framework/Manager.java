package com.ynh.designpattern.prototype.framework;

/**
 * Created by niehua.yang on 2019/3/6
 *
 * 使用者
 */

import java.util.*;

public class Manager {
    private HashMap<String, Product> showcase = new HashMap<>();

    public void register(String name, Product proto) {
        showcase.put(name, proto);
    }

    public Product create(String protoname) {
        Product p = showcase.get(protoname);
        return p.createClone();
    }
}
