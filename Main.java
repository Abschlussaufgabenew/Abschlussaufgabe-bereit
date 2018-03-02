package edu.kit.informatik;

public class Main {

    /**
     * this is the program entry method main
     * 
     * @param args array of strings of the given command line arguments        
     */
    public static void main(String[] args) {
        String mode = args[0];
        int gameSize = Integer.parseInt(args[1]);
        int numberOfPlayers = Integer.parseInt(args[2]);
        Game connectSix = new Game(gameSize);
        connectSix.instantiatePlayers(numberOfPlayers);
        Commands command = null;
        do {
            try {
                command = Commands.executeMatching(Terminal.readLine(), connectSix,
                        connectSix.determineCurrentPlayer(numberOfPlayers), mode);
            } catch (InputException e) {
                Terminal.printError(e.getMessage());
            }
        } while (command == null || command.isRunning());
    }
}