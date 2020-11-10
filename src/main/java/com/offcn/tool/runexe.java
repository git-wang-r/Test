package com.offcn.tool;

import java.io.IOException;

public class runexe {
    public static void main(String[] args) {
        doWinEXE();
      /*  doMyExe();*/

    }
    //用java调用windows系统的exe文件
    public static void doWinEXE(){
        Runtime runtime = Runtime.getRuntime();
        Process p = null;

        try {
            String command = "C:\\Program Files\\Java\\jdk1.8.0_191\\bin\\cmd";
            p = runtime.exec(command);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //2.0 调用其他可执行文件 例如自己制作的exe或者自己下载安装的软件
    public static void doMyExe(){
        Runtime rn = Runtime.getRuntime();
        Process p = null;
        try {
            p = rn.exec("\"D:\\idea\\ideaIU-2020.1.1.exe\"");

        }catch (Exception e){

        }
    }

}
