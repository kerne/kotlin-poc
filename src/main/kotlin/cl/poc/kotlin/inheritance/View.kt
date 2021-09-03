package cl.poc.kotlin.inheritance

open class View(
    var context: Context,
    open val me: String = "default".uppercase().also { println("Initialization $it") }
) {
    init {
        println("Initialization Class")
    }

    open fun print() {
        println("${context.name} and $me")
    }
}

class MyView(context: Context, args: String) : View(context) {
    override var me: String = args

}

class Context(
    val name: String
)


fun main() {
    var ctx = Context("Contexto")
    var view = MyView(ctx, "another Args")
    view.print()
}
