public class Dog {
    public void Dog() {
        System.out.println("Dog Barks");
    }
}
public class Animal extends Dog {
    @Override
    public void Dog() {
        System.out.println("Animal eats food");
    }
}
public class Main {
    public static void main(String[] args) {
        Animal a = new Animal();
        Dog g = new Dog();

        a.Dog();
        d.Dog();
    }
}
