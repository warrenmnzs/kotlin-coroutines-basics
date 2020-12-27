import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

/**
 * Basics of running a coroutine
 */
fun main() {
    GlobalScope.launch {
        delay(2000)
        println("World")
    }

    print("Hello, ")
    Thread.sleep(3000)
}