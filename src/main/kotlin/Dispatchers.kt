import kotlinx.coroutines.*

fun main() {
    runBlocking {
//        launch(Dispatchers.Main) {
//            println("Main dispatcher. Thread: ${Thread.currentThread().name}")
//        }

        launch(Dispatchers.Unconfined) {
            println("Unconfined 1 dispatcher. Thread: ${Thread.currentThread().name}")
            delay(100L)
            println("Unconfined 2 dispatcher. Thread: ${Thread.currentThread().name}")
        }

        launch(Dispatchers.Default) {
            println("Default dispatcher. Thread: ${Thread.currentThread().name}")
        }

        launch(Dispatchers.IO) {
            println("IO dispatcher. Thread: ${Thread.currentThread().name}")
        }

        // expensive
        launch(newSingleThreadContext("MyThread")) {
            println("newSingleThreadContext. Thread: ${Thread.currentThread().name}")
        }
    }
}