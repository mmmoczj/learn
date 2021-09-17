package learn.design_pattern.state.example3.state;

import learn.design_pattern.state.example3.context.RoomContext;

public class CheckedInState extends RoomState {
    public CheckedInState(RoomContext room) {
        this.room = room;
    }

    @Override
    public void reservation() {
        System.out.println("房间已经入住,无需操作");
    }

    @Override
    public void cancel() {
        System.out.println("房间已经入住,无需操作");
    }

    @Override
    public void checkIn() {
        System.out.println("房间已经入住,无需操作");
    }

    @Override
    public void checkOut() {
        System.out.println("成功退房");
        room.setState(room.freeState);
    }
}
