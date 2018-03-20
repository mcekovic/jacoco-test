package test.jacoco;

import org.junit.*;

import static org.assertj.core.api.Assertions.*;

public class FooTest {

   @Test
   public void testFoo() {
      Foo foo = makeFoo();

      assertThat(foo.getId()).isEqualTo(1);
   }

   @Test
   public void testFooEquals() {
      Foo foo = makeFoo();

      assertThat(foo).isEqualTo(foo);
      assertThat(foo).isEqualTo(makeFoo());
   }

   @Test
   public void testFooNotEquals() {
      Foo foo = makeFoo();

      assertThat(foo).isNotEqualTo(new Foo(2, "Foo"));
      assertThat(foo).isNotEqualTo(new Foo(1, "Foo2"));
      assertThat(foo).isNotEqualTo(new Object());
   }

   @Test
   public void testFooHashCode() {
      Foo foo = makeFoo();

      assertThat(foo.hashCode()).hasSameHashCodeAs(makeFoo());
   }

   private static Foo makeFoo() {
      return new Foo(1, "Foo");
   }
}
