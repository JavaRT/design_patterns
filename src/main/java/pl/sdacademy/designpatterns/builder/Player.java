package pl.sdacademy.designpatterns.builder;

import java.util.List;

public class Player {
    private Integer health;
    private Integer mana;
    private Long level;
    private String nick;
    private List<String> friends;

    protected Player(Integer health, Integer mana, Long level, String nick, List<String> friends) {
        this.health = health;
        this.mana = mana;
        this.level = level;
        this.nick = nick;
        this.friends = friends;
    }

    public Integer getHealth() {
        return health;
    }

    public void setHealth(Integer health) {
        this.health = health;
    }

    public Integer getMana() {
        return mana;
    }

    public void setMana(Integer mana) {
        this.mana = mana;
    }

    public Long getLevel() {
        return level;
    }

    public void setLevel(Long level) {
        this.level = level;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public List<String> getFriends() {
        return friends;
    }

    public void setFriends(List<String> friends) {
        this.friends = friends;
    }

    public static class Builder {

        private Integer health;
        private Integer mana;
        private Long level;
        private String nick;
        private List<String> friends;

        public Builder withHealth(final Integer health) {
            this.health = health;
            return this;
        }

        public Builder withMana(final Integer mana) {
            this.mana = mana;
            return this;
        }

        public Builder withLevel(final Long level) {
            this.level = level;
            return this;
        }

        public Builder withNick(final String nick) {
            this.nick = nick;
            return this;
        }

        public Builder withFriends(final List<String> friends) {
            this.friends = friends;
            return this;
        }

        public Player build() {
            //klasa w klasie
            return new Player(this.health, this.mana, this.level, this.nick, this.friends);
        }

    }

}

