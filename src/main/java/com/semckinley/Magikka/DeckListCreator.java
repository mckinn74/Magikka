package com.semckinley.Magikka;

//import io.magicthegathering.javasdk.api.CardAPI;
//import io.magicthegathering.javasdk.resource.Card;

import java.util.ArrayList;
import java.util.List;

public class DeckListCreator {

    private List<Card> blackDeck = new ArrayList<>();
    private List<Card> redAndGreenDeck = new ArrayList<>();
    private List<Card> theDeck = new ArrayList<>();


    public List<Card> getTheDeck(){
        Card carefulStudy = new Card("Careful Study",
                Card.Type.SORCERY, 1, "U", 0, 0 );
        Card forest = new Card("Forest",
                Card.Type.BASIC_LAND, 0, "0", 0, 0);
        Card birdsOfParadise = new Card("Birds of Paradise",
                Card.Type.CREATURE, 1, "G", 0, 1);
        Card roarOfTheWurm = new Card("Roar of the Wurm",
                Card.Type.SORCERY, 7, "6G", 0,0);
        Card callOfTheHerd = new Card("Call of the Herd",
                Card.Type.SORCERY, 3, "2G", 0, 0);
        Card dragonTyrant = new Card("Dragon Tyrant",
                Card.Type.CREATURE, 10, "8RR", 6, 6);
        Card bladeWingTheRisen = new Card("Bladewing the Risen",
                Card.Type.CREATURE, 7, "3BBRR", 4, 4);
        Card bladeWingsThrall = new Card("Bladewing's Thrall",
                Card.Type.CREATURE, 4, "2BB", 3, 3);
        Card buriedAlive = new Card("Buried Alive",
                Card.Type.SORCERY, 3, "2B", 0, 0);
        Card quietSpeculation = new Card("Quiet Speculation",
                Card.Type.SORCERY, 2, "1U", 0,0);
        Card ritesOfSpring = new Card("Rites of Spring",
                Card.Type.SORCERY, 2, "1G", 0,0);
        Card wonder = new Card("Wonder",
                Card.Type.CREATURE, 4, "3U", 2, 2);
        Card swamp = new Card("Swamp",
                Card.Type.BASIC_LAND, 0, "0", 0, 0);
        Card brawn = new Card("Brawn",
                Card.Type.CREATURE, 4, "3G", 3, 3);
        Card anger = new Card("Anger",
                Card.Type.CREATURE, 4, "3R", 2, 2);
        Card zombify = new Card("Zombify",
                Card.Type.SORCERY, 4, "3B", 0, 0);
        Card island = new Card("Island",
                Card.Type.BASIC_LAND, 0, "0", 0,0);
        Card mountain = new Card("Mountain",
                Card.Type.BASIC_LAND, 0, "0", 0, 0);
        for(int i = 0; i<4; i++){
            theDeck.add(carefulStudy);
            theDeck.add(zombify);
            theDeck.add(ritesOfSpring);
            theDeck.add(quietSpeculation);
            theDeck.add(buriedAlive);
            theDeck.add(callOfTheHerd);
            theDeck.add(roarOfTheWurm);
            theDeck.add(birdsOfParadise);
        }
        for(int j = 0; j < 2; j++){
            theDeck.add(swamp);
            theDeck.add(mountain);
            theDeck.add(anger);
            theDeck.add(bladeWingsThrall);
        }
        for(int i = 0; i< 6 ; i++){
            theDeck.add(island);
        }
        for(int i = 0; i<10; i++){
            theDeck.add(forest);
        }
        theDeck.add(wonder);
        theDeck.add(brawn);
        theDeck.add(bladeWingTheRisen);
        theDeck.add(dragonTyrant);
        return this.theDeck;
    }
}
