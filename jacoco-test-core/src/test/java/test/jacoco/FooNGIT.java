package test.jacoco;

import org.testng.annotations.*;

import static org.assertj.core.api.Assertions.*;

public class FooNGIT {

   @Test
   public void itFoo() {
      Foo foo = new Foo(1, "Foo");

      assertThat(foo).hasToString("Foo{id=1, name='Foo'}");
   }
}
