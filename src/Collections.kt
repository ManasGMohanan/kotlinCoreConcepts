fun main() {

    //List
    //Ordered collection of elements (can contain duplicates).
    //immutable list
    val name = listOf("name1", "name2", "name3")
    println(name[2])

    //mutable list
    val name1 = mutableListOf("name 1", "name 2", "name 3")
    name1.add("name 4")
    name1.removeAt(1)
    name1.remove("name 4")
    name1.forEach {
        println(it)
    }

    //Set
    //Unordered collection of unique elements.
    //immutable set
    val immutableSet = setOf(1,2,3,3)
    println(immutableSet)

    //mutable set
    val mutableSet = mutableSetOf(1,2,4)
    mutableSet.add(3)
    mutableSet.add(4)
    mutableSet.forEach{
        println(it)
    }

    //Map
    //Collection of key-value pairs.
    //immutable map
    val immutableMap = mapOf(1 to "manas", 2 to "sreyas", 3 to "akhil")
    println(immutableMap[1])

    //mutable map
    val mutableMap = mutableMapOf(1 to "manas", 2 to "sreyas")
    mutableMap[3] = "surya"
    mutableMap.forEach { (t, u) ->
        println("$t and $u")
    }

}