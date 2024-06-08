import java.util.Optional;

public class OptionalClass {
    public static void main(String[] args) {
        Optional<String> optionalString= Optional.of("Value of optional");
        optionalString.ifPresent(value -> System.out.println("-> " + value));
        Optional<String> optionalEmpty=Optional.empty();
        System.out.println("There is null: "+/*optionalEmpty.get() + */ optionalEmpty.orElse("Null"));
        // u cannot call optional.get() while optional is empty, it will invoke
        String nullstring =null;

        Optional<String> optionalnull=Optional.ofNullable(nullstring);
        System.out.println(optionalnull.or(()->Optional.of("null value or this value")));
    }

}
