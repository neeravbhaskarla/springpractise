In the Vehicle folder, I have implemented business logic using Aspect-Oriented Programming (AOP) with Spring AOP annotations, including:

1. @Before
2. @AfterThrowing
3. @AfterReturning
4. @After
5. @Around

I created an @AspectJ proxy to separate non-business (cross-cutting) concerns from the core business logic. To enable AspectJ, I used the @EnableAspectJAutoProxy annotation in the ProjectConfig class.

Inside the aspect package, I defined multiple aspects along with their corresponding advices and pointcuts.

Additionally, I created a custom annotation for method-specific logging:

```java
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface LogAspect { }
```

This annotation is applied to relevant methods, and in the aspect, it is accessed using @annotation(com.example.annotation.LogAspect).
