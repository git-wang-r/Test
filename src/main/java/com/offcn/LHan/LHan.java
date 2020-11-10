package com.offcn.LHan;


public class LHan {
    public volatile LHan lanhan;

    private LHan() {
        System.out.println("创建出一个对象");
    }
    public LHan instansof(){
        if (lanhan==null){
            synchronized (LHan.class){
                lanhan=new LHan();
                return lanhan;
            }
        }else {
            return lanhan;
        }


    }

    public static void main(String[] args) {

      int i = 1;
      i = i++;
        System.out.println(i);
    }
}
