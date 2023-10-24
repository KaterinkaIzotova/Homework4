public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }
    @Override
    public String makeNoise() {
        String t = "Мяу";
        System.out.println(t);
        return t;
    }
    @Override
    public String eat() {
        String s = "Молоко, рыба";
        System.out.println(s);
        return s;
    }
    @Override
    public String getDescription() {
        String k = "Маленькая, пушистая, рыжая";
        return k;
    }
    @Override
    public String getName() {
        return name;
    }
}
