package edu.kit.informatik;

public class Player {
    private String name;

    /**
     * Constructor.
     * 
     * @param name the name of the player
     */
    public Player(String name) {
        this.name = name;
    }

    /**
     * @return the name of the player
     */
    public String getName() {
        return name;
    }
}