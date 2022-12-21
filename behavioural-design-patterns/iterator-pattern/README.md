## Iterator Pattern

## 1. Iterator Pattern - Theory

```
The Iterator Pattern provides a way to access the elements of an aggregate objects sequentially 
without exposing its underlying representation. 

- Head First Design Patterns -
```

- The Iterator Pattern is all about iterating over the items in a collection. (Enumerating all the
  items in a collection). A collection can be considered as a set of multiple objects grouped into a
  single unit. Collections is one of the key concepts in programming. (ex: Java Collections)


- Whenever we have a collection, one of the most important functionalities is to `iterate` over the
  items available in that collection one by one sequentially.


- When considering the responsibilities, We can say how to iterate/traverse/enumerate a Collection
  structure is one thing and whatever that collection normally does is another thing. In other
  words, we may apply common functionalities to the items available, and also we could iterate over
  the items in the collection.


- So If we have constructed some kind of collection, and it contains some items, so we want to be
  able to iterate/go through each item one by one whenever we want There we shouldn't have to care
  about the underlying structure (it may have been developed by some 3rd party) and we should be
  able to iterate it one by one.


- There can be different types of collections which are having complex structures (List, Tree,
  LinkedList), but when it comes to iterate over the items we should be able to do it without having
  to think of its concrete implementation.


- It is true that iterator pattern is already applied in collections available in languages
  like `C#` and `Java`, and we may feel what's the need of manually implementing the iterator
  pattern again. Iterator pattern actually has value beyond that,

    - We can take iterator pattern and apply it to our own class/ our own complex collection
      structure. More customisation is there. When we implement iterator pattern oven our own
      collection, we do not have to expose the
      internal complex structure. Iterators do not provide the entire collection at once, but items
      of it one by one. So fot the collection we'll have the encapsulation benefit/ information
      hiding benefit. So the collection does not have to expose the underlying complex structure.

    - Lazy evaluation - Iterator provide items sequentially. It gives us one item, and then we can
      decide whether we want the next item or not. Sp we can stop the evaluation when required. And
      also we can construct infinite collections where we can ask for items infinite number of
      times.

    - We can manually keep track of where we are in the iteration, pause at that location and
      continue later on. Clearly we can do this by using some type of loop and an index, but it's
      much more simple when we use the iterator pattern.


- Simply, in iterator pattern, we want to access the elements of an aggregate object one ny one
  sequentially without exposing the underlying representation.


- There are 4 main things to consider when it comes to the implementation

    1. `Iterable` - Also known as enumerable/ aggregate. It's the thing that aggregates other
       things. This is basically the collection.
    2. `ConcreteIterable` - Implements the `Iterable` interface. (`ConcreteIterable` is
       a `Iterable`). There `Concreteiterable`s have different underlying structures.
       There can be multiple `ConcreteIterable's.
    3. `Iterator` - Thing that does the enumeration.
    4. `ConcreteIterator` - Implements the `Iterator` interface. There can be
       multiple `ConcreteImplementor`s.

## 2. References

1. https://www.youtube.com/watch?v=uNTNEfwYXhI&t (Video: `Iterator Pattern – Design Patterns
   (ep 16)`, Author: `Christopher Okhravi`)
2. https://www.tutorialspoint.com/design_pattern/iterator_pattern.htm
3. https://www.geeksforgeeks.org/iterator-pattern/
4. https://refactoring.guru/design-patterns/iterator
