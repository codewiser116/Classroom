package Day36.accessModifiers;

public class Animal {
    private final String name = "someName";
    int age;
    protected static String type;

    private void privatePrintDetails(){
        System.out.println(name);
    }

    public void printDetails(){
        System.out.println(name);
        privatePrintDetails();
    }
}
