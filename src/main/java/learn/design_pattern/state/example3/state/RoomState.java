package learn.design_pattern.state.example3.state;

import learn.design_pattern.state.example3.context.RoomContext;

public abstract class RoomState {
    protected RoomContext room;

    public abstract void reservation();     // 预定

    public abstract void cancel();          // 退订

    public abstract void checkIn();         // 入住

    public abstract void checkOut();        // 退房
}

