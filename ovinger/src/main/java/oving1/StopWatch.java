package oving1;

public class StopWatch {

    int time;
    int stopTime;
    int lapTime;
    int ticks;
    boolean stopWatchStarted;
    boolean stopWatchStopped;
    Integer lastLapTime;

    public StopWatch() {
        this.ticks = 0;
        this.stopWatchStarted = false;
        this.stopWatchStopped = false;
    }

    public boolean isStarted() {
        return this.stopWatchStarted;
    }

    public boolean isStopped() {
        return this.stopWatchStopped;
    }

    public int getTicks() {
        return this.ticks;
    }

    public int getTime() {
        if (!this.isStarted()) {
            return -1;
        } else if (this.isStarted() && !this.isStopped()) {
            return this.time;
        }
        return this.stopTime;
    }

    public int getLapTime() {
        if (!this.stopWatchStarted) {
            return -1;
        } else if (this.isStarted() && !this.isStopped()) {
            return this.lapTime;
        }
        return 0;
    }

    public int getLastLapTime() {
        if (!this.stopWatchStarted) {
            return -1;
        }
        if (this.lastLapTime == null) {
            return -1;
        }
        return 0;
    }

    public void tick(int ticks) {
        this.ticks += ticks;
        this.time += ticks;
    }

    public void start() {
        this.time = 0;
        this.stopWatchStarted = true;
    }

    public void lap() {
        this.lastLapTime = this.getLapTime();
        this.lapTime = 0;
    }

    public void stop() {
        this.stopWatchStopped = true;
        this.stopTime = this.time;
    }







}
