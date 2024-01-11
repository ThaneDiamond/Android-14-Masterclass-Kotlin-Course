package com.example.rockpaperscissors

fun main() {
    var exit = false
    while (exit == false) {


        var playerChoice = ""
        var whileLoop = true

        println("Rock Paper Scissors")
        while (whileLoop) {

            playerChoice = readln().uppercase()
            when {
                playerChoice == "ROCK" -> whileLoop = false
                playerChoice == "PAPER" -> whileLoop = false
                playerChoice == "SCISSORS" -> whileLoop = false
                else -> println("Please enter a valid choice")
            }

        }
        println("You entered $playerChoice")

        var randomNumber = (1..3).random()

        var computerChoice = ""

        when (randomNumber) {
            1 -> computerChoice = "ROCK"
            2 -> computerChoice = "PAPER"
            3 -> computerChoice = "SCISSORS"
        }

        val winner = when {
            playerChoice == computerChoice -> "TIE"
            playerChoice == "ROCK" && computerChoice == "SCISSORS" -> "Player"
            playerChoice == "PAPER" && computerChoice == "ROCK" -> "Player"
            playerChoice == "SCISSORS" && computerChoice == "PAPER" -> "Player"
            else -> "Computer"
        }

        println(
            "Computer chose $computerChoice \n" +
                    "Winner is $winner"
        )

        println(
            "Do you want to continue playing? \n" +
                    "Yes or No"
        )

        var exitChoice = readln().uppercase()
        if (exitChoice == "YES") {
            exit = false
        }else{
            exit = true
        }
    }

}