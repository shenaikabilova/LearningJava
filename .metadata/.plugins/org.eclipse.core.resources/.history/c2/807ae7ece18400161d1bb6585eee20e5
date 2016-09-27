package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.Group;
import view.GroupView;
import view.MainWindow;

public class GroupController implements ActionListener {
	private GroupView view;
	
	public GroupController(GroupView view) {
		this.view = view;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		view.buttonAddActionLitener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Group(view.getGroupName());
			}
		});
		
		view.buttonExitActionLisner(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new MainWindowController(new MainWindow());
			}
		});
	}
}