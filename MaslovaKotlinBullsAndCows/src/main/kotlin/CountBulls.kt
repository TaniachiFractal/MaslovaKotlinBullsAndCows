// This function returns the number matching digits in 2 numbers - Bulls (see Main.kt)
fun countBulls(input: Int, reference: Int):Int
{
    var output = 0

    val digitArrayFromInput = input.toString().toCharArray()
    val digitArrayFromReference = reference.toString().toCharArray()

    for (i in digitArrayFromInput.indices)
    {
        if (digitArrayFromInput[i]==digitArrayFromReference[i])
        {
            output++
        }
    }
    return output
}