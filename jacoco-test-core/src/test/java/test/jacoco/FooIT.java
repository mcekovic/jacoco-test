package test.jacoco;

import org.junit.*;

import static org.assertj.core.api.Assertions.*;

public class FooIT {

   @Test
   public void itFoo() {
      Foo foo = new Foo(1, "Foo");

      assertThat(foo.getId()).isEqualTo(1);
      assertThat(foo.getName()).isEqualTo("Foo");
   }
}
