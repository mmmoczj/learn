package learn.design_pattern.state.example3.context;

import learn.design_pattern.state.example3.state.BookedState;
import learn.design_pattern.state.example3.state.CheckedInState;
import learn.design_pattern.state.example3.state.FreeState;
import learn.design_pattern.state.example3.state.RoomState;

public class RoomContext {
    private RoomState state;

    public RoomState freeState = new FreeState(this);
    public RoomState bookState = new BookedState(this);
    public RoomState checkInState = new CheckedInState(this);

    public RoomContext() {
        this.state = freeState;
    }

    public void setState(RoomState state) {
        this.state = state;
    }

    public void reservation() {
        state.reservation();
    }

    public void cancel() {
        state.cancel();
    }

    public void checkIn(){
        state.checkIn();
    }

    public void checkOut(){
        state.checkOut();
    }
}
