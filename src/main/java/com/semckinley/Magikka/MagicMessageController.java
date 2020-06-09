package com.semckinley.Magikka;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

//import io.magicthegathering.javasdk.resource.Card;

//@AllArgsConstructor
@RestController
public class MagicMessageController {
    private MagicGraphs magicGraphs = new MagicGraphs();
    private DeckListCreator creator = new DeckListCreator();


    @RequestMapping("/getTheDeck")
    public String getACard() throws InterruptedException {
        List<Card> deckList = new ArrayList<>();
        System.out.println("Getting Deck List for THE DECK");

//        Card badMoon = CardAPI.getCard(49);
//        Card blackKnight = CardAPI.getCard(50);
//        Card terror = CardAPI.getCard(86);
//        Card darkRitual = CardAPI.getCard(54);
//        Card hypnoticSpecter = CardAPI.getCard(68);
//        Card royalAssassin = CardAPI.getCard(79);
//        Card nightmare = CardAPI.getCard(74);
//        Card drainLife = CardAPI.getCard(61);
//        Card animateDead = CardAPI.getCard(48);
//        Card swamp = CardAPI.getCard(277);

//        for(int i = 0; i<4; i++) {
//            deckList.add(badMoon);
//            deckList.add(blackKnight);
//            deckList.add(terror);
//            deckList.add(darkRitual);
//            deckList.add(hypnoticSpecter);
//            deckList.add(royalAssassin);
//            deckList.add(nightmare);
//            deckList.add(drainLife);
//            deckList.add(animateDead);
//        }
//        for(int j = 0; j < 24; j++){
//            deckList.add(swamp);
//        }
        deckList = creator.getTheDeck();

        System.out.println("Black Deck Retrieved!");

        magicGraphs.akkaStartUp(deckList);

        return deckList.toString();
    }
}
