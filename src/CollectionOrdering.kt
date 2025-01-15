fun main() {
    val numbers = mutableListOf(1, 89, 54, 6, 45, 33)
    println(numbers.sorted())

    val laptopList = mutableListOf(
        Laptop("dell", 2020, 2, 2000),
        Laptop("asus", 2019, 1, 1000),
        Laptop("hp", 2023, 16, 5000),
        Laptop("msi", 2025, 8, 10000),
        Laptop("lenovo", 2022, 8, 12000),
    )

    //easy to use
    laptopList.sortedBy { it.ram }.forEach { println(it) }
    println("\n")
    laptopList.sortedBy { it.year }.forEach { println(it) }
    println("\n")

    //other options
    laptopList.sortedWith(compareBy { it.price }).forEach { println(it) }
    println("\n")
    laptopList.sortedWith(compareBy<Laptop> { it.ram }.thenBy { it.year }).forEach { println(it) }

    /*
    compareBy { it.ram }:
    This sorts the list of laptops in ascending order by their RAM (smallest RAM first).

    thenBy { it.year }:
    If two laptops have the same RAM, this breaks the tie by sorting them further in ascending order by their year (older laptops first).
    Can have more thenBy statements
     */

}

data class Laptop(val brand: String, val year: Int, val ram: Int, val price: Int)