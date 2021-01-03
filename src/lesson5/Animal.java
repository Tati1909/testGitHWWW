package lesson5;

public  class Animal {
    protected String name;
    protected int length;
    protected double height;
    protected int length2;

    public Animal(String name,int length,double height) {
        this.name = name;
        this.length =length;
        this.height=height;
    }

    public Animal(String name,int length,double height,int length2) {
        this.name = name;
        this.length =length;
        this.height=height;
        this.length2 =length2;
    }


    public void run(int length) {
        if(this.length>=length){
            System.out.println(name +  " пробежал.");
        } else{
            System.out.println("Превышено максимальное расстояние, которое может пробежать " + name);
        }
    }


    public void jump(double height) {
        if(this.height>=height){
        System.out.println(name +  " перепрыгнул.");
        } else{
            System.out.println("Превышена максмальная высота, которую может перепрыгнуть " + name);
        }
    }


    public void sail(int length2) {
        if(this.length2>=length2){
            System.out.println(name +  " проплыл.");
        } else{
            System.out.println("Превышено максимальное расстояние, которое может проплыть " + name);
        }
    }


}
