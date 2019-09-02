package butko.marko.model;

public enum City {
    KIEV, ODESSA, LONDON, MOSCOW;

    @Override
    public String toString() {
        return this.name().substring(0, 1).toUpperCase()
               + this.name().substring(1).toLowerCase();
    }
}
