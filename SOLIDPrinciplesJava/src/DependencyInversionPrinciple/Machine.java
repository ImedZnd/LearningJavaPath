package DependencyInversionPrinciple;

public class Machine {

    final Keyboard keyboard;
    final Mouse mouse;
    final Monitor monitor;

    public Machine(Keyboard keyboard, Mouse mouse, Monitor monitor) {
        this.keyboard = keyboard;
        this.mouse = mouse;
        this.monitor = monitor;
    }

}
