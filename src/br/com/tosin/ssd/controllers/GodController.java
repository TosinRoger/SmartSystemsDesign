package br.com.tosin.ssd.controllers;

import br.com.tosin.ssd.models.*;
import br.com.tosin.ssd.ui.ShowScreen;

/**
 * Created by roger on 11/03/17.
 */
public class GodController {

    private EnvironmentController environmentController;
    private AgentController agentController;
    private ShowScreen showScreen;

    public GodController() {
    }

    public void setup(EnvironmentController environmentController, AgentController agentController) {
        this.environmentController = environmentController;
        this.agentController = agentController;
        showScreen = new ShowScreen();
    }

    /**
     * Execute {@link Agent} intention
     */
    public void execute(){
        while(true) {
            Position pos = agentController.moveTo();
            environmentController.tryMoveObject(pos, agentController.getAgent());
        }
    }

    /**
     * Call screen to render world in shell
     */
    public void renderWorld() {
        showScreen.showWorldRender(environmentController.getWorld());
    }

}
