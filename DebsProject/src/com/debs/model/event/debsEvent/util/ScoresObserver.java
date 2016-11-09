package com.debs.model.event.debsEvent.util;

import java.util.Observable;
import java.util.Observer;

import com.debs.model.event.debsEvent.ScoresModel;
import com.debs.view.ConsoleView;

public class ScoresObserver implements Observer {

	private ScoresModel model = null;
	ConsoleView consoleView = new ConsoleView();

	public ScoresObserver(ScoresModel observable) {
		model = observable;
	}

	@Override
	public void update(Observable o, Object arg) {
		if( model == o){
			consoleView.displayTop3Posts(model.getFirst3Posts());
		}
	}

}
