package com.java.demo;

import java.util.Scanner;

/**
 * 工作室类
 * ① 提供存储多部影片的数组，静态、常量，长度5
 * ② 使用静态代码块初始化数组，添加4个元素，必须同时包含电影和电视剧
 * ③ 提供显示所有影片信息的方法，在菜单1中调用
 * ④ 提供根据名称播放影片的方法，在菜单2中调用
 * ⑤ 提供添加方法，参数是Video，在菜单3中调用
 * ⑥ 提供删除方法，参数是影片名称，在菜单4中调用
 */
public class WorkRoom implements CanPlay{
    //提供数组，长度为5
    static Video[]arr = new Video[5];
    static int count =0;
    Scanner sc = new Scanner(System.in);
    //使用静态代码块初始化数组，添加4个元素，必须同时包含电影和电视剧
     static {       //使用静态代码块初始化数组
        Teleplay tel = new Teleplay("使徒行者","苗桥伟，余诗曼",31);  //Teleplay(String name, String actor, int number)
        Film film = new Film("金刚川","张译，吴京",123);
        Teleplay tel2 = new Teleplay("巡回检查组","于和伟，韩雪",47);
        Film film1 = new Film("八佰","王千源，张译",148);
        //存进数组中
        arr[count++] = tel;
        arr[count++] = film;
        arr[count++] = tel2;
        arr[count++] = film1;
    }
    //重写方法
    @Override
    public void play(String name) {     //播放影片的方法
        //调用重名方法
        int index = this.feedSameName(name);
        if (index == -1){
            System.out.println("没有找到相关影片！");
        }else{
            if (arr[index] instanceof Teleplay){        //电视剧
                Teleplay tel = (Teleplay) arr[index];   //向下转型
                tel.show();                             //展示方法
                System.out.println("请输入从第几集开始播放");
                int first = sc.nextInt();
                if (first > tel.getNumber() ){   //如果输入的集数大于电视剧本来的集数，则给出说明
                    System.out.println("输入的集数有误，请重新输入");
                }else{
                    System.out.println("正在从第"+first+"集开始播放");
                }
            }
            if (arr[index] instanceof Film){    //电视剧
                Film fil = (Film) arr[index];   //向下转型
                fil.show();                     //展示方法
                System.out.println("请输入从第多少分钟开始播放：");
                int flag = sc.nextInt();        //向下转型
                if (flag > fil.getTime()){      //如果输入的时间大于电影的总长度，则给出提示
                    System.out.println("输入的时间大于电影的总时长，请重新输入！");
                }else{
                    System.out.println("正在从第"+flag+"开始播放");
                }
            }
        }
    }
    //展示所有影片的方法
    public void showAll(){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null && arr[i] instanceof Teleplay){
                arr[i].show();
                System.out.println("------------");
            }
            if (arr[i] != null && arr[i] instanceof Film){
                arr[i].show();
                System.out.println("------------");
            }
        }
    }
    //添加影片的方法,参数是父类影片
    public void addFiles(Video video){
        //判断是否超过数组下标
        if (count >= arr.length){
            System.out.println("无法引进新的影片！");
        }else{
            //先判断是否重名
            int index = this.feedSameName(video.getName());     //判断重名
            if (index == -1){   //说明可以添加
                arr[count++] = video;
                System.out.println("引入电影成功！");
            }else{
                System.out.println("已存在，无需添加！");
            }
        }
    }
    //删除影片的方法   参数是电影名称
    public void doDel(String name){
        //判断是否存在，调用重名方法
        int index = this.feedSameName(name);
        if (index == -1){
            System.out.println("输入的电影不存在！");
        }else{
            for (int i = index; i < arr.length-1; i++) {
                if (arr[i] != null){
                    arr[i] = arr[i+1];
                }
            }
            arr[count-1] = null;
            count--;
            System.out.println("删除成功!");
        }
    }
    //判断重名方法
    public int feedSameName(String name){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null && arr[i].getName().equals(name)){
                return i;
            }
        }
        return -1;
    }
}
