### Notes

#### Dependency injection [DI]

+ Dependency injection is a pattern we can use to implement IoC, where the control being inverted is setting an object's dependencies.

+ Connecting objects with other objects, or “injecting” objects into other objects, is done by an assembler rather than by the objects themselves.

##### Setter based
+ Spring IOC Container will call setter methods of our class after invoking a no-argument constructor or no-argument static factory method to instantiate the bean.

##### Constructor based
+ Spring IOC Container will invoke a constructor with arguments each representing a dependency we want to set.
+ Spring resolves each argument primarily by type, followed by name of the attribute, and index for disambiguation.

##### Fields
+ Inject the dependencies in an object by marking the field with an @Autowired annotation
+ Spring IOC container will use reflection to inject field bean into the object while constructing it, if there's no constructor or setter method to inject the field bean. 

#### Advantages of DI
+ Decoupling the execution of a task from its implementation
+ Making it easier to switch between different implementations
+ Greater modularity of a program
+ Greater ease in testing a program by isolating a component or mocking its dependencies, and allowing components to communicate through contracts