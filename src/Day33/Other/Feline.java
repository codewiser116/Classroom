package Day33.Other;

public class Feline extends Animal{
    String specie;
    String habitat;

    public Feline( String habitat, String type, int age,
                  boolean isMammal,String specie){
        super(type, age, isMammal);

        this.specie = specie;
        this.habitat = habitat;
    }

    public void meow(){
        System.out.println("Feline meow");
    }

}
