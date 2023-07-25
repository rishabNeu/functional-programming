# functional-programming
Java 8 Features Snippets 

## :: Functional Interface
- It contains only one abstract method but can have multiple default and static methods 

- Lambda expression is only applicable to Functional interface
 > Note: ( ) -> { body };   syntax for lambda expression

- You can also use lambda expression to implement compare() method of Comparator interface in a single line when calling 
`Collections.sort(list , (o1,o2) - > return o1.getName().compareTo(o2.getName()));`

 ## :: Consumer Functional Interface
- It is an inbuilt interface 
- Used in all contexts where an object is taken as an **input and is to be consumed and some operations are to be performed on it without returning any result**.


 ## :: Predicate Functional Interface
 - It is used for conditional check
 - If we are using **true/false** returning functions we should use Predicate

- boolean test(T t)


 ## :: Supplier Functional Interface
- It is used when there is no input but an output is expected.
- T get();  `T is the object which is the return type of the function.`


