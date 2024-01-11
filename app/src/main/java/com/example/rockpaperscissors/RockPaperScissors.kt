package com.example.rockpaperscissors

fun main(){
    var computerChoice = 1
    var playerChoice = ""

    println("Rock, Paper or Scissors?")

    playerChoice = readln().uppercase()
    computerChoice = (1..3).random()

    val rock = 1
    val paper = 2
    val scissors = 3

    var playerWon = false
    var playerDraw = false

    if (playerChoice == "ROCK" && computerChoice == scissors){
        playerWon = true;
    }else if(playerChoice == "PAPER" && computerChoice == rock){
        playerWon = true;
    }else if(playerChoice == "SCISSORS" && computerChoice == paper){
        playerWon = true;
    }else

    if (playerChoice == "ROCK" && computerChoice == rock){
        playerDraw = true;
    }else if(playerChoice == "PAPER" && computerChoice == paper){
        playerDraw = true;
    }else if(playerChoice == "SCISSORS" && computerChoice == scissors){
        playerDraw = true;
    }

    if (playerWon == true && playerDraw == false){
        println("You chose!")
    }else if(playerWon == false && playerDraw == false){
        println("You Lose!")
    }else{
        println("Draw")
    }



}