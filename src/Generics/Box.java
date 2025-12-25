package Generics;

public class Box <T>{
    private T t;

    public void add(T t){
        this.t = t;
    }

    public T get(){
        return t;
    }

    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<Integer>();
        Box<String> stringBox = new Box<String>();

//        integerBox.add(new Integer(10));
//        integerBox.add(new String("Hello"));

        System.out.printf("Integer value :%d\n\n", integerBox.get());
        System.out.printf("String value :%s\n", stringBox.get());
    }
}
