package demo

import static javaslang.API.$
import static javaslang.API.Case
import static javaslang.API.Match

import groovy.transform.CompileStatic

@CompileStatic
class StringUtils {

    static String convertToStringValue(Integer n) {
        return Match(n).of(
            Case($(1), "one"),
            Case($(2), "two"),
//            This don't work on Groovy
//            Case({ x -> x > 3 }, "greather than 2"),
            Case($(), "?")
        )
    }
}
