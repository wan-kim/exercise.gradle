package greeter

import spock.lang.Specification

class GreetingformatterSpec extends Specification {

    def 'Creating a greeting'() {
        expect: 'Thre greeting to be correctly capitalized'
        Greetingformatter.greeting('gradlephant') == 'Hello, Gradlephant'
    }
}
