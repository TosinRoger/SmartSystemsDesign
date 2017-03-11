package br.com.tosin.ssd.controllers;

import br.com.tosin.ssd.PhysicsInterface;
import br.com.tosin.ssd.models.Position;
import br.com.tosin.ssd.models.environment.ObjectInWorld;

/**
 * Created by roger on 11/03/17.
 */
public class Physics implements PhysicsInterface {

    @Override
    public boolean moveTo(ObjectInWorld[][] world, Position oldPos, Position newPos) {
        if (newPos.x >= 0 && newPos.x < world.length && newPos.y >= 0 && newPos.y < world[0].length) {
            if (world[newPos.x][newPos.y] == null) {
                return true;
            }
            else {
                return false;
            }
        }
        else {
            return false;
        }
    }
}
