package com.ynh.designpattern.mediator.colleague;

import com.ynh.designpattern.mediator.mediator.Mediator;

/**
 * Created by niehua.yang on 2019/3/12
 *
 * 角色：同事。表示向仲裁者进行报告的组员的接口，子类都是具体的同事
 */


public interface Colleague {
    /**
     * 设置仲裁者
     * @param mediator
     */
    void setMediator(Mediator mediator);

    /**
     * 设置组员能力
     * @param enabled
     */
    void setColleagueEnabled(boolean enabled);
}
