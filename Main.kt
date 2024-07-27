import java.util.Scanner

fun add(num1 : Double, num : Double): Double {
    var result = num1
    result += num
    return(result)
}

fun subtract(num1 : Double, num : Double): Double {
    var result = num1
    result -= num
    return(result)
}

fun multiply(num1 : Double, num : Double): Double {
    var result = num1
    result *= num
    return(result)
}

fun divide(num1 : Double, num : Double): Double {
    var result = num1
    result /= num
    return(result)
}





fun main() {
    var kotin = Scanner(System.`in`)

    var new_operation : Int

    var num1 : Double
    println("Num 1 : ")
    num1 = kotin.nextDouble()

    while (true) {
        println("Operation\n===========================================\n1. +\n2. -\n3. *\n4. /\n0. break\n")
        var operation: Int = kotin.nextInt()

        if (operation == 0) {
            break
        }

        println("Num : ")
        var num: Double = kotin.nextDouble()

        if (operation == 1) {
            num1 = add(num1, num)
            print("\nOutput : ")
            print(num1)
            println("\n")
        } else if (operation == 2) {
            num1 = subtract(num1, num)
            print("\nOutput : ")
            print(num1)
            println("\n")
        } else if (operation == 3) {
            num1 = multiply(num1, num)
            print("\nOutput : ")
            print(num1)
            println("\n")
        } else if (operation == 4) {
            num1 = divide(num1, num)
            print("\nOutput : ")
            print(num1)
            println("\n")
        } else {
            println("Invalid operation. Try again with numbers 1 ~ 4. ")
        }

    }

    print("\n\n\n\nOutput : ")
    print(num1)
    print("\n")

    println("\nEnd Operation. \n\n\n")

    println("New Operation ? ( 1 for Yes and 0 for NO ) ")
    new_operation = kotin.nextInt()

    while (new_operation == 1) {
        println("Num 1: ")
        num1 = kotin.nextDouble()

        while (true) {
            println("Operation\n===========================================\n1. +\n2. -\n3. *\n4. /\n0. break\n")
            var operation : Int = kotin.nextInt()

            if (operation == 0) {
                break
            }

            println("Num : ")
            var num : Double = kotin.nextDouble()

            if (operation == 1) {
                num1 = add(num1, num)
                print("\nOutput : ")
                print(num1)
                println("\n")
            }
            else if (operation == 2) {
                num1 = subtract(num1, num)
                print("\nOutput : ")
                print(num1)
                println("\n")
            }
            else if (operation == 3) {
                num1 = multiply(num1, num)
                print("\nOutput : ")
                print(num1)
                println("\n")
            }
            else if (operation == 4) {
                num1 = divide(num1, num)
                print("\nOutput : ")
                print(num1)
                println("\n")
            }
            else {
                println("Invalid operation. Try again with numbers 1 ~ 4. ")
            }

        }

        print("\n\n\n\nOutput : ")
        print(num1)
        print("\n")

        println("\nEnd Operation. \n\n\n")

        println("New Operation ? ( 1 for Yes and 0 for NO ) ")
        new_operation = kotin.nextInt()
    }
    println("\n\n\n\nEnd of process ")
}