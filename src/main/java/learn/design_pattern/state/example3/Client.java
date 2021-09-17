package learn.design_pattern.state.example3;

import learn.design_pattern.state.example3.context.RoomContext;

public class Client {
    public static void main(String[] args) {
        RoomContext room = new RoomContext();
        room.reservation();
        room.checkIn();
        room.checkIn();
        room.cancel();
        room.checkOut();
    }
}
