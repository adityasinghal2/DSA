package gfg.sortFunction;

import java.util.Objects;

public class Student implements Comparable<Student>{
    private String name;
    private int marks;
    private int age;

    public Student(String name, int marks, int age) {
        this.name = name;
        this.marks = marks;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return marks == student.marks &&
                age == student.age &&
                name.equals(student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, marks, age);
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", marks=" + marks +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Student o) {

        return this.marks - o.marks;
    }
}
