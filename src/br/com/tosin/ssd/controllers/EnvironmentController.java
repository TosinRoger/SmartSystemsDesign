package br.com.tosin.ssd.controllers;

import br.com.tosin.ssd.models.*;
import br.com.tosin.ssd.models.environment.ObjectInWorld;

public class EnvironmentController extends Physics {

	private Environment environment;
	private GodController god;
	
	public EnvironmentController(GodController god, int width, int height) {
		this.god = god;
		configWorld(width, height);
	}
	
	private void configWorld(int width, int height) {
		if (width < 5 || width > 100)
			width = 10;
		if (height < 5 || width > 100)
			height = 5;
		
		environment = new Environment(width, height);
	}
	
	public void addObjectInWorld(ObjectInWorld obstacle) {
		if (obstacle.x < environment.width && obstacle.y < environment.height) {
			boolean positionIsAvailable = true;
			for (ObjectInWorld item : environment.getObjectsInWorld()) {
				if (obstacle.x == item.x && obstacle.y == item.y)
					positionIsAvailable = false;
				break;
			}
			if (positionIsAvailable) {
				environment.addObstacle(obstacle);
			}
		}
	}
	
	public ObjectInWorld[][] getWorld() {
		ObjectInWorld[][] world = environment.world;
		return world;
	}

	public Position getPosition(Agent agent) {
		return environment.getAgent(agent);
	}

	public void tryMoveObject(Position newPos, Agent agent) {
		if (moveTo(environment.world, agent.getPosition(), newPos)) {
			updateEnvironment(newPos, agent);
		}
		else if (nextMoveIsTarget(environment.world, agent.getPosition(), newPos)) {
			god.restart();
		}
	}

	private void updateEnvironment(Position newPos, Agent agent) {
		Agent a = (Agent) environment.world[agent.x][agent.y];
		if (a != null && a.id == agent.id) {
			environment.world[agent.x][agent.y] = null;
			a.setPosition(newPos);
			environment.world[newPos.x][newPos.y] = a;
		}
	}
}
