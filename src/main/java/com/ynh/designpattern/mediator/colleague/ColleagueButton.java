package com.ynh.designpattern.mediator.colleague;

import com.ynh.designpattern.mediator.mediator.Mediator;

import java.awt.Button;

public class ColleagueButton extends Button implements Colleague {
    private Mediator mediator;

    public ColleagueButton(String caption) {
        super(caption);
    }

    @Override
    public void setMediator(Mediator mediator) {            // 保存Mediator
        this.mediator = mediator;
    }

    @Override
    public void setColleagueEnabled(boolean enabled) {      // Mediator下达启用/禁用的指示
        setEnabled(enabled);
    }
}
