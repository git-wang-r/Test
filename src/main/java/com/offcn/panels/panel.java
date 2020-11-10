package com.offcn.panels;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class panel {
    public static void main(String[] args) {


        Frame f=new Frame("第一个界面程序");

        f.setSize(500,400);
        f.setLocation(300,200);
        f.setLayout(new FlowLayout());

        Button b=new Button("我是一个按钮");

        f.add(b);

        f.addWindowListener(new MyWin());

        f.setVisible(true);
        System.out.println("Hello world!");

    }
}
class MyWin extends WindowAdapter {

    @Override
    public void windowClosing(WindowEvent e) {
        // TODO Auto-generated method stub
        //System.out.println("Window closing"+e.toString());
        System.out.println("我关了");
        System.exit(0);
    }
    @Override
    public void windowActivated(WindowEvent e) {
        //每次获得焦点 就会触发
        System.out.println("我活了");
        //super.windowActivated(e);
    }
    @Override
    public void windowOpened(WindowEvent e) {
        // TODO Auto-generated method stub
        System.out.println("我开了");
        //super.windowOpened(e);
    }

}