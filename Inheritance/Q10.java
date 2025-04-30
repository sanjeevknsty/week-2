class Person1 {
    protected String name;
    protected int id;

    public Person1(String name, int id) {
        this.name = name;
        this.id = id;
    }
    public void displayInfo() {
        System.out.println("Name: " + name + ", ID: " + id);
    }
}
interface Worker {
    void performDuties();
}

class Chef extends Person1 implements Worker {
    public Chef(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println(name + " is cooking delicious meals.");
    }
}

class Waiter extends Person1 implements Worker {
    public Waiter(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println(name + " is serving customers.");
    }
}
public class Q10 {
    public static void main(String[] args) {
        Chef chef = new Chef("John", 101);
        Waiter waiter = new Waiter("Alice", 202);

        chef.displayInfo();
        chef.performDuties();

        waiter.displayInfo();
        waiter.performDuties();
    }
}
