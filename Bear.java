public class Bear extends Animal {
    public Bear(String name) {
        super(name);
    }
    @Override
    public String makeNoise() {
        String t = "Ррррр";
        System.out.println(t);
        return t;
    }
    @Override
    public String eat() {
        String s = "Мёд, малина";
        System.out.println(s);
        return s;
    }
    @Override
    public String getDescription() {
        String k = "Большой, пушистый, коричневый";
        return k;
    }
    @Override
    public String getName() {
        return name;
    }
}
