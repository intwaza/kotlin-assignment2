fun main() {
    name()
    var remainder = modulus(10, 6)
    println(remainder)
    var sumation = add(3, 2, 5, 7)
    println(sumation)
    fact()
}

fun name() {
    var name = "Belyse"
    var greeting = ("hello " + name)
    println(greeting)
}

fun modulus(num1: Int, num2: Int): Int {
    var modulus = num1 % num2
    return modulus
}

fun add(num1: Int, num2: Int, num3: Int, num4: Int): Int {
    var add = num1 + num2 + num3 + num4
    return add
}

fun fact() {
    var fact = ("trust myself")
    println(fact)
}