package org.example;

public class StuInfo {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    int id,age;
    StuInfo(String name,int id,int age){
        this.name=name;
        this.id=id;
        this.age=age;
    }
}
