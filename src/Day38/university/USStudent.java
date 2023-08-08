package Day38.university;

public class USStudent implements GovernmentScholarship{
    @Override
    public void governmentScholarship() {
        System.out.println("I can apply for government scholarship");
    }

    @Override
    public void universityScholarship() {
        System.out.println("I can apply for university scholarship");
    }
}
