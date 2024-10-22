package com.alex_maven.model;

public class Korneplod implements Comparable<Korneplod> {
    private final Type type;
    private final int weight;
    private final String color;

    public enum Type {

    }

    private Korneplod(KorneplodBuilder korneplodBuilder) {
        this.type = korneplodBuilder.type;
        this.weight = korneplodBuilder.weight;
        this.color = korneplodBuilder.color;
    }

    public Type getType() {
        return type;
    }

    public int getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    @Override
    public int compareTo(Korneplod o) {
        return 0;
    }

    @Override
    public String toString() {
        return String.format("Тип корнеплода: %s; Вес: %d; Цвет: %s",
                type, weight, color);
    }

    public static class KorneplodBuilder {
        private Type type;
        private int weight;
        private String color;

        public KorneplodBuilder() {
        }

        public KorneplodBuilder setType(Type type) {
            this.type = type;
            return this;
        }

        public KorneplodBuilder setWeight(int weight) {
            this.weight = weight;
            return this;
        }

        public KorneplodBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        public Korneplod build() {
            return new Korneplod(this);
        }
    }
}
