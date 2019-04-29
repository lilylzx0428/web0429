package cn.lzx;

public class Person {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age<0){
            age=0;
        }
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public void  show(){
        System.out.println("姓名为："+this.getName()+" "+"年龄为："+this.getAge());


    }
    public static void lalal(String name){
        System.out.println("name:"+name);
    }


}
