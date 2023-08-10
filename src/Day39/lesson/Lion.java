package Day39.lesson;

public class Lion {

    private String name;
    private int age;

    public Lion(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        if(age<0 || age > 200){
            System.out.println("You can not assign this value");
        }
        else{
            this.age = age;
        }
    }


}
