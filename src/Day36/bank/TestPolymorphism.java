package Day36.bank;

public class TestPolymorphism {
    public static void main(String[] args) {
        SBI sbi = new SBI();
        ICICI icici = new ICICI();
        AXIS axis = new AXIS();
        System.out.println(sbi.getRateOfInterest());
        System.out.println(icici.getRateOfInterest());
        System.out.println(axis.getRateOfInterest());
    }
}
