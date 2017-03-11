package br.com.tosin.ssd;

import br.com.tosin.ssd.controllers.AgentController;
import br.com.tosin.ssd.controllers.EnvironmentController;
import br.com.tosin.ssd.controllers.GodController;
import br.com.tosin.ssd.models.Agent;
import br.com.tosin.ssd.models.environment.ObjectInWorld;
import br.com.tosin.ssd.ui.ShowScreen;
import br.com.tosin.ssd.utils.CONST;

public class Main {

	public static void main(String[] args) {

		GodController godController = new GodController();

		// TODO Auto-generated method stub
		// perguntar tamanho matrix para iniciar o ambiente
		// perguntar posicao das paredes do ambient
		EnvironmentController environment;
		
		environment = config1(godController);

		Agent agent = new Agent(9, 0);
		environment.addObjectInWorld(agent);
		
		ShowScreen ss = new ShowScreen();
		ss.showWorldRender(environment.getWorld());

		godController.setup(environment, new AgentController(environment, godController, agent));

		godController.execute();
	}
	
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
		
		return environment;
	}

}
