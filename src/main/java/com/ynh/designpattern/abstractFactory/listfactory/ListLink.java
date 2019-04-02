package com.ynh.designpattern.abstractFactory.listfactory;

/**
 *
 * @author niehua.yang
 * @date 2019/3/27
 *
 * 角色：具体产品
 */

import com.ynh.designpattern.abstractFactory.factory.Link;

public class ListLink extends Link {
    public ListLink(String caption, String url) {
        super(caption, url);
    }

    @Override
    public String makeHTML() {
        return "  <li><a href=\"" + url + "\">" + caption + "</a></li>\n";
    }
}
