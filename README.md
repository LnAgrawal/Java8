# Java8Streams
1. **Example1DebugStream** peek method is used to debug the streams
2. **Example2MapMethod** Map method example in stream
3. **Example3FlatMapMethod** FlatMap is used to flatten tthe stream when each stream represents multiple values
4. **Example4DistinctCountSortedWithStream**
    1. **distinct()** is used to return unique element from stream.
    2. **count()** is used to count number of stream and returns long.
    3. **sorted()** is used to sort the steam in ascending order
5. **Example5SortingWithStream** : Using sorted with comparator
    1. **sortStudentByName()** uses comparator to sort the data in ascending order
    2. **sortStudentByNameusingComparatorComparing()** uses Comparator.comparing to sort the data
    3. **sortStudentByNameusingComparatorComparingMR()** uses Comparator.comparing with method reference
    4. **sortStudentByGPA()** uses Comparator.comparing to sort the by gpa
    5. **sortStudentByGPADesc()** uses Comparator.comparing().reversed() to print the data in descending order
6. **Example6FilterWithStream** Filter accepts predicate, used to filter stream on basis of certain condition
7. **Example7StreamReduce** reduce is a terminal operation, which reduces list of stream values to single value
    1. reduce with identity
    2. reduce without identity (Optional)
8. **Example8StreamMapReduceExample** Streams with Filter, map and reduce example
9. **Example9StreamsMaxMin** Get min and max value using reduce method.
10. **Example10LimitSkip** limt() is used to limit the stream, skip() is used to skip the initial values
11. **Example11StreamsMatch** : All the below takes in a predicate and returns a boolean value
    1. anyMatch() : returns true if any one of the element matches the predicate, otherwise false
    2. allMatch() : returns true if all the element matches the predicate, otherwise false
    3. noneMatch() : opposite of allMatch(). returns true if none of the element matches the predicate otherwise false
12. **Example12StreamsFindAnyFirst** : Used to find an element in the stream. It returns the Optional type
    1. findFirst() : find first element as per the condition.
    2. findAny(): returns the first encountered element in the stream.

13. **Example13StreamOfGenerateIterate** :
    1. of() : Stream.of() get the stream of values
    2. iterate() : Stream.iterate() accepts function, takes 1 initial value and iterate on basis of passed UnaryOperator
    3. generate() : Accepts supplier

**Numeric Streams**
14. **Example14NumericStreams** The example contains the following:
    1. IntStream
    2. LongStream
    3. DoubleStream : can be obtained from IntStream or LongStream by asDoubleStream() method.
    4. range : include the start range and exclude the end range
    5. rangeClosed : include the range of start and end

15. **Example15NumericStreamsAggregate**
    1. sum() : returns the sum value
    2. min() : returns the OptionalInt, OptionalLong , get method is getAsInt, getAsLong
    2. max() : returns the OptionalInt, OptionalLong, get method is getAsInt, getAsLong
    3. average() : returns OptionalDouble, get method is getAsDouble

16. **Example16NumericStreamsBoxingUnboxing**
    1. Boxing : convert primitive to wrapper class. use boxed()
    2. Unboxing : convert wrapper class to primitive. use mapToInt

17. **Example17NumericStreamMapTo**
    1. mapToObj : convert a each element numeric stream to object
    2. mapToLong: convert a numeric stream to a Long Stream
    3. mapToDouble : convert a numeric stream to a Double Stream

**Collect**

18. **Example18Joining**
    1. joining() : joins the string
    2. joining(",") : joins the string with delimiter
    3. joining(",", "(",")") : joins the string with delimiter, prefix and suffix

19. **Example19Counting** : Collectors.counting() method

20. **Example20Mapping** mapping() : applies a transformation function first and then collects the data in collection

21. **Example21MinByMaxBy**
    1. minBy : accepts a comparator, depending on comparator returns the Optional min
    2. maxBy : accepts a comparator, depending on comparator returns the Optional max

22. **Example22SummingIntAveragingInt**
    1. summingInt
    2. averagingInt



**Short Circuiting**:
All these function doesn't have to iterate the whole stream to evaluate the result. limit(), findFirst(), findAny(), anyMatch(), allMatch(), noneMatch()

**Example 1:**
if(boolean1 && boolean2) {
//body
}
- if the first expression evaluates to false then the second expression will not execute

**Example 2:**
if(boolean1 || boolean2) {
//body
}
- if the first expression evaluates to true then the second expression will not execute

**Stateful VS Stateless**
Streams have internal state. Not all stream functions have internal state. Stream state resides in the intermediate state.
- Stateful functions:
    - distinct()
    - sorted()
    - limit()
    - skip()
- Stateless functions
    - map()
    - filter()
    - etc..
