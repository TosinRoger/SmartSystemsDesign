package br.com.tosin.ssd.controllers;

import br.com.tosin.ssd.PhysicsInterface;
import br.com.tosin.ssd.models.Position;
import br.com.tosin.ssd.models.environment.ObjectInWorld;
import br.com.tosin.ssd.utils.CONST;

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

    @Override
    public boolean nextMoveIsTarget(ObjectInWorld[][] world, Position oldPos, Position newPos) {
        if (newPos.x >= 0 && newPos.x < world.length && newPos.y >= 0 && newPos.y < world[0].length) {
            ObjectInWorld objectInWorld = world[newPos.x][newPos.y];
            if (objectInWorld == null) {
                return false;
            }
            else {
                if (objectInWorld.code == CONST.CODE_TARGET)
                    return true;
            }
        }
        return false;
    }
}
