fun main() {
    val late = Late()
    late.favouriteMovie = "KGF-2"
    println(late.favouriteMovie)
}

class Late() {
    lateinit var favouriteMovie: String
}