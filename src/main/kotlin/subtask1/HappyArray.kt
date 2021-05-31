package subtask1

class HappyArray {
    fun convertToHappy(sadArray: IntArray): IntArray {
        var Sad = true
        var filter = sadArray.toList()
        while (Sad) {
            Sad = false
            filter = filter.filterIndexed { index, i ->
                return@filterIndexed if (index == 0 || index == filter.size - 1) {
                    return@filterIndexed true
                } else {
                    val isHappy = filter[index + 1] + filter[index - 1] > i
                    if (!isHappy) Sad = true
                    isHappy
                }
            }
        }
        return filter.toIntArray()
    }
}
