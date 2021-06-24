// 从Int到Int的复合函数，在函数上的二元运算。二元运算的例子之一是加法，
// 它是一个在数值上的二元运算。f1和f2都是Int到Int的函数，compose是以f1,f2
// 为参数的复合函数，返回值类型是Int到Int的函数类型。
/**
fun compose(f1: (Int)->Int, f2:(Int)->Int):(Int)->Int {
    // TODO("函数复合表达式的写法正确与否")
    // return f1(f2))
    // 
}
**/

/** hint:
    // 1. 使用lambda表达式：fun compose(...):... = {...}
    // 2. lambda表达式内缺失函数参数，只有一个参数可以简化为it
    // {f1(f2(it))}
    // 3. lambda表达式内参数可以使用标准的自定义x
    // {x -> f(g(x))}
**/

fun square(x: Int): Int = x * x
fun triple(x: Int): Int = 3 * x

fun compose(f: (Int) -> Int, g: (Int) -> Int): (Int) -> Int = { f(g(it)) }
fun compose1(f: (Int) -> Int, g: (Int) -> Int): (Int) -> Int = { x -> f(g(x)) }

val squareOfTriple = compose(::square, ::triple)
println(squareOfTriple(2))
// expected result is 36
