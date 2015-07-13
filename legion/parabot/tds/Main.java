package ikov.legion.parabot.tds;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.ArrayList;

import org.parabot.environment.api.interfaces.Paintable;
import org.parabot.environment.scripts.Category;
import org.parabot.environment.scripts.Script;
import org.parabot.environment.scripts.ScriptManifest;
import org.parabot.environment.scripts.framework.Strategy;
import org.rev317.min.api.events.MessageEvent;
import org.rev317.min.api.events.listeners.MessageListener;

import ikov.legion.parabot.tds.strategies.FoodAndPrayer;
import ikov.legion.parabot.tds.strategies.KillTd;
import ikov.legion.parabot.tds.strategies.Looting;
import ikov.legion.parabot.tds.strategies.ReLogin;
import ikov.legion.parabot.tds.strategies.Tele;

@ScriptManifest(author = "Legion && IEatApplez", category = Category.COMBAT, description = "To Add description here - Tormented Demons", name = "TD Killer", servers = {
		"Ikov" }, version = 1)
public class Main extends Script implements MessageListener, Paintable {

	private final ArrayList<Strategy> strategies = new ArrayList<Strategy>();

	public boolean onExecute() {
		strategies.add(new KillTd());
		strategies.add(new Tele());
		strategies.add(new FoodAndPrayer());
		strategies.add(new Looting());
		strategies.add(new ReLogin());
		provide(strategies);
		return true;
	}

	public void messageReceived(MessageEvent i) {
		// Message Listner here
	}

	@Override
	public void paint(Graphics g) {
		// Paint here

	}

}