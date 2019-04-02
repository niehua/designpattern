package com.ynh.designpattern.decorator.border;

/**
 * @author niehua.yang
 * @date 2019/3/28
 *
 * 角色：装饰物
 */

import com.ynh.designpattern.decorator.display.Display;

public abstract class Border extends Display {
    /**
     * 表示被装饰物
     */
    protected Display display;

    /**
     * 在生成实例时通过参数指定被装饰物
     * @param display
     */
    protected Border(Display display) {
        this.display = display;
    }
}
