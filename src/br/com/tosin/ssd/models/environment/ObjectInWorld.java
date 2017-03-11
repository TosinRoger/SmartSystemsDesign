package br.com.tosin.ssd.models.environment;

import br.com.tosin.ssd.models.Position;

public class ObjectInWorld extends Position {

	public int code = 0;

	public ObjectInWorld(int x, int y, int code) {
		super(x, y);
		// TODO Auto-generated constructor stub
		this.code = code;
		
	}

	public Position getPosition() {
		Position pos = new Position(x,y);
		return pos;
	}

}
