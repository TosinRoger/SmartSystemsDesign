package br.com.tosin.ssd.controllers;

import br.com.tosin.ssd.models.*;
import br.com.tosin.ssd.ui.BuildStaticEnvironment;
import br.com.tosin.ssd.ui.ShowScreen;

/**
 * Created by roger on 11/03/17.
 */
public class GodController {

    private EnvironmentController environmentController;
    private AgentController agentController;
    private ShowScreen showScreen;

    private boolean restart = false;

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
            if (restart) {
                environmentController = BuildStaticEnvironment.config1(this);
                Agent agent = new Agent(9, 0);
                environmentController.addObjectInWorld(agent);

                agentController = new AgentController(environmentController, this, agent);

                ShowScreen ss = new ShowScreen();
                ss.showWorldRender(environmentController.getWorld());

                restart = !restart;
            }
            else {
                Position pos = agentController.moveTo();
                environmentController.tryMoveObject(pos, agentController.getAgent());
            }
        }
    }

    /**
     * Call screen to render world in shell
     */
    public void renderWorld() {
        showScreen.showWorldRender(environmentController.getWorld());
    }

    public void restart() {

        ShowScreen ss = new ShowScreen();
        ss.showWon();

        restart = true;
    }
}
