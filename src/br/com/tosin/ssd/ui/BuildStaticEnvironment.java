package br.com.tosin.ssd.ui;

import br.com.tosin.ssd.controllers.*;
import br.com.tosin.ssd.models.environment.ObjectInWorld;
import br.com.tosin.ssd.utils.CONST;
import br.com.tosin.ssd.utils.CONSTANTS_DIRECTIONS;

import java.util.*;

/**
 * Created by roger on 14/03/17.
 */
public class BuildStaticEnvironment {

    public static EnvironmentController config1(GodController god) {
        EnvironmentController environment = new EnvironmentController(god, 10, 10);
        // add wall

        environment.addObjectInWorld(new ObjectInWorld(3, 3, CONST.CODE_WALL));
        environment.addObjectInWorld(new ObjectInWorld(3, 4, CONST.CODE_WALL));
        environment.addObjectInWorld(new ObjectInWorld(4, 3, CONST.CODE_WALL));
        environment.addObjectInWorld(new ObjectInWorld(7, 2, CONST.CODE_WALL));
        environment.addObjectInWorld(new ObjectInWorld(7, 3, CONST.CODE_WALL));
        environment.addObjectInWorld(new ObjectInWorld(6, 7, CONST.CODE_WALL));
        environment.addObjectInWorld(new ObjectInWorld(5, 7, CONST.CODE_WALL));
        environment.addObjectInWorld(new ObjectInWorld(4, 8, CONST.CODE_WALL));

        // add target
        environment.addObjectInWorld(new ObjectInWorld(2,8, CONST.CODE_TARGET));

        return environment;
    }

    public static List<String> makePlain1() {
        List<String> plans = new ArrayList<>();

        plans.add(CONSTANTS_DIRECTIONS.NORTH);
        plans.add(CONSTANTS_DIRECTIONS.NORTH);
        plans.add(CONSTANTS_DIRECTIONS.NORTH);
        plans.add(CONSTANTS_DIRECTIONS.NORTH);
        plans.add(CONSTANTS_DIRECTIONS.NORTH);
        plans.add(CONSTANTS_DIRECTIONS.NORTH);
        plans.add(CONSTANTS_DIRECTIONS.NORTH);
        plans.add(CONSTANTS_DIRECTIONS.EAST);
        plans.add(CONSTANTS_DIRECTIONS.EAST);
        plans.add(CONSTANTS_DIRECTIONS.EAST);
        plans.add(CONSTANTS_DIRECTIONS.EAST);
        plans.add(CONSTANTS_DIRECTIONS.EAST);
        plans.add(CONSTANTS_DIRECTIONS.EAST);
        plans.add(CONSTANTS_DIRECTIONS.EAST);
        plans.add(CONSTANTS_DIRECTIONS.EAST);

        return plans;
    }
}
