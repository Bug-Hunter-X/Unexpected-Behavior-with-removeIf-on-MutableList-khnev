```kotlin
fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    val copyList = list.toMutableList() // Create a copy
    copyList.removeIf { it % 2 == 0 }
    println(copyList) //Prints [1,3,5]
    println(list) //Prints [1,2,3,4,5]
}
```