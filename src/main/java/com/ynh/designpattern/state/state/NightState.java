package com.ynh.designpattern.state.state;

import com.ynh.designpattern.state.Context;

/**
 * Created by niehua.yang on 2019/3/12
 *
 * 具体的状态
 */

public class NightState implements State {
    private static NightState singleton = new NightState();

    private NightState() {
    }

    public static State getInstance() {                 // 获取唯一实例
        return singleton;
    }

    @Override
    public void doClock(Context context, int hour) {
        if (9 <= hour && hour < 17) {
            context.changeState(DayState.getInstance());
        }
    }

    @Override
    public void doUse(Context context) {                // 使用金库
        context.callSecurityCenter("紧急：晚上使用金库！");
    }

    @Override
    public void doAlarm(Context context) {              // 按下警铃
        context.callSecurityCenter("按下警铃(晚上)");
    }

    @Override
    public void doPhone(Context context) {              // 正常通话
        context.recordLog("晚上的通话录音");
    }

    @Override
    public String toString() {                          // 显示表示类的文字
        return "[晚上]";
    }
}
