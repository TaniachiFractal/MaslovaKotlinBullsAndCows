// This function returns the number of matching digits on wrong positions in 2 numbers - Cows (see Main.kt)
fun countCows(input: Int, reference: Int):Int
{
    var output = 0

    val digitArrayFromInput = input.toString().toCharArray()
    val digitArrayFromReference = reference.toString().toCharArray()

    val maskOfInput = arrayOf(')','!','@','#','$','%','^','&','*','(')
    val maskOfReference = arrayOf('(','*','&','^','~','$','#','@','!',')')

    for (i in digitArrayFromInput)
    {
        maskOfInput[i.toString().toInt()] = i
    }
    for(i in digitArrayFromReference)
    {
        maskOfReference[i.toString().toInt()] = i
    }

    for (i in 0..9)
    {
        if (maskOfInput[i]==maskOfReference[i])
        {
            output++
        }
    }
    output-=countBulls(input,reference)
    return output
}