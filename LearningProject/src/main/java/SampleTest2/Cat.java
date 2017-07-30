package SampleTest2;

public class Cat extends Features implements Animal  {
    @Override
    public void eat() {
        System.out.println("Cat eats biscuits");
    }

    @Override
    public void color() {
        System.out.println("Abstract method in the cat class");
    }

    @Override
    public void drink() {
        System.out.println("Cat drinks milk");
    }

}
