package subtask3

class StringParser {
    fun getResult(inputString: String): Array<String> {
        val myArray = ArrayList<String>()
        var index = 0

        while (index < inputString.length) {
            if (inputString[index] == '(' || inputString[index] == '<' || inputString[index] == '[') {
                var step = 1
                val startIndex = index + 1
                var endIndex: Int
                val openBracket = inputString[index]
                val closeBracket = when (openBracket) {
                    '(' -> ')'
                    '<' -> '>'
                    else -> ']'
                }
                for (i in startIndex..inputString.length) {
                    if (inputString[i] == openBracket) ++step
                    if (inputString[i] == closeBracket && step == 1) {
                        endIndex = i
                        index = startIndex - 1
                        myArray.add(inputString.substring(startIndex, endIndex))
                        break
                    }
                    if (inputString[i] == closeBracket && step != 1) --step

                }

            }
            ++index
        }
        return myArray.toTypedArray()
    }
}