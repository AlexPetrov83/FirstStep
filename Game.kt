fun main() {

    val options = arrayOf("Rock", "Paper", "Scissors")
    val gameChoice = getGameChoice(options)
}

fun getGameChoice(optionsParam: Array<String>) =
    optionsParam[(Math.random() * optionsParam.size).toInt()]

fun getUserChoice()
    printLn("Please enter one of the following: Rock, Scissors, Paper.")


        стр 105