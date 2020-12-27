import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking


/**
 * Running a million light weight coroutines
 */
fun main(){
    runBlocking {
        repeat(1_000_000){
            launch {
                print(".")
            }
        }
    }
}