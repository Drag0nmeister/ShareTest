package TestProjectFromGIT;

public class OnePart {
}
class Astronaut {
    public String getInfo() {
        return "Неизвестный астронавт";
    }
}
class Cat extends Astronaut {
    public String getInfo() {
        return "Кот";
    }
}
class Human extends Astronaut {
    public String getInfo() {
        return "Человек";
    }
}
class Dog extends Astronaut {
    public String getInfo() {
        return "Собака";
    }
}