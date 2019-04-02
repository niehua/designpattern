package com.ynh.designpattern.factoryMethod.idcard;

/**
 * Created by niehua.yang on 2019/3/6
 *
 * 工厂负责生成的对象
 *
 * 具体的产品
 */


import com.ynh.designpattern.factoryMethod.framework.Product;
import lombok.Getter;

public class IDCard extends Product {

    @Getter
    private String owner;

    public IDCard(String owner) {
        System.out.println("制作" + owner + "的ID卡。");
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println("使用" + owner + "的ID卡。");
    }

}
