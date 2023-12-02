// "Bulls and Cows"
// Player A: I'm ready (thinks of 4271)
// Player B: 1234?
// Player A: 1 bull and 2 cows. (2 is "bull", 4 & 1 are "cows")
fun main()
{
    var secretCode = (123..9876).random()
    while (!is4differentDigits(secretCode))
    {
        secretCode = (123..9876).random()
    }

    println("Добро пожаловать на игру \"Быки и Коровы\"! " +
            "Я загадал разные 4 цифры, а тебе надо их угадать.\n" +
            "Если цифра правильная в правильной позиции, она БЫК \uD83D\uDC02\n" +
            "А если правильная в неправильной позиции, она КОРОВА \uD83D\uDC04\n" +
            "После каждой попытки я говорю тебе количество БЫКОВ \uD83D\uDC02 и КОРОВ \uD83D\uDC04\n" +
            "Начнём!")

    var turnCount = 1
    var currentInput = 0
    while(true)
    {
        while (!is4differentDigits(currentInput))
        {
            print("Попытка № $turnCount. Введите 4 разные цифры (в формате 1234) \n>_ ")
            currentInput = readln().toInt()
        }
        if (countBulls(currentInput,secretCode)>0 || countCows(currentInput,secretCode)>0)
        {
            print("У вас вышло ")
            for (i in 1..countBulls(currentInput,secretCode)) print("\uD83D\uDC02")
            print(" ")
            for (i in 1..countCows(currentInput,secretCode)) print("\uD83D\uDC04")
            println()
        }
        else
        {
            println("Ни коровы, ни быка...")
        }

        if (currentInput == secretCode)
        {
            println("Вы победили! Загаданное число действительно $secretCode")
            return
        }

        turnCount++
        currentInput = 0
    }

}

