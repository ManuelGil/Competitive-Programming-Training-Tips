import java.util.*

fun main(args: Array<String>) {
    val numbers = takeInput()

    bubbleSort(numbers)

    println(numbers.joinToString(separator = " "))
}


fun takeInput(): IntArray {
    val scanner = Scanner(System.`in`)
    val size = scanner.nextInt()
    val numbers = IntArray(size)
    for (i in 0 until size) {
        numbers[i] = scanner.nextInt();
    }
    return numbers;
}

fun bubbleSort(numbers: IntArray) {
    for (pass in 0 until (numbers.size - 1)) {
        // A single pass of bubble mergeSortOptimized
        for (currentPosition in 0 until (numbers.size - pass - 1)) {
            // This is a single step
            if (numbers[currentPosition] > numbers[currentPosition + 1]) {
                val tmp = numbers[currentPosition]
                numbers[currentPosition] = numbers[currentPosition + 1]
                numbers[currentPosition + 1] = tmp
            }
        }
    }
}

fun bubbleSortWithSteps(numbers: IntArray) {
    println("Initial numbers: [%s]".format(numbers.joinToString(separator = ", ")))
    for (pass in 0 until (numbers.size - 1)) {
        // A single pass of bubble mergeSortOptimized
        for (currentPosition in 0 until (numbers.size - pass - 1)) {
            // This is a single step
            print("Pass-%d-Step-%d: Comparing elements at position %d(%d) and %d(%d). ".format(pass, currentPosition,
                    currentPosition, numbers[currentPosition], (currentPosition + 1), numbers[currentPosition + 1]))
            if (numbers[currentPosition] > numbers[currentPosition + 1]) {
                println("They are in wrong order, swap them")
                val tmp = numbers[currentPosition]
                numbers[currentPosition] = numbers[currentPosition + 1]
                numbers[currentPosition + 1] = tmp
            } else {
                println("They are in correct order, do not swap them")
            }
            println("Numbers after Pass-%d-Step-%d: [%s]".format(pass, currentPosition, numbers.joinToString(separator =
            ", ")))
        }
    }
    println("Sorted numbers: [%s]".format(numbers.joinToString(separator = ", ")))
}

fun bubbleSortSinglePass(numbers: IntArray) {
    for (currentPosition in 0 until (numbers.size - 1)) {
        if (numbers[currentPosition] > numbers[currentPosition + 1]) {
            val tmp = numbers[currentPosition]
            numbers[currentPosition] = numbers[currentPosition + 1]
            numbers[currentPosition + 1] = tmp
        }
    }
}