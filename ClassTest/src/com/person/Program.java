package com.person;

public class Program{
    
    public static void main(String[] args) {
    	Cat cat1 = new Cat();
         
        Person tom = new Person(); 
        tom.displayInfo();
        Person bob = new Person("Bob");
        bob.displayInfo();
        Person sasha = new Person("Sasha",32);
        sasha.displayInfo();
        Person pavel = new Person("Pavel",32);
        pavel.displayInfo();
        
    }
}
class Person{
    
    String name;    // имя
    int age;        // возраст
    Person()
    {
        this("Undefined", 18);
    }
    Person(String name)
    {
        this(name, 18);
    }
    Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    void displayInfo(){
        System.out.printf("Name: %s \tAge: %d\n", name, age);
    }
}