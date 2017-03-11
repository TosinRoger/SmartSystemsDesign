package br.com.tosin.ssd;

import br.com.tosin.ssd.models.*;
import br.com.tosin.ssd.models.environment.ObjectInWorld;

/**
 * Created by roger on 11/03/17.
 */
public interface PhysicsInterface {
    boolean moveTo(ObjectInWorld[][] world, Position oldPos, Position newPos);
}
