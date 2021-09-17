package learn.design_pattern.state.example3.state;

import learn.design_pattern.state.example3.context.RoomContext;

public class BookedState extends RoomState {
    public BookedState(RoomContext room) {
        this.room = room;
    }

    @Override
    public void reservation() {
        System.out.println("房间已被预定,不接受其它预定,无需操作");
    }

    @Override
    public void cancel() {
        System.out.println("提供手机号,退订成功");
        room.setState(room.freeState);
    }

    @Override
    public void checkIn() {
        System.out.println("提供手机号和身份证,成功入住");
        room.setState(room.checkInState);
    }

    @Override
    public void checkOut() {
        System.out.println("房间尚未入住,无需操作");
    }
}
