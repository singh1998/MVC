package parkeersimulator.controller;

import parkeersimulator.model.Model;


import javax.swing.*;

public abstract class AbstractController extends JPanel {
	protected Model model;
	
	public AbstractController(Model model) {
		this.model=model;
	}
}
