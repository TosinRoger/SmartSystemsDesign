package br.com.tosin.ssd.models;

import br.com.tosin.ssd.models.environment.ObjectInWorld;
import br.com.tosin.ssd.utils.CONST;

import java.util.Random;

public class Agent extends ObjectInWorld {

	public long id;

	public Agent(int x, int y) {
		super(x, y, CONST.CODE_MOBILE);
		this.id = (long)new Random().nextInt(1000);
	}

	public void setPosition(Position pos){
		x = pos.x;
		y = pos.y;
	}
}
