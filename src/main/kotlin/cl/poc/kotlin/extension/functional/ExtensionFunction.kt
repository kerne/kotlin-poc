package cl.poc.kotlin.extension.functional

fun String.decode(): String {
    return this.replace(" ", "*")
}

fun List<String>.upper(): List<String> {
    return this.map { s -> s.uppercase() }.toList()
}