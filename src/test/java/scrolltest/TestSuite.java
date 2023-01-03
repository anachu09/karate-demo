package scrolltest;

import com.intuit.karate.KarateOptions;
import com.intuit.karate.junit5.Karate;

@KarateOptions(tags = {"@debug"})
// How to Run it - mvn clean test "-Dkarate.options=--tags @debug"
class TestSuite {
    
    // this will run all *.feature files that exist in subdirectories
    // see https://¬github.com/intuit/karate#naming-conventions
    @Karate.Test
    Karate testAll() {
        return Karate.run().relativeTo(getClass());
    }
}
