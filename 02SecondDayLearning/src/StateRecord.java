import java.util.List;

public record StateRecord (String name, String capitalCity, List<String> cities){
    public StateRecord{
        cities = List.copyOf(cities);
    }

    public StateRecord(String name, String capitalCity){
        this(name, capitalCity, List.of());
    }

    public StateRecord(String name, String capitalCity, String... cities) { // zero to mutiple input in ...
        this(name, capitalCity, List.of(cities));
    }

    public List<String> cities() {
        return List.copyOf(cities);
    }
}
