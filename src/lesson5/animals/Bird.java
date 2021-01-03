package lesson5.animals;

import lesson5.Animal;

public class Bird extends Animal {

    public Bird(String name,int length,double height) {
        super(name,length,height);
    }


    @Override
    public void sail(int length2) {
        System.out.println(name + " не плавает.");
    }


}
