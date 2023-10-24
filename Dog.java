public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }
    @Override
    public String makeNoise() {
        String t = "Гав";
        System.out.println(t);
        return t;
    }
    @Override
    public String eat() {
        String s = "Косточка, мясо";
        System.out.println(s);
        return s;
    }
    @Override
    public String getDescription() {
        String k = "Средний, пушистый, серый";
        return k;
    }
    @Override
    public String getName() {
        return name;
    }
}
