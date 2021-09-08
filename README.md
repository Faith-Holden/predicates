# predicates
My solution for Chapter 10 Exercise 4 of “Introduction to Programming Using Java”.

Problem Description:
A predicate is a boolean-valued function with one parameter. Java has the parameterized
functional interface Predicate<T>, from package java.util.function, to represent
predicates. The definition of Predicate<T> could be:
public interface Predicate<T> {
public boolean test( T obj );
}
The idea is that an object that implements this interface knows how to “test” objects
of type T in some way. Java already has some methods that use predicates, such as the
removeIf(p) method that is defined for any Collection. (See Subsection 10.6.1). However,
this exercise asks you to write a few similar methods yourself. Define a class that contains
the following generic static methods for working with predicate objects. The name of the
class should be Predicates, in analogy with the standard class Collections that provides
various static methods for working with collections. You should not use the stream API
for this exercise.
public static <T> void remove(Collection<T> coll, Predicate<T> pred)
// Remove every object, obj, from coll for which pred.test(obj)
// is true. (This does the same thing as coll.removeIf(pred).)
public static <T> void retain(Collection<T> coll, Predicate<T> pred)
// Remove every object, obj, from coll for which
// pred.test(obj) is false. (That is, retain the
// objects for which the predicate is true.)
public static <T> List<T> collect(Collection<T> coll, Predicate<T> pred)
// Return a List that contains all the objects, obj,
// from the collection, coll, such that pred.test(obj)
// is true.
public static <T> int find(ArrayList<T> list, Predicate<T> pred)
// Return the index of the first item in list
// for which the predicate is true, if any.
// If there is no such item, return -1.
