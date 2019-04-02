package com.ynh.designpattern.strategy;

import lombok.Getter;

/**
 * Created by niehua.yang on 2019/3/7
 */

public enum HandValueEnum {

    HANDVALUE_GUU(0, "石头"),
    HANDVALUE_CHO(1, "剪刀"),
    HANDVALUE_PAA(2, "布");

    @Getter
    private int code;

    @Getter
    private String desc;

    HandValueEnum(int code, String desc){ //构造函数默认私有
        this.code = code;
        this.desc = desc;
    }

    public static HandValueEnum getHandvalueGuuByCode(int code){
        //values() 所有枚举值的集合
        for(HandValueEnum handValue : values()){
            if(handValue.code == code){
                return handValue;
            }
        }
        //遍历完时若时没返回，所以别忘了这句。
        return null;
    }
}
