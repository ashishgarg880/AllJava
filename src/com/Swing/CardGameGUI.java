package com.Swing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Card {
    int value;

    Card(int value) {
        this.value = value;
    }
}

class Player {
    List<Card> hand;
    int totalPoints;

    Player() {
        this.hand = new ArrayList<>();
        this.totalPoints = 0;
    }

    void drawCard(Card card) {
        hand.add(card);
        totalPoints += card.value;
    }

    void skipTurn() {
        // Implement skipping turn logic if needed
    }
}

public class CardGameGUI extends JFrame {
    private final Player player;
    private final Player computer;
    private final List<Card> deck;
    private final JLabel playerHandLabel;
    private final JLabel computerHandLabel;
    private final JLabel playerPointsLabel;
    private final JLabel computerPointsLabel;

    public CardGameGUI() {
        super("Card Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);

        // Initialize players and deck
        player = new Player();
        computer = new Player();
        deck = initializeDeck();

        // Shuffle the deck
        Collections.shuffle(deck);

        // Create GUI components
        playerHandLabel = new JLabel("Player Hand: ");
        computerHandLabel = new JLabel("Computer Hand: ");
        playerPointsLabel = new JLabel("Player Points: ");
        computerPointsLabel = new JLabel("Computer Points: ");
        JButton drawButton = new JButton("Draw Card");
        JButton skipButton = new JButton("Skip Turn");

        // Add action listeners to buttons
        drawButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                drawCard();
            }
        });

        skipButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                skipTurn();
            }
        });

        // Create layout
        setLayout(new GridLayout(3, 2));
        add(playerHandLabel);
        add(computerHandLabel);
        add(playerPointsLabel);
        add(computerPointsLabel);
        add(drawButton);
        add(skipButton);

        // Start the game
//        startRound();

        // Update GUI with initial state
//        updateGameState();
    }

    private List<Card> initializeDeck() {
        List<Card> deck = new ArrayList<>();
        for (int i = 1; i <= 13; i++) {
            deck.add(new Card(i));
        }
        return deck;
    }

    private void startRound() {
        // Deal initial cards to players
        for (int i = 0; i < 5; i++) {
            player.drawCard(deck.remove(0));
            computer.drawCard(deck.remove(0));
        }
    }

    private void updateGameState() {
        // Update GUI with current game state
        playerHandLabel.setText("Player Hand: " + player.hand.stream().toArray());
        computerHandLabel.setText("Computer Hand: " + computer.hand.stream().toArray());
        playerPointsLabel.setText("Player Points: " + player.totalPoints);
        computerPointsLabel.setText("Computer Points: " + computer.totalPoints);

        // Check for a winner or bust condition and display a message if needed
        if (player.totalPoints > computer.totalPoints) {
            JOptionPane.showMessageDialog(this, "Player Busts! Player Wins!");
            resetGame();
        } else {
            JOptionPane.showMessageDialog(this, "Player Busts! Computer Wins!");
            resetGame();
        }
        if (computer.totalPoints > 33) {
            JOptionPane.showMessageDialog(this, "Computer Busts! Player Wins!");
            resetGame();
        } else if (player.hand.size() == 5 && computer.hand.size() == 5) {
            determineWinner();
        }
    }

    private void drawCard() {
        // Draw a card for the player
        if (player.hand.size() < 5) {
            player.drawCard(deck.remove(0));
            // Computer's turn (you can add computer logic here)
            // For simplicity, the computer will draw a card in every turn
            computer.drawCard(deck.remove(0));
            // Update the GUI
            updateGameState();
        } else {
            JOptionPane.showMessageDialog(this, "You've reached the maximum number of cards!");
        }
    }

    private void skipTurn() {
        // Implement skipping turn logic if needed
        // For simplicity, skipping a turn will not draw a card
        // Computer's turn (you can add computer logic here)
        // For simplicity, the computer will draw a card in every turn
        computer.drawCard(deck.remove(0));
        // Update the GUI
        updateGameState();
    }

    private void determineWinner() {
        // Determine the winner based on total points
        if (Math.abs(player.totalPoints - 33) < Math.abs(computer.totalPoints - 33)) {
            JOptionPane.showMessageDialog(this, "Player Wins!");
        } else {
            JOptionPane.showMessageDialog(this, "Computer Wins!");
        }
        resetGame();
    }

    private void resetGame() {
        // Reset game state for a new round
        player.hand.clear();
        player.totalPoints = 0;
        computer.hand.clear();
        computer.totalPoints = 0;

        // Reset the deck and shuffle
        deck.clear();
        deck.addAll(initializeDeck());
        Collections.shuffle(deck);

        // Start a new round
//        startRound();
//
//        // Update the GUI
//        updateGameState();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new CardGameGUI().setVisible(true));
    }
}
