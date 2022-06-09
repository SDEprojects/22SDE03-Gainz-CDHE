package com.games.gobigorgohome;

import com.apps.util.Console;
import com.apps.util.Prompter;

class Game {

    boolean isGameOver = false;
    private Player player;
    private final int energy = player.getEnergy();
    private final int currentEnergy = player.getEnergy();
    private final String playerName = player.getName();
    private final String currentRoom = "Front Desk";
    private Prompter prompter;


    //    collects current input from user to update their avatar
    private void getNewPlayerInfo(){
//        TODO: validate user input
        String playerName = prompter.prompt("What is your name?");
        double playerHeight = Double.parseDouble(prompter.prompt("What is your height?"));
        double playerWeight = Double.parseDouble(prompter.prompt("What is your weight?"));
        int playerAge = Integer.parseInt(prompter.prompt("What is your age?"));
        createPlayer(playerName, playerAge, playerHeight, playerWeight);
    }

    private void createPlayer(String playerName, int playerAge, double playerHeight, double playerWeight) {
        player.setName(playerName);
        player.setAge(playerAge);
        player.setHeight(playerHeight);
        player.setWeight(playerWeight);
    }

    //    updates player with current game status e.g. player inventory, current room etc.
    private void gameStatus(){
        System.out.println("------------------------------");
        System.out.println("Player: " + getPlayerName());
//        System.out.println("You are in the " + getCurrentRoom());
        System.out.println(player.getName() + ", you have " + player.getInventory() + " in your gym bag.");
        System.out.println("Your current energy level is " + getCurrentEnergy() + " out of " + getEnergy());
        System.out.println("------------------------------");
    }

    //    main function running the game, here we call all other functions necessary to run the game
    private void playGame(){
        // runs a while loop
        while (!isGameOver()) {
            // call functions
            validateInput();
            Console.clear();
            checkGameStatus();
            updateGame();
        }
        gameResult();
        playAgain();
    }

    private void checkGameStatus() {
    }

    private void playAgain() {
    }

    private void gameResult() {
        Console.clear();

    }
    //this method will handle the user's input for the action
//    and the according methods called for whatever action
    private void updateGame() {
    }


    private void validateInput() {
    }

    //    returns whether game is over or not.
    private void isGameOver(boolean currentGameStatus){
            setGameOver(currentGameStatus);
    }

    //    gives player ability to quit
    private void quit(){}

    //    start a new game
    private void newGame(){}

    // accessor methods
    public void setGameOver(boolean gameOver) {
        isGameOver = gameOver;
    }

    public boolean isGameOver() {
        return isGameOver;
    }

    public int getEnergy() {
        return energy;
    }

    public int getCurrentEnergy() {
        return currentEnergy;
    }

    public String getPlayerName() {
        return playerName;
    }

    public Prompter getPrompter() {
        return prompter;
    }
}


