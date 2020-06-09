package com.semckinley.Magikka;

import akka.NotUsed;
import akka.actor.ActorSystem;
import akka.stream.Attributes;
import akka.stream.ClosedShape;
import akka.stream.UniformFanOutShape;
import akka.stream.javadsl.*;
//import io.magicthegathering.javasdk.resource.Card;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;


public class MagicGraphs {

    public static void akkaStartUp(List<Card> deck) {

        final ActorSystem system = ActorSystem.create("QuickStart");
        final CardFlows cardFlows = new CardFlows();
        final CardSinks cardSinks = new CardSinks();

        Source<Card, NotUsed> sourceList = Source.from(deck);
        sourceList.runForeach(card -> System.out.println(card.getType()), system);

        RunnableGraph.fromGraph(GraphDSL.create(builder -> {
            UniformFanOutShape<Card, Card> partitionByType = builder.add(Partition.create(7, card -> {
                int answer = 0;
                if (card.getType().equals(Card.Type.ARTIFACT)) {
                    answer = 1;
                }
                if (card.getType().equals(Card.Type.CREATURE)) {
                    answer = 2;
                }
                if (card.getType().equals(Card.Type.ENCHANTMENT)) {
                    answer = 3;
                }
                if (card.getType().equals(Card.Type.SORCERY)) {
                    answer = 4;
                }
                if (card.getType().equals(Card.Type.BASIC_LAND)) {
                    answer = 5;
                }
                if (card.getType().equals(Card.Type.INSTANT)) {
                    answer = 6;
                }
                if (card.getType().equals(Card.Type.LAND)) {
                    answer = 0;
                }
                return answer;
            }));
//            UniformFanOutShape<Card, AtomicInteger> broadcast  = builder.add(Broadcast.create(5));

            builder.from(builder.add(sourceList))
                    .viaFanOut(partitionByType);

            builder.from(partitionByType.out(0)).to(builder.add(cardSinks.path0));
            builder.from(partitionByType.out(1)).to(builder.add(cardSinks.path1));
            builder.from(partitionByType.out(2)).to(builder.add(cardSinks.path2));
            builder.from(partitionByType.out(3)).to(builder.add(cardSinks.path3));
            builder.from(partitionByType.out(4)).to(builder.add(cardSinks.path4));

            builder.from(partitionByType.out(5)).via(builder.add(cardFlows.basicLandFlow())).to(builder.add(cardSinks.path5));

            builder.from(partitionByType.out(6)).to(builder.add(cardSinks.path6));

            return ClosedShape.getInstance();

        })).run(system);

    }

}
