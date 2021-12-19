package com.java.demo;

public class Computer {
    //模拟人使用电脑的过程
    //电脑可以开机，展示，登录，安装软件，卸载软件，关机等功能
    //人可以打开电脑，实现操作

    //提供登录名，密码属性，并赋初值
    String loginName = "admin";       //登录名 loginName
    int loginPsd = 123456;
    //登录密码
    //提供数组存储已经安装的软件
    String []arr = new String[100];     //长度为100的字符型数组
    int count = 0;                      //定义一个计数器从0开始

    //方法1 开机功能 无参无返回值
    public void open(){

        System.out.println("正在开机，请稍后......");
    }
    //方法2 登录功能，以用户名和密码作为参数，登录成功则返回true，失败则返回false
    public boolean login(String loginName,int Psd){
        if (loginName.equals(loginName) && Psd == loginPsd ){
            return true;
        }
        return false;
    }

    //方法3 展示已经安装的软件名称，没有安装软件给出提示，安装了软件，每5个换行。
    public void findAll(){
        if (arr[0] == null){
            System.out.println("您并没有安装任何软件");
        }else{
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != null){
                    if (i % 5 == 0){
                        System.out.println();
                    }
                    System.out.print(arr[i]+" ");
                }
            }
        }
    }

    //方法4 安装软件，以软件名作为参数，成功返回true，失败返回false
    public boolean addSoft(String name){
    //判断重名方法
        int index = this.findName(name);
        if (index == -1){
            arr[count++] = name;
            return true;
        }else {

            return false;
        }
    }
    //方法5 （7）卸载软件，以软件名作为参数，成功返回true，失败返回false
    public boolean doDel(String name){
    //调用卸载方法
        int index02 = this.findName(name);
        if (index02 != -1){
            for (int i = index02; i < arr.length-1; i++) {
                arr[i] = arr[i+1];
            }
            count--;
            return true;
        }
        return false;
    }

    //方法6 （8）关机，退出程序
    public void eixt(){
        System.out.println("谢谢使用，再见.....");
        System.exit(0);
    }

    //判断重名方法
    public int findName(String name){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null && arr[i].equals(name)){
                return i;  //在循环里面写返回1
            }
        }
        return -1;  //在循环外边写返回-1
    }

}
