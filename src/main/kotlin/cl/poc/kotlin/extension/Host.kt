package cl.poc.kotlin.extension

class Host(val hostname: String) {
    fun printHostName() {
        print(hostname)
    }
}

class Connection(val host: Host, val port: Int) {
    private fun printPort() {
        print(port)
    }

    private fun Host.printConnection() {
        printHostName()
        print(":")
        printPort()
    }

    fun connect() {
        host.printConnection()
    }

}

fun main() {
    Connection(Host("localhost"), 8000).connect()
}