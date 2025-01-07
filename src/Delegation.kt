fun main() {

    val printer = ConsolePrinter() // Create a ConsolePrinter
    val manager = Manager(printer) // Manager delegates to ConsolePrinter
    manager.printMessage()         // Call printMessage on Manager

}

//example 1

/*

The Problem We’re Solving
Imagine you have a class Manager that needs to print messages.
Instead of writing the code for printing directly in the Manager class, we want to delegate this responsibility to another class (ConsolePrinter).
This helps avoid duplication and makes the code cleaner.

 */

interface Printer {
    fun printMessage()
}

class ConsolePrinter : Printer {
    override fun printMessage() {
        println("Printing from ConsolePrinter!")
    }
}

class Manager(printer: Printer) : Printer by printer

/*
How It Works Internally
When you call manager.printMessage(), this happens under the hood:

- Manager checks if it has a Printer to delegate to (which it does — the ConsolePrinter).
- Manager forwards the printMessage() call to the ConsolePrinter.
- The ConsolePrinter handles the call and prints: "Printing from ConsolePrinter!".
 */

//--------------------------------------------------------------------------------------

//example 2
//just implementing the usage

class App : A by FirstDelegate(), B by SecondDelegate() {
    override fun print() {
    }

    override fun print2() {
    }
}

interface A {
    fun print()
}

interface B {
    fun print2()
}

open class FirstDelegate : A {
    override fun print() {
    }
}

open class SecondDelegate : B {
    override fun print2() {
    }
}

