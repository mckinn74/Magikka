package com.semckinley.Magikka;

import akka.NotUsed;
import akka.stream.Attributes;
import akka.stream.javadsl.Flow;
import akka.stream.javadsl.Sink;

import java.util.concurrent.atomic.AtomicInteger;

public class CardSinks {

    public CardSinks(){}

    Sink<Card, NotUsed> path0 = Flow.of(Card.class)
            .log(Card.Type.LAND.toString())
            .withAttributes(Attributes.createLogLevels(Attributes.logLevelInfo()))
            .to(Sink.<Card>ignore());

    Sink<Card, NotUsed> path1 = Flow.of(Card.class)
            .log(Card.Type.ARTIFACT.toString())
            .withAttributes(Attributes.createLogLevels(Attributes.logLevelInfo()))
            .to(Sink.<Card>ignore());
    Sink<Card, NotUsed> path2 = Flow.of(Card.class)
            .log(Card.Type.CREATURE.toString())
            .withAttributes(Attributes.createLogLevels(Attributes.logLevelInfo()))
            .to(Sink.<Card>ignore());
    Sink<Card, NotUsed> path3 = Flow.of(Card.class)
            .log(Card.Type.ENCHANTMENT.toString())
            .withAttributes(Attributes.createLogLevels(Attributes.logLevelInfo()))
            .to(Sink.<Card>ignore());
    Sink<Card, NotUsed> path4 = Flow.of(Card.class)
            .log(Card.Type.SORCERY.toString())
            .withAttributes(Attributes.createLogLevels(Attributes.logLevelInfo()))
            .to(Sink.<Card>ignore());

    Sink<AtomicInteger, NotUsed> path5 = Flow.of(AtomicInteger.class)
            .log(Card.Type.BASIC_LAND.toString())
            .withAttributes(Attributes.createLogLevels(Attributes.logLevelInfo()))
            .to(Sink.<AtomicInteger>ignore());

    Sink<Card, NotUsed> path6 = Flow.of(Card.class)
            .log(Card.Type.INSTANT.toString())
            .withAttributes(Attributes.createLogLevels(Attributes.logLevelInfo()))
            .to(Sink.<Card>ignore());
}
