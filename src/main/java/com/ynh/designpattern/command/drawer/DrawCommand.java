package com.ynh.designpattern.command.drawer;

import com.ynh.designpattern.command.command.Command;

import java.awt.*;

public class DrawCommand implements Command {
    /**
     * 绘制对象
     */
    protected Drawable drawable;
    /**
     * 绘制位置
     */
    private Point position;

    /**
     * 构造函数
     * @param drawable
     * @param position
     */
    public DrawCommand(Drawable drawable, Point position) {
        this.drawable = drawable;
        this.position = position;
    }

    @Override
    public void execute() {
        drawable.draw(position.x, position.y);
    }
}
