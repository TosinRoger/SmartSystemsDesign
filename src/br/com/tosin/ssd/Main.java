package br.com.tosin.ssd;

import br.com.tosin.ssd.controllers.AgentController;
import br.com.tosin.ssd.controllers.EnvironmentController;
import br.com.tosin.ssd.controllers.GodController;
import br.com.tosin.ssd.models.Agent;
import br.com.tosin.ssd.models.environment.ObjectInWorld;
import br.com.tosin.ssd.ui.BuildStaticEnvironment;
import br.com.tosin.ssd.ui.ShowScreen;
import br.com.tosin.ssd.utils.CONST;

public class Main {

	public static void main(String[] args) {

		GodController godController = new GodController();

		// TODO Auto-generated method stub
		// perguntar tamanho matrix para iniciar o ambiente
		// perguntar posicao das paredes do ambient
		EnvironmentController environment;
		
		environment = BuildStaticEnvironment.config1(godController);

		Agent agent = new Agent(9, 0);
		environment.addObjectInWorld(agent);
		
		ShowScreen ss = new ShowScreen();
		ss.showWorldRender(environment.getWorld());

		godController.setup(environment, new AgentController(environment, godController, agent));

		godController.execute();
	}

}
