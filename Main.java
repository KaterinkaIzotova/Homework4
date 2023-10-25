/*
1.	Создать класс Animal и расширяющие его абстрактные классы Dog, Cat, Bear.
2.	Класс Animal содержит переменную name и абстрактные методы makeNoise, eat, getDescription.
    Метод makeNoise, например, может выводить на консоль звуки животных.
    Метод  eat выводит на консоль список того, чем питается данное животное.
    Метод getDescription возвращает описание животного.
3.	Dog, Cat, Bear переопределяют методы makeNoise, eat, getDescription.
4.	Создайте класс Ветеринар, в котором определите метод void treatAnimal(Animal animal).
    Пусть этот метод распечатывает name и описание пришедшего на прием животного.
5.	В методе main создайте массив типа Animal,
    в который запишите животных всех имеющихся у вас типов.
    В цикле отправляйте их на прием к ветеринару.
    В отдельном цикле вызовите методы  makeNoise, eat для каждого животного.
 */
public class Main {
    public static void main(String[] args) {
        Veterinar myVeterinar = new Veterinar();
        Animal[] animals = new Animal[10];
        animals[0] = new Cat("Барсик");
        animals[1] = new Dog("Зевс");
        animals[2] = new Bear("Миша");
        animals[3] = new Cat("Муся");
        animals[4] = new Dog("Тузик");
        animals[5] = new Bear("Лунтик");
        animals[6] = new Cat("Нурик");
        animals[7] = new Dog("Шарик");
        animals[8] = new Bear("Копатыч");
        animals[9] = new Cat("Багира");

        for (int i = 0; i < animals.length; i++) {
            myVeterinar.treetAnimal(animals[i]);
        }
        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i].name + " " + "делает:");
            animals[i].makeNoise();
            System.out.println(animals[i].name + " " + "кушает:");
            animals[i].eat();
        }
    }
}