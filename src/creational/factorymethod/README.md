Factory Method

Factory method is a creational design pattern, i.e., related to object creation. In Factory pattern, we create objects without exposing the creation logic to the client and the client uses the same common interface to create a new type of object.

What is meant when we talk about libraries and clients? 
A library is something that is provided by some third party that exposes some public APIs and clients make calls to those public APIs to complete their tasks. A very simple example can be different kinds of Views provided by Android OS. 

Problem explanation: https://www.geeksforgeeks.org/design-patterns-set-2-factory-method/

What are the problems without the factory method design? 
As you must have observed in the above example, the Client creates objects of either TwoWheeler or FourWheeler based on some input during constructing its object. 
Say, the library introduces a new class ThreeWheeler to incorporate three-wheeler vehicles also. What would happen? The client will end up chaining a new else if in the conditional ladder to create objects of ThreeWheeler. Which in turn will need the Client to be recompiled. So, each time a new change is made at the library side, the Client would need to make some corresponding changes at its end and recompile the code. Sounds bad? This is a very bad practice of design.

How to avoid the problem? 
The answer is, create a static (or factory) method.