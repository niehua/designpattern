package com.ynh.designpattern.command;


/**
 * @author niehua.yang
 * @date 2019/3/6
 *
 * 把Java匿名内部类与适配器结合起来使用时，可以更轻松的编写程序
 * eg. 这里是主类直接实现的MouseMotionListener接口，而可以选择不实现它，用它的实现类MouseMotionAdapter,
 *      实现了接口的所有方法，但都是空的，因此我们只需要编写MouseMotionAdapter的子类，实现所需要的方法，
 *      无须关心其他不需要的方法。
 *      如：
 *      @Override
 *     public void mouseDragged(MouseEvent e) {
 *         Command cmd = new DrawCommand(canvas, e.getPoint());
 *         history.append(cmd);
 *         cmd.execute();
 *     }
 *     ->
 *     canvas.addMouseMotionListener(new MouseMotionAdapter(){
 *         public void mouseDragged(MouseEvent e) {
 *           Command cmd = new DrawCommand(canvas, e.getPoint());
 *           history.append(cmd);
 *           cmd.execute();
 *       }
 *     })
 *
 */

import com.ynh.designpattern.command.command.Command;
import com.ynh.designpattern.command.command.MacroCommand;
import com.ynh.designpattern.command.drawer.DrawCanvas;
import com.ynh.designpattern.command.drawer.DrawCommand;


import javax.swing.*;
import java.awt.event.*;

public class Main extends JFrame implements ActionListener, MouseMotionListener, WindowListener {
    /**
     * 绘制的历史记录
     */
    private MacroCommand history = new MacroCommand();
    /**
     * 绘制区域
     */
    private DrawCanvas canvas = new DrawCanvas(400, 400, history);
    /**
     * 删除按钮
     */
    private JButton clearButton  = new JButton("clear");

    /**
     * 构造函数
     * @param title
     */
    public Main(String title) {
        super(title);

        this.addWindowListener(this);
        canvas.addMouseMotionListener(this);
        clearButton.addActionListener(this);

        Box buttonBox = new Box(BoxLayout.X_AXIS);
        buttonBox.add(clearButton);
        Box mainBox = new Box(BoxLayout.Y_AXIS);
        mainBox.add(buttonBox);
        mainBox.add(canvas);
        getContentPane().add(mainBox);

        pack();
        show();
    }

    /**
     * ActionListener接口中的方法
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == clearButton) {
            history.clear();
            canvas.repaint();
        }
    }

    /**
     * MouseMotionListener接口中的方法
     * @param e
     */
    @Override
    public void mouseMoved(MouseEvent e) {
    }
    @Override
    public void mouseDragged(MouseEvent e) {
        Command cmd = new DrawCommand(canvas, e.getPoint());
        history.append(cmd);
        cmd.execute();
    }

    /**
     * WindowListener接口中的方法
     * @param e
     */
    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }
    @Override
    public void windowActivated(WindowEvent e) {}
    @Override
    public void windowClosed(WindowEvent e) {}
    @Override
    public void windowDeactivated(WindowEvent e) {}
    @Override
    public void windowDeiconified(WindowEvent e) {}
    @Override
    public void windowIconified(WindowEvent e) {}
    @Override
    public void windowOpened(WindowEvent e) {}

    public static void main(String[] args) {
        new Main("command Pattern Sample");
    }
}
