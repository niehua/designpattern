package com.ynh.designpattern.state;

import com.ynh.designpattern.state.state.State;

/**
 * Created by niehua.yang on 2019/3/12
 *
 * 前后，上下文
 */

public interface Context {

    /**
     * 设置时间
     * @param hour
     */
    void setClock(int hour);

    /**
     * 改变状态
     * @param state
     */
    void changeState(State state);

    /**
     * 联系警报中心
     * @param msg
     */
    void callSecurityCenter(String msg);

    /**
     * 在警报中心留下记录
     * @param msg
     */
    void recordLog(String msg);
}
