package fr.umontpellier.iut.dominion;

/**
 * Type énuméré des différents types de cartes possibles
 * <p>
 * Une carte peut éventuellement avoir plusieurs types, par exemple
 * Action/Attaque ou Action/Réaction
 */
public enum CardType {
    Treasure, Action, Victory, Curse, Reaction, Attack
}