package subtask2

class BillCounter {
    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        val trueSumBrian = (bill.sum() - bill[k]) / 2
        if (trueSumBrian == b) {
            return "Bon Appetit"
        } else {
            return (b - trueSumBrian).toString()
        }
    }
}
