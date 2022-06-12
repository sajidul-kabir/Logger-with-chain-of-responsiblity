# Design Patterns Assignment for 3-1

### Project can be run from the Main class inside the src folder.
Here **ConsoleLogger , WarningLogger and ErrorLogger** are three concrete classes implementing the **Logger** interface and an **Error** class to specify the nature of the errors.
Chain of Responsibility is built as such : **ConsoleLogger -> WarningLogger -> ErrorLogger** so that when an object is unable to process the data , it passes on to the next object into the chain.
