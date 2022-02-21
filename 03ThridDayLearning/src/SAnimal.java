public interface SAnimal {
    default String identifyMyself() {
        return "I am an animal.";
    }
}

interface EggLayer extends SAnimal {
    default String identifyMyself() {
        return "I am able to lay eggs.";
    }
}

interface FireBreather extends SAnimal {
//    default String identifyMyself() {
//        return "I am able to Fire Breather.";
//    }
}

class Dragon implements FireBreather ,EggLayer {
    public static void main (String... args) {
        FireBreather myApp = new Dragon();
        System.out.println(myApp.identifyMyself());
    }
}