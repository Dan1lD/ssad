# SSAD Assignment 1

*Agafonov Alexander (a.agafonov@unnopolis.university)
Davydyan Danil (d.davydyan@innopolis.university)
Ivshina Tatiana (t.ivshina@unnopolis.university)
Tolmachev Anton (a.tolmachev@unnopolis.university)*

## Task
Create a program that tracks the delays of trains and accordingly updates the information about the trains on the following stations. The system should support different kinds of trains and according station types (i.e. long distant trains, suburban trains, and freight trains). The requirement is that the information on different types of trains is rendered on different screens.

## Realization
**UML Diagram** 
 
![](https://i.imgur.com/Z8fs8dP.jpg)

The abstract class `TrackingScreen` is responsible for rendering the information on trains on the screen. It defines the interface for rendering the 
head (the properties of the trains)and the body of the timetable and the fabric method `createTracking(int)` that takes the id of the train and creates the object implementing `Tracking` interface. `Tracking` interface is responsible for getting *(and parsing)* data on the certain train by id.

Child classes of `TrackingScreen` are different implementations for different types of trains. Their overriden method `createTracking(int)` creates the following specialized `Tracking` instance (e.g. `SuburbanTrackingScreen.createTracking(int)` creates the instance of `SuburbanTracking` adding it to the list of tracked trains defined in `TrackingScreen`).

Described above UML is implemented in the Java code.

---



## Why using Factory method pattern?

We use factory method pattern because for different types of train we need different implementation of taking and parsing them from database. 

Additionally, such architecture gives us the flexibility when adding some other types of trains or even other types of transport. It can be done by simply adding new `TrackingScreen` and `Tracking` implementations (new classes).
