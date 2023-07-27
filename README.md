# functional-programming
Java 8 Features Snippets 

## :raised_eyebrow: _Functional Interface_
- It contains only one abstract method but can have multiple default and static methods 

- Lambda expression is only applicable to Functional interface
 > Note: ( ) -> { body };   syntax for lambda expression

- You can also use lambda expression to implement compare() method of Comparator interface in a single line when calling 
`Collections.sort(list , (o1,o2) - > return o1.getName().compareTo(o2.getName()));`

 ## :anchor: _Consumer Functional Interface_
- It is an inbuilt interface 
- Used in all contexts where an object is taken as an **input and is to be consumed and some operations are to be performed on it without returning any result**.


 ## :dart: _Predicate Functional Interface_
 - It is used for conditional check
 - If we are using **true/false** returning functions we should use Predicate

- boolean test(T t)


 ## :airplane: _Supplier Functional Interface_
- It is used when there is no input but an output is expected.
- T get();  `T is the object which is the return type of the function.`


```shell 
forEach method accepts Consumer as argument 

filter method accepts predicate as argment based on the condition it filters the data supplied to it.

If you are doing some filtering using filter method and not getting any result then in order to return some dummy result we can use Supplier interface.
```

## :potable_water: _Stream API_
- It is used to process collection of objects.
- Is a sequence of objects that supports various methods which can be pipelined to produce the desired result.
- Why we need streams ?
    - Functional Programming
    - code reduce
    - Bulk operation

## :: Sorting using Stream API & Lambda Expression
```shell
       List<Employee> list =  new Database().getEmployees();
        
       #Traditional method
       Collections.sort(list, new MyComparator());
       System.out.println(list);
       
       #Lambda Expression
       Collections.sort(list ,(o1,o2) -> (int) ((int) o1.getSalary() - o2.getSalary()) );
       System.out.println(list);

       #Stream sorting
       list.stream()
       .sorted((o1,o2) -> (int) ((int) o2.getSalary() - o1.getSalary()))
       .forEach(emp -> System.out.println(emp.getSalary()));
```

## :: Map & Flat Maps
- Both of these are used for **Data transformation**
- Map are just for  **Data**  `Transformation` while FlatMaps are for `Transformation & Flattering.`
 
| map()| flatMap()| 
|----|-----| 
|The function passed to map() operation returns a single value for a single input.	|The function you pass to flatmap() operation returns an arbitrary number of values as the output.|
|One-to-one mapping occurs in map().|One-to-many mapping occurs in flatMap().|
|Only perform the mapping.|Perform mapping as well as flattening.|
|Produce a stream of value.	| Produce a stream of stream value.|
|map() is used only for transformation.	| flatMap() is used both for transformation and mapping. |


```shell
#Example of Stream of Stream 
List of list-[[1, 2], [3, 4], [5, 6], [7, 8]]

# The above is converted to Stream using FlatMaps 


```



