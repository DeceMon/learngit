package WorkSpace;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.LinkedList;
import java.util.Collections;

/**
 * 学生成绩管理系统
 * @author 亢博
 *
 *
 */
public class Manager {
    public static void main(String args[]){

        String choice = "1";
        Scanner input = new Scanner(System.in);

        //创建List集合，存储学生对象
        List<Student> list = new LinkedList<Student>();
        list.add(new Student("亢博",100,60));
        list.add(new Student("王亮",101,61));
        list.add(new Student("范辰昊",102,62));

        //界面语句
        
		System.out.println("---------学生成绩管理系统---------");
		System.out.println("1、增加学生信息：");
		System.out.println("2、删除学生信息：");
		System.out.println("3、修改学生信息：");
		System.out.println("4、查询学生信息：");
		System.out.println("5、由高到低对成绩进行排序：");
		System.out.println("6、输出所有学生信息：");
		System.out.println("0、退出系统：");
		System.out.println("   请选择你的操作：");
		while(choice.equals("0") == false) {	
            choice = input.next();

            //选择程序模块

            switch (choice) {

                case "0":
                    System.out.println("谢谢你的使用！欢迎下次光临！\n"+"*********按任意键结束程序*********");
                    break;
                //增加
                case "1":
                    System.out.println("请输入学生的姓名：");
                    String name = input.next();
                    System.out.println("请输入学生的学号：");
                    int num = input.nextInt();
                    System.out.println("请输入学生的成绩：");
                    int score = input.nextInt();
                    list.add(new Student(name, num, score));
                    System.out.println("添加成功！！");
                    System.out.println("请继续选择你的操作：");
                    break;
                //删除
                case "2":
                    if (list.isEmpty() == true) {                         //检查集合是否为空
                        System.out.println("你还没有添加学生的信息！");
                        System.out.println("请继续选择你的操作：");
                        break;
                    } else {
                        System.out.println("请输入你要删除的学生的学号：");
                        int index = input.nextInt();
                        List<Integer> listNum = new ArrayList<Integer>();
                        for (int i = 0; i < list.size(); i++) {
                            listNum.add(list.get(i).getNum());
                        }
                        for (int j = 0; j < list.size(); j++) {        //移除元素
                            if (listNum.contains(index)) {
                                if (index == list.get(j).getNum()) {
                                    list.remove(j);
                                    System.out.println("移除成功！！");
                                    System.out.println("请继续选择你的操作：");
                                    break;
                                } else {
                                    continue;
                                }
                            } else {
                                System.out.println("没有该学生的信息！！");
                                System.out.println("请继续选择你的操作：");
                                break;
                            }
                        }break;
                    }
                    //修改
                case "3":
                    if (list.isEmpty() == true) {                             //检查集合是否为空
                        System.out.println("你还没有添加学生的信息！");
                        System.out.println("请继续选择你的操作：");
                        break;
                    } else {
                        System.out.println("请输入你要修改的学生的学号：");
                        int index = input.nextInt();
                        List<Integer> listNum = new ArrayList<Integer>();
                        for (int i = 0; i < list.size(); i++) {
                            listNum.add(list.get(i).getNum());
                        }
                        for (int j = 0; j < list.size(); j++) {
                            if (listNum.contains(index)) {
                                if (index == list.get(j).getNum()) {
                                    System.out.println("此学生的信息：");
                                    System.out.println(list.get(j).toString());
                                    System.out.println("请重新输入学生的名字：");
                                    String name1 = input.next();
                                    System.out.println("请重新输入学生的学号：");
                                    int num1 = input.nextInt();
                                    System.out.println("请重新输入学生的成绩：");
                                    int score1 = input.nextInt();
                                    list.remove(j);                 //删除改学生的旧信息
                                    list.add(new Student(name1, num1, score1));
                                    System.out.println("修改成功！！");
                                    System.out.println("请继续选择你的操作：");
                                    break;
                                }
                            }
                        }break;
                    }
                    //查询
                case "4":
                    if (list.isEmpty() == true) {                             //检查集合是否为空
                        System.out.println("你还没有添加学生的信息！");
                        System.out.println("请继续选择你的操作：");
                        break;
                    } else {
                        System.out.println("请输入你要查询的学生的学号：");
                        int index = input.nextInt();
                        List<Integer> listNum = new ArrayList<Integer>();
                        for (int i = 0; i < list.size(); i++) {
                            listNum.add(list.get(i).getNum());
                        }
                        for (int j = 0; j < list.size(); j++) {     //移除元素
                            if (listNum.contains(index)) {
                                if (index == list.get(j).getNum()) {
                                    System.out.println("此学生的信息：");
                                    System.out.println(list.get(j).toString());
                                    System.out.println("请继续选择你的操作：");
                                    break;
                                }
                            } else {
                                System.out.println("没有该学生的信息！！");
                                System.out.println("请继续选择你的操作：");
                                break;
                            }
                        }break;
                    }

                    //排序
                case "5":
                    if (list.isEmpty() == true) {                             //检查集合是否为空
                        System.out.println("你还没有添加学生的信息！");
                        System.out.println("请继续选择你的操作：");
                        break;
                    }
                    else {
                        Collections.sort(list);
                        System.out.println("排序后的顺序：");
                        for (int i = 0; i < list.size(); i++) {
                            System.out.println(list.get(i).toString());
                        }
                        System.out.println("请继续选择你的操作：");
                        break;
                    }
                    //输出全部
                case "6":
                    if (list.isEmpty() == true) {                             //检查集合是否为空
                        System.out.println("你还没有添加学生的信息！");
                        System.out.println("请继续选择你的操作：");
                        break;
                    } else {
                        for (int i = 0; i < list.size(); i++) {
                            System.out.println(list.get(i).toString());
                        }
                        System.out.println("请继续选择你的操作：");
                        break;
                    }

                    default:
                        System.out.println("请输入正确的数字！！");
                    break;
            }
        }
    }
}
