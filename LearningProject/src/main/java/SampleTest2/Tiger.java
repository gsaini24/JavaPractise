package SampleTest2;

public class Tiger implements Animal {
    @Override
    public void eat() {
        System.out.println("Tiger eats other animals");
    }

    @Override
    public void drink() {
        System.out.println("Tiger drinks water");
    }
}
