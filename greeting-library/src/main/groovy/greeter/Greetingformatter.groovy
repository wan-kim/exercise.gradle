package greeter

import groovy.transform.CompileStatic

@CompileStatic
class Greetingformatter {
    static String greeting(final String name) {
        "Hello, ${name.capitalize()}"
    }
}
