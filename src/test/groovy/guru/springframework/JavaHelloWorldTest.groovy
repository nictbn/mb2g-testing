package guru.springframework

import spock.lang.Specification

class JavaHelloWorldSpockTest extends Specification {
    def "GetHello"() {
        when:
        def foo = "123"

        then:
        true
    }
}
