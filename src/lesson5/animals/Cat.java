package lesson5.animals;

import lesson5.Animal;

public class Cat extends Animal {

    public Cat(String name,int length,double height) {
        super(name,length,height);
    }


    @Override
    public void sail(int length2) {
        System.out.println(name + " не плавает.");
    }
}

