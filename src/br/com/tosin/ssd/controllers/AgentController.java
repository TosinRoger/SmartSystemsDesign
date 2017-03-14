package br.com.tosin.ssd.controllers;

import br.com.tosin.ssd.models.*;
import br.com.tosin.ssd.ui.InteractClientUser;
import br.com.tosin.ssd.utils.CONSTANTS_DIRECTIONS;

public class AgentController extends CONSTANTS_DIRECTIONS {

    private EnvironmentController environmentCont;
    private GodController god;
    private Agent agent;

    public AgentController(EnvironmentController environmentCont, GodController god, Agent agent) {
        this.environmentCont = environmentCont;
        this.god = god;
        this.agent = agent;
    }

    public Position moveTo() {

        readPositionInWorld();

        // GET DIRECTION BY USER IN CONSOLE
        String direction = InteractClientUser.getDirection();

        Position newPostion = null;

        if (direction.equals(NORTH)) {
            newPostion = new Position(agent.x - 1, agent.y);
        } else if (direction.equals(SOUTH)) {
            newPostion = new Position(agent.x + 1, agent.y);
        } else if (direction.equals(WEST)) {
            newPostion = new Position(agent.x, agent.y - 1);
        } else if (direction.equals(EAST)) {
            newPostion = new Position(agent.x, agent.y + 1);
        } else if (direction.equals(NORTHWEST)) {
            newPostion = new Position(agent.x - 1, agent.y - 1);
        } else if (direction.equals(NORTHEAST)) {
            newPostion = new Position(agent.x - 1, agent.y + 1);
        } else if (direction.equals(SOUTH_WEST)) {
            newPostion = new Position(agent.x + 1, agent.y + -1);
        } else if (direction.equals(SOUTHEAST)) {
            newPostion = new Position(agent.x + 1, agent.y + 1);
        }

        return newPostion;
    }

    public Position readPositionInWorld() {
        god.renderWorld();
        Position position = environmentCont.getPosition(agent);
        if (position != null)
            agent.setPosition(position);

        return position;
    }

    public Agent getAgent() {
        return agent;
    }
}
