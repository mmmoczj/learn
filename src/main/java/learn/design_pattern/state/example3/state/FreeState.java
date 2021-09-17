package learn.design_pattern.state.example3.state;

import learn.design_pattern.state.example3.context.RoomContext;

public class FreeState extends RoomState {
    public FreeState(RoomContext room) {
        this.room = room;
    }

    @Override
    public void reservation() {
        System.out.println("提供手机号,预定成功");
        room.setState(room.bookState);
    }

    @Override
    public void cancel() {
        System.out.println("房间空闲,无需操作");
    }

    @Override
    public void checkIn() {
        System.out.println("提供身份证,成功入住");
        room.setState(room.checkInState);
    }

    @Override
    public void checkOut() {
        System.out.println("房间空闲,无需操作");
    }
}
