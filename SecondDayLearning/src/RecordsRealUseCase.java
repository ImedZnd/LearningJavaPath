import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public record RecordsRealUseCase () {}

record City(String name, State state) {}

record State(String name) {}
