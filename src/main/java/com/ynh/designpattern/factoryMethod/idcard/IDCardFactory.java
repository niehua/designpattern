package com.ynh.designpattern.factoryMethod.idcard;


/**
 * Created by niehua.yang on 2019/3/6
 *
 * 负责生成对应对象的加工处理
 *
 * 具体的创建者
 */

import com.ynh.designpattern.factoryMethod.framework.Factory;
import com.ynh.designpattern.factoryMethod.framework.Product;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class IDCardFactory extends Factory {

    @Getter
    private List owners = new ArrayList();//此类工厂的注册表，记录哪些类是自己生成的

    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        owners.add(((IDCard) product).getOwner());
    }

}
