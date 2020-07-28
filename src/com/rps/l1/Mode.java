package com.rps.l1;

public enum Mode {
    ROCK ("Rock"),
    PAPER ("Paper"),
    SCISSORS ("Scissors");

    private final String title;

    Mode(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public int compare(Mode modeBot) {
        Mode mode = this;
        if(mode.equals(modeBot))
            return 0;
        if(mode == Mode.ROCK) {
            if(modeBot == Mode.SCISSORS)
                return 1;
            else if(modeBot == Mode.PAPER)
                return 2;
        }
        else if(mode == Mode.SCISSORS) {
            if(modeBot == Mode.PAPER)
                return 1;
            else if(modeBot == Mode.ROCK)
                return 2;
        }
        else {
            if(modeBot == Mode.ROCK)
                return 1;
            else if(modeBot == Mode.SCISSORS)
                return 2;
        }
        return 0;
    }
}
