package WorkSpace;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.LinkedList;
import java.util.Collections;

/**
 * ѧ���ɼ�����ϵͳ
 * @author ����
 *
 *
 */
public class Manager {
    public static void main(String args[]){

        String choice = "1";
        Scanner input = new Scanner(System.in);

        //����List���ϣ��洢ѧ������
        List<Student> list = new LinkedList<Student>();
        list.add(new Student("����",100,60));
        list.add(new Student("����",101,61));
        list.add(new Student("�����",102,62));

        //�������
        
		System.out.println("---------ѧ���ɼ�����ϵͳ---------");
		System.out.println("1������ѧ����Ϣ��");
		System.out.println("2��ɾ��ѧ����Ϣ��");
		System.out.println("3���޸�ѧ����Ϣ��");
		System.out.println("4����ѯѧ����Ϣ��");
		System.out.println("5���ɸߵ��ͶԳɼ���������");
		System.out.println("6���������ѧ����Ϣ��");
		System.out.println("0���˳�ϵͳ��");
		System.out.println("   ��ѡ����Ĳ�����");
		while(choice.equals("0") == false) {	
            choice = input.next();

            //ѡ�����ģ��

            switch (choice) {

                case "0":
                    System.out.println("лл���ʹ�ã���ӭ�´ι��٣�\n"+"*********���������������*********");
                    break;
                //����
                case "1":
                    System.out.println("������ѧ����������");
                    String name = input.next();
                    System.out.println("������ѧ����ѧ�ţ�");
                    int num = input.nextInt();
                    System.out.println("������ѧ���ĳɼ���");
                    int score = input.nextInt();
                    list.add(new Student(name, num, score));
                    System.out.println("��ӳɹ�����");
                    System.out.println("�����ѡ����Ĳ�����");
                    break;
                //ɾ��
                case "2":
                    if (list.isEmpty() == true) {                         //��鼯���Ƿ�Ϊ��
                        System.out.println("�㻹û�����ѧ������Ϣ��");
                        System.out.println("�����ѡ����Ĳ�����");
                        break;
                    } else {
                        System.out.println("��������Ҫɾ����ѧ����ѧ�ţ�");
                        int index = input.nextInt();
                        List<Integer> listNum = new ArrayList<Integer>();
                        for (int i = 0; i < list.size(); i++) {
                            listNum.add(list.get(i).getNum());
                        }
                        for (int j = 0; j < list.size(); j++) {        //�Ƴ�Ԫ��
                            if (listNum.contains(index)) {
                                if (index == list.get(j).getNum()) {
                                    list.remove(j);
                                    System.out.println("�Ƴ��ɹ�����");
                                    System.out.println("�����ѡ����Ĳ�����");
                                    break;
                                } else {
                                    continue;
                                }
                            } else {
                                System.out.println("û�и�ѧ������Ϣ����");
                                System.out.println("�����ѡ����Ĳ�����");
                                break;
                            }
                        }break;
                    }
                    //�޸�
                case "3":
                    if (list.isEmpty() == true) {                             //��鼯���Ƿ�Ϊ��
                        System.out.println("�㻹û�����ѧ������Ϣ��");
                        System.out.println("�����ѡ����Ĳ�����");
                        break;
                    } else {
                        System.out.println("��������Ҫ�޸ĵ�ѧ����ѧ�ţ�");
                        int index = input.nextInt();
                        List<Integer> listNum = new ArrayList<Integer>();
                        for (int i = 0; i < list.size(); i++) {
                            listNum.add(list.get(i).getNum());
                        }
                        for (int j = 0; j < list.size(); j++) {
                            if (listNum.contains(index)) {
                                if (index == list.get(j).getNum()) {
                                    System.out.println("��ѧ������Ϣ��");
                                    System.out.println(list.get(j).toString());
                                    System.out.println("����������ѧ�������֣�");
                                    String name1 = input.next();
                                    System.out.println("����������ѧ����ѧ�ţ�");
                                    int num1 = input.nextInt();
                                    System.out.println("����������ѧ���ĳɼ���");
                                    int score1 = input.nextInt();
                                    list.remove(j);                 //ɾ����ѧ���ľ���Ϣ
                                    list.add(new Student(name1, num1, score1));
                                    System.out.println("�޸ĳɹ�����");
                                    System.out.println("�����ѡ����Ĳ�����");
                                    break;
                                }
                            }
                        }break;
                    }
                    //��ѯ
                case "4":
                    if (list.isEmpty() == true) {                             //��鼯���Ƿ�Ϊ��
                        System.out.println("�㻹û�����ѧ������Ϣ��");
                        System.out.println("�����ѡ����Ĳ�����");
                        break;
                    } else {
                        System.out.println("��������Ҫ��ѯ��ѧ����ѧ�ţ�");
                        int index = input.nextInt();
                        List<Integer> listNum = new ArrayList<Integer>();
                        for (int i = 0; i < list.size(); i++) {
                            listNum.add(list.get(i).getNum());
                        }
                        for (int j = 0; j < list.size(); j++) {     //�Ƴ�Ԫ��
                            if (listNum.contains(index)) {
                                if (index == list.get(j).getNum()) {
                                    System.out.println("��ѧ������Ϣ��");
                                    System.out.println(list.get(j).toString());
                                    System.out.println("�����ѡ����Ĳ�����");
                                    break;
                                }
                            } else {
                                System.out.println("û�и�ѧ������Ϣ����");
                                System.out.println("�����ѡ����Ĳ�����");
                                break;
                            }
                        }break;
                    }

                    //����
                case "5":
                    if (list.isEmpty() == true) {                             //��鼯���Ƿ�Ϊ��
                        System.out.println("�㻹û�����ѧ������Ϣ��");
                        System.out.println("�����ѡ����Ĳ�����");
                        break;
                    }
                    else {
                        Collections.sort(list);
                        System.out.println("������˳��");
                        for (int i = 0; i < list.size(); i++) {
                            System.out.println(list.get(i).toString());
                        }
                        System.out.println("�����ѡ����Ĳ�����");
                        break;
                    }
                    //���ȫ��
                case "6":
                    if (list.isEmpty() == true) {                             //��鼯���Ƿ�Ϊ��
                        System.out.println("�㻹û�����ѧ������Ϣ��");
                        System.out.println("�����ѡ����Ĳ�����");
                        break;
                    } else {
                        for (int i = 0; i < list.size(); i++) {
                            System.out.println(list.get(i).toString());
                        }
                        System.out.println("�����ѡ����Ĳ�����");
                        break;
                    }

                    default:
                        System.out.println("��������ȷ�����֣���");
                    break;
            }
        }
    }
}
