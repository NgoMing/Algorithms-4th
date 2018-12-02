#Algorithms 4th - Robert Sedgewick and Kevin Wayne

## Fundamental ADTs

### Data abstraction
* Data type is a set of values and a set of operations on those values
* An Abstract Data Type (ADT) is a data type whose representation is hidden from the client
* When using ADT: focus on the operations specified in the API, and pay no attention to the data representation
* When implementing ADT: focus on the data, them implement operations on that data
* Refer to a framework for study of algorithms

### Bag
#### Definition
* A collection where removing items is not supported
* Provide the ability to collect items and iterate through the collected items

#### Operations
```
public interface Bag<Item> extends Iterable<Item> {
    void add(Item item);
    boolean isEmpty();
    int size();
}
```
#### Implementation
* Using array
```
public class Array<Item> {
    Item[] items;
    public Array();
    public void addItem(Item item);
    public boolean isEmpty();
    public int size();
}
```