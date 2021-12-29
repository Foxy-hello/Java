package com.bawei.demo;

import java.util.Scanner;

/**
 * （8）编写测试类/方法，提供菜单，调用管理类方法进行测试
 * 提供菜单项，包含初始化、统计各类资产个数、增加资产、修改资产、显示所有资产、退出等（2分）
 * ② 菜单能循环调用（2分）
 * ③ 选择菜单項后，能正确调用管理类中的方法进行测试（10分，每个分支2分）
 * ④ 选择“退出”时，能正确退出（1分）
 */
public class Test {
    public static void main(String[] args) {
        //创建输入对象
        Scanner sc = new Scanner(System.in);
        //创建管理类对象
        Manager man = new Manager();
        //提供菜单项，包含初始化、统计各类资产个数、增加资产、修改资产、显示所有资产、退出等
        //菜单能循环调用
        while (true){
            System.out.println("--------------------------------------------------------------");
            System.out.println("1.初始化 2.统计各类资产个数 3.增加资产 4.修改资产 5.显示所有资产 6.退出");
            System.out.println("--------------------------------------------------------------");
            System.out.print("请选择：");
            int key = sc.nextInt();
            switch (key){//选择菜单項后，能正确调用管理类中的方法进行测试
                case 1:{//1.初始化
                    //调用初始化方法
                    man.newShow();
                    break;
                }
                case 2:{//2.统计各类资产个数
                    //调用统计资产信息方法
                    man.total();
                    break;
                }
                case 3:{//3.增加资产
                    System.out.print("请选择要添加的类型（1.固定资产 2.无形资产）：");
                    int type = sc.nextInt();
                    System.out.print("请输入资产名称：");
                    String name = sc.next();
                    //调用重名方法
                    int index = man.findSameName(name);
                    if (index == -1){//说明不存在 可以添加
                        if (type == 1){//1.固定资产 ==》Fixed(String name, double price, String date, String department)
                            System.out.print("请输入资产价格：");
                            double price = sc.nextDouble();
                            System.out.print("请输入购置日期：");
                            String date = sc.next();
                            System.out.print("请输入所属部门：");
                            String department = sc.next();
                            //创建固定资产类对象
                            Asset Fixed = new Fixed(name,price,date,department);
                            //调用增加资产方法
                            boolean flag = man.add(Fixed);
                            if (flag == true){
                                System.out.println("添加成功");
                            }else{
                                System.out.println("数组已满，添加失败");
                            }
                        }else if (type == 2){//2.无形资产 ==》Intangible(String name, String explain, String type)
                            System.out.print("请输入资产说明：");
                            String explain = sc.next();
                            System.out.print("请输入资产类别（1.货币资金 2.金融资产 3.专利权 4.商标权）：");
                            int type02 = sc.nextInt();
                            String type03 = "";
                            switch (type02){
                                case 1:{//1.货币资金
                                    type03 = "货币资金";
                                    break;
                                }
                                case 2:{//2.金融资产
                                    type03 = "金融资产";
                                    break;
                                }
                                case 3:{//3.专利权
                                    type03 = "专利权";
                                    break;
                                }
                                case 4:{//4.商标权
                                    type03 = "商标权";
                                    break;
                                }
                                default:{//提示输入资产类别有误
                                    System.out.println("输入资产类别有误");
                                    break;
                                }
                            }
                            //创建无形资产类对象
                            Asset intangible = new Intangible(name,explain,type03);
                            //调用增加资产方法
                            boolean flag = man.add(intangible);
                            if (flag == true){
                                System.out.println("添加成功");
                            }else{
                                System.out.println("添加失败");
                            }
                        }
                    }else{//说明存在 无法添加
                        System.out.println("已有同名资产，添加失败");
                    }
                    break;
                }
                case 4:{//4.修改资产
                    System.out.print("请输入要修改的资产名称：");
                    String name = sc.next();
                    //调用修改资产方法
                    boolean flag = man.update(name);
                    if (flag == true){
                        System.out.println("修改成功");
                    }else{
                        System.out.println("不存在该资产，修改失败");
                    }
                    break;
                }
                case 5:{//5.显示所有资产
                    //调用显示所有资产信息方法
                    man.showAll();
                    break;
                }
                case 6:{//选择“退出”时，能正确退出
                    System.out.println("谢谢使用，再见");
                    System.exit(0);
                    break;
                }
                default:{//提示输入有误，重写输入
                    System.out.println("输入有误，重新输入");
                    break;
                }
            }
        }
    }
}
