package com.ynh.designpattern.mediator.mediator;

/**
 * Created by niehua.yang on 2019/3/12
 *
 * 只有一个仲裁者,组员向仲裁者报告，向组员下达指示，组员之间不再交流,使得团队协同工作，仲裁者负责统一大家的意见
 * 例子中所有的决定都是有仲裁者的colleagueChanged方法下达的
 *
 * GUI程序主窗口都会用这个模式
 *
 * 实例程序：GUI应用程序，展示了一个登录框
 *
 * 角色：仲裁者，中介者
 *
 * 相关设计模式：
 *       1、Observer模式：有时会使用Observer模式来实现Mediator角色与Colleague角色之间的角色
 *                      两者通知的目的和视角不同。在Mediator模式中，虽然会发送通知，不过只是为了对Colleague角色进行仲裁；
 *                      而Observer模式，将Subject角色的状态变化通知给Observer角色，目的是使两者同步。
 *
 */

public interface Mediator {
    /**
     * 创建组员
     */
    void createColleagues();

    /**
     * 组员状态监视
     */
    void colleagueChanged();
}
