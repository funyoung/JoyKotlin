// 从Int到Int的复合函数，在函数上的二元运算。二元运算的例子之一是加法，
// 它是一个在数值上的二元运算。f1和f2都是Int到Int的函数，compose是以f1,f2
// 为参数的复合函数，返回值类型是Int到Int的函数类型。
fun compose(f1: (Int)->Int, f2:(Int)->Int):(Int)->Int {
    // TODO("函数复合表达式的写法正确与否")
    return f1(f2))
}
