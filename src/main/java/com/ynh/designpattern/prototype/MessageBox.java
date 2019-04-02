package com.ynh.designpattern.prototype;

/**
 * Created by niehua.yang on 2019/3/6
 * <p>
 * 将字符串放入方框中显示出来
 *
 * 具体的原型
 */

import com.ynh.designpattern.prototype.framework.Product;
import lombok.Getter;
import lombok.Setter;

public class MessageBox implements Product {

    @Getter
    @Setter
    private char decochar;

    public MessageBox(char decochar) {
        this.decochar = decochar;
    }

    @Override
    public void use(String s) {
        int length = s.getBytes().length;
        for (int i = 0; i < length + 4; i++) {//上
            System.out.print(decochar);
        }
        System.out.println("");

        System.out.println(decochar + " " + s + " " + decochar);//中

        for (int i = 0; i < length + 4; i++) {//下
            System.out.print(decochar);
        }
        System.out.println("");
    }

    @Override
    public Product createClone() {
        Product p = null;
        try {
            p = (Product) clone();//Object的本地方法
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }
}
