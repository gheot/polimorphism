public enum CapacityOfPeople {
    EXTRA_SMALL(0, 10),               // до 10 мест
    SMALL(10, 25),                     // до 25
    MEDIUM(40,50),                    //40–50
    LARGE(60,80),                     //60–80
    EXTRA_LARGE(100,120);                //100–120 мест

    private final int from;
    private final int to;

    CapacityOfPeople(int from, int to) {
        this.from = from;
        this.to = to;
    }

    public int getFrom() {
        return from;
    }

    public int getTo() {
        return to;
    }


}
