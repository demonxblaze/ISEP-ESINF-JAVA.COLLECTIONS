package Lists;

import org.example.City;
import org.example.State;

import java.util.ArrayList;

/**
 * Author @
 */
public class StatesList {
    /**
     * List of states
     */
    private ArrayList<State> states;

    /**
     * Constructor
     */
    public StatesList() {
        setStates(new ArrayList<State>());
    }

    /**
     * Getter
     * @return states
     */
    public ArrayList<State> getStates() {
        return states;
    }

    /**
     * Setter
     * @param states states
     */
    public void setStates(ArrayList<State> states) {
        this.states = states;
    }

    /**
     * Add a state to the list
     * @param state state
     */
    public void add(State state) {
        states.add(state);
    }
}
