import java.text.DecimalFormat

// --------- VARS ----------
var total = 0F
val formatted = DecimalFormat("\u0024#,###.00")


// ---------- RUNNING TOTAL FUNCTION ----------
fun totalCalc(c: Float): Float {
    total += c
    return total
}


// ---------- MAIN FUNCTION ----------
fun main(args: Array<String>?) {

    //var total = 0

    println("Enter cost of item(s). Or 0 when done:")
    var cost = readln().toFloat()

    when (cost) {
        0F -> {
            var tax = total * .025
            var totalWithTax = total + tax
            var suggestedTip = totalWithTax * .175
            var formattedTotal = formatted.format(totalWithTax)
            var formattedTip = formatted.format(suggestedTip)
            println("Your total w/ tax is $formattedTotal")
            println("Suggested Tip: $formattedTip ")

            println("goodbye")
        }

        else -> {
            totalCalc(cost)
            main(null)
        }
    }
}
