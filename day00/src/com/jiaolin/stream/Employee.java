package com.jiaolin.stream;

import lombok.Data;

/**
 * @author johnny
 * @Classname Employee
 * @Description
 * @Date 2022/7/21 11:38
 */
@Data
public class Employee {

    private Integer id;
    private Integer age;
    private String name;
    private Double salary;

    public Employee() {
    }

    public Employee(Integer id, Integer age, String name, Double salary) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.salary = salary;
    }

    public Employee(String name) {
        this.name=name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
