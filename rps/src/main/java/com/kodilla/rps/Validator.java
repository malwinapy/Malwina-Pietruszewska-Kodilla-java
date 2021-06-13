package com.kodilla.rps;

        import java.util.Random;

public class Validator {

    private final String rock = "1";
    private final String paper = "2";
    private final String scissors = "3";

    private final String endGame = "x";
    private final String restartGame = "n";


    public String getComputersMove() {
        String randomResult = "";
        Random random = new Random();
        int r = random.nextInt(99);

        if (r >= 0 && r < 33) {
            randomResult = rock;
        } else if (r>= 33 && r < 66) {
            randomResult = paper;
        } else if (r >= 66 && r < 100) {
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
            default:
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