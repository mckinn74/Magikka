package com.semckinley.Magikka;


public class Card {
    private final String name;
    private final Type type;
    private final int cmc;
    private final String manaCost;
    private final int power;
    private final int toughness;

    public String getName() {
        return name;
    }

    public Type getType() {
        return type;
    }

    public int getCmc() {
        return cmc;
    }

    public String getManaCost() {
        return manaCost;
    }

    public int getPower() {
        return power;
    }

    public int getToughness() {
        return toughness;
    }

    enum Type{
        SORCERY, CREATURE, BASIC_LAND, LAND, INSTANT, ENCHANTMENT, ARTIFACT
    }

    public Card(String name, Type type, int cmc, String manaCost, int power, int toughness) {
        this.name = name;
        this.type = type;
        this.cmc = cmc;
        this.manaCost = manaCost;
        this.power = power;
        this.toughness = toughness;
    }
}
