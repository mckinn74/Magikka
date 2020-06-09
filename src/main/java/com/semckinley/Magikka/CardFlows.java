package com.semckinley.Magikka;

import akka.NotUsed;
import akka.stream.Attributes;
import akka.stream.javadsl.Flow;

import java.util.concurrent.atomic.AtomicInteger;

public class CardFlows {

    public CardFlows(){}

    public Flow<Card, AtomicInteger, NotUsed> basicLandFlow() {
        AtomicInteger count = new AtomicInteger();
        return Flow.<Card>create()
                .log("Basic Land Flow")
                .withAttributes(Attributes.createLogLevels(Attributes.logLevelInfo()))
                .map(card -> {
                    if (card.getName() == "Swamp") {
                        count.getAndIncrement();
                    }
                    return count;
                });
    }
}
