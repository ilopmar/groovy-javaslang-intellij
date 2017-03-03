package demo;

import static javaslang.API.$;
import static javaslang.API.Case;
import static javaslang.API.Match;

public class StringUtilsJava {

    public static String convertToStringValue(Integer n) {
        return Match(n).of(
            Case($(1), "one"),
            Case($(2), "two"),
            Case(x -> x > 3, "greather than 2"),
            Case($(), "?")
        );
    }
}
