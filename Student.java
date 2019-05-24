package WorkSpace;

public class Student implements Comparable<Student>{
    private String name;
    private int num;
    private int score;

    public Student(){

    }

    public Student(String name,int num,int score){
        super();
        this.name = name;
        this.num = num;
        this.score = score;
    }

    public int getScore(){
        return score;
    }

    public void setScore(int score){
        this.score = score;
    }

    public int getNum(){
        return num;
    }

    public void setNum(int num){
        this.num = num;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    //方法重写
    public String toString(){
        return "名字："+ name +" 学号：" + num +" 成绩：" + score;
    }
    //方法重写
    public int compareTo(Student o) {
        return o.getScore() - this.score ;
    }
}
