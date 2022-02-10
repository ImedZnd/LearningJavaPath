public interface SAnimal {
    static public String identifyMyself() {
        return "I am an animal.";
    }
}

interface EggLayer extends SAnimal {
    static public String identifyMyself() {
        return "I am able to lay eggs.";
    }
}

interface FireBreather extends SAnimal { }

class Dragon implements EggLayer, FireBreather {
    public static void main (String... args) {
        SAnimal myApp = new Dragon();
        System.out.println(EggLayer.identifyMyself());
    }
}