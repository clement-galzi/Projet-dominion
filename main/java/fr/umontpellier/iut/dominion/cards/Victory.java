package fr.umontpellier.iut.dominion.cards;

import fr.umontpellier.iut.dominion.CardType;

import java.util.ArrayList;

public abstract class Victory extends Card {
    private ArrayList<CardType> type = new ArrayList<>();

    /**
     * Constructeur simple
     *
     * @param name le nom de la carte
     * @param cost le coût de la carte
     */
    public Victory(String name, int cost) {
        super(name, cost);
        this.type.add(CardType.Victory);
    }

    /**
     * Modification de la méthode getTypes
     */

    @Override
    public ArrayList<CardType> getTypes() {
        return this.type;
    }
}
