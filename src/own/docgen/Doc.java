package own.docgen;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Doc {

    /** Description of class or method */

    /** Description of parameters, if annotated element is a method & has parameters */

    /** Description of return value, if annotated element is a method & isn't void */

}
