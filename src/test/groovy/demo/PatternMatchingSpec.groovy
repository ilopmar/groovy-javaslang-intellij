package demo

import spock.lang.Specification

class PatternMatchingSpec extends Specification {

    void 'Pattern matching'() {
        expect:
            println StringUtils.convertToStringValue(value)

        where:
            value << [0, 1, 2, 3, 4]
    }

    void 'Pattern matching (Java version)'() {
        expect:
            println StringUtilsJava.convertToStringValue(value)

        where:
            value << [0, 1, 2, 3, 4]
    }

}
