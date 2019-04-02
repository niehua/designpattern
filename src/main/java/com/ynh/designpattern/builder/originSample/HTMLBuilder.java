package com.ynh.designpattern.builder.originSample;

/**
 * Created by niehua.yang on 2019/3/6
 * <p>
 * 具体的建造者
 */

import lombok.Getter;

import java.io.*;

public class HTMLBuilder extends Builder {

    @Getter
    private String filename;

    private PrintWriter writer;                                                     // 用于编写文件的PrintWriter

    @Override
    public void makeTitle(String title) {
        filename = title + ".html";                                                 // 将标题作为文件名
        try {
            writer = new PrintWriter(new FileWriter(filename));                     // 生成 PrintWriter
        } catch (IOException e) {
            e.printStackTrace();
        }
        writer.println("<html><head><title>" + title + "</title></head><body>");
        writer.println("<h1>" + title + "</h1>");
    }

    @Override
    public void makeString(String str) {
        writer.println("<p>" + str + "</p>");
    }

    @Override
    public void makeItems(String[] items) {                                         // HTML文件中的条目
        writer.println("<ul>");
        for (int i = 0; i < items.length; i++) {
            writer.println("<li>" + items[i] + "</li>");
        }
        writer.println("</ul>");
    }

    @Override
    public void close() {
        writer.println("</body></html>");
        writer.close();                                                             // 关闭writer
    }
}
