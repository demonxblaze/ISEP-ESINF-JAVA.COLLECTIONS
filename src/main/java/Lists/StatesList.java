package Lists;

import org.example.City;
import org.example.State;

import java.util.ArrayList;

public class StatesList {

    private ArrayList<State> states;

    public StatesList() {
        setStates(new ArrayList<State>());
    }

    public ArrayList<State> getStates() {
        return states;
    }

    public void setStates(ArrayList<State> states) {
        this.states = states;
    }

    public void add(State state) {
        states.add(state);
    }
}
