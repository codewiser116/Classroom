package Day33.Other;

public class Cat extends Feline{

    public Cat(String specie, String habitat, String type, int age,
               boolean isMammal, String name, boolean isDomestic){

        super(habitat, type, age, isMammal,specie);
        this.name = name;
        this.isDomestic = isDomestic;
    }

    String name;
    boolean isDomestic;

}
