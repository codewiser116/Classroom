package Day24;

public class Animal {
    String name;
    int age;
    String type;
    String color;
    String size;
    String legs;

    public Animal(String name, int age, String type, String color, String size){
        this.name = name;
        this.age = age;
        this.type = type;
        this.color = color;
        this.size = size;
    }

    public Animal(String name, int age, String type, String color, String size, String legs){
        this.name = name;
        this.age = age;
        this.type = type;
        this.color = color;
        this.size = size;
        this.legs = legs;
    }


    public void eats(){
        System.out.println(color + " " + size + " " + type + " is eating");
    }

    public void print(){
        if(name.equals("Snake")){
            System.out.println(name);
            System.out.println(age);
            System.out.println(type);
            System.out.println(color);
            System.out.println(size);
            System.out.println();
        }
        else{
            System.out.println(name);
            System.out.println(age);
            System.out.println(type);
            System.out.println(color);
            System.out.println(size);
            System.out.println(legs);
            System.out.println();
        }

    }


}
