package com.ynh.designpattern.state.state;

import com.ynh.designpattern.state.Context;

public class DayState implements State {
    private static DayState singleton = new DayState();

    private DayState() {
    }

    public static State getInstance() {                 // 获取唯一实例
        return singleton;
    }

    @Override
    public void doClock(Context context, int hour) {
        if (hour < 9 || 17 <= hour) {
            context.changeState(NightState.getInstance());
        }
    }

    @Override
    public void doUse(Context context) {                // 使用金库
        context.recordLog("使用金库(白天)");
    }

    @Override
    public void doAlarm(Context context) {              // 按下警铃
        context.callSecurityCenter("按下警铃(白天)");
    }

    @Override
    public void doPhone(Context context) {              // 正常通话
        context.callSecurityCenter("正常通话(白天)");
    }

    @Override
    public String toString() {                          // 显示表示类的文字
        return "[白天]";
    }
}
