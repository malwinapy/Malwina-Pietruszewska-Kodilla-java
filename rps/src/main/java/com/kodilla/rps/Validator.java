package com.kodilla.rps;

        import java.util.Random;

public class Validator {

    private String rock = "1";
    private String paper = "2";
    private String scissors = "3";

    private String endGame = "x";
    private String restartGame = "n";


    public String getComputersMove() {
        String randomResult = "";
        Random random = new Random();
        int select = random.nextInt(99);

        if (select >= 0 && select < 33) {
            randomResult = rock;
        } else if (select >= 33 && select < 66) {
            randomResult = paper;
        } else if (select >= 66 && select < 100) {
            randomResult = scissors;
        }
        return randomResult;
    }

    public void validateInput(String key) {

        String computersMove = getComputersMove();

        if (key.equals(endGame)) {
            System.exit(0);
        } else if (key.equals(computersMove)) {
            System.out.println("Result: draw");
        } else if (
                (key.equals(paper) && computersMove.equals(rock)) ||
                        (key.equals(rock) && computersMove.equals(scissors)) ||
                        (key.equals(scissors) && computersMove.equals(paper)))
        {
            System.out.println("Result: you won");
        } else if (
                (key.equals(paper) && computersMove.equals(scissors)) ||
                        (key.equals(rock) && computersMove.equals(paper)) ||
                        (key.equals(scissors) && computersMove.equals(rock))) {
            System.out.println("Result: you lost");
        }

        String gamerResult = "";
        String computerResult = "";

        switch (key) {
            case "1": gamerResult = "rock";
                break;
            case "2": gamerResult = "paper";
                break;
            case "3": gamerResult = "scissors";
                break;
        }


        switch (computersMove) {
            case "1": computerResult = "rock";
                break;
            case "2": computerResult = "paper";
                break;
            case "3": computerResult = "scissors";
                break;
        }


        System.out.println("Your move: " + gamerResult);
        System.out.println("Computer's move: " + computerResult);


    }
}