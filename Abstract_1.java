abstract class pen{
    abstract void write();
    abstract void refill();
}

class fountainPen extends pen{
    void write(){
        System.out.println("Write");
    }
    void refill(){
        System.out.println("refill");
    }
}

class monkey{
    void jump(){
        System.out.println("jump");
    }
    void bite(){
        System.out.println("bite");
    }
}

interface animal{
    void sleep();
    void eat();
}

class human extends monkey implements animal{
    @Override
    public void eat() {
        System.out.println("Eating");
    }
    @Override
    public void sleep() {
        System.out.println("Sleeping");
    }
}

public class Abstract_1 {
    public static void main(String[] args) {
        
    }
}
