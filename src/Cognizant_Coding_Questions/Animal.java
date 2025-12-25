package Cognizant_Coding_Questions;

public class Animal {
    void eat(){
        System.out.println("This animal eats food.");
    }
}

// child class 1
class Dog extends Animal{
    void bark(){
        System.out.println("Dog barks!!");
    }
}

// child class 2
class Cat extends Animal {
    void meow(){
        System.out.println("Cat meows!");
    }
}