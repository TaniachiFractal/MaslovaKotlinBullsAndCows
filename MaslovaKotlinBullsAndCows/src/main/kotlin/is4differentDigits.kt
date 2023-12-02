// This function returns True if the input integer is a 4 digits number with all different digits
// (0123 is the smallest, 9876 is the biggest)
fun is4differentDigits(input: Int): Boolean
{
    if (input<123 || input>9876) return false

    val digitArrayFromInput = input.toString().toCharArray()

    return digitArrayFromInput.distinct().size == 4

}