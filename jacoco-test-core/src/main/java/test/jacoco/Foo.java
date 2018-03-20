package test.jacoco;

import java.util.*;

public class Foo {

   private final int id;
   private final String name;

   public Foo(int id, String name) {
      this.id = id;
      this.name = name;
   }

   public int getId() {
      return id;
   }

   public String getName() {
      return name;
   }

   @Override public boolean equals(Object o) {
      if (this == o) return true;
      if (!(o instanceof Foo)) return false;
      Foo foo = (Foo) o;
      return id == foo.id && Objects.equals(name, foo.name);
   }

   @Override public int hashCode() {
      return Objects.hash(id, name);
   }

   @Override public String toString() {
      return "Foo{id=" + id + ", name='" + name + "'}";
   }
}
