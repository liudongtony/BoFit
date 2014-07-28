package com.iteye.liudongtony.bofit;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ExercisePlanner extends Frame {
	static ExercisePlanner frame = new ExercisePlanner();
	
	TextField inputName = new TextField("", 17);
	TextField inputCity = new TextField("", 17);
	TextField inputEmail = new TextField("", 17);
	
	Checkbox workout = new Checkbox("Workout");
    Checkbox fitTrain = new Checkbox("FitTraining");
    Checkbox diet = new Checkbox("Diet");
	
    final Choice planChoice = new Choice();
    
	Button bText = new Button("Membership Doc (Txt)");
	Button bHTML = new Button("Membership Doc (HTML)");
	Button bPrint = new Button("Print Plan Detail");
	
	TextArea printArea = new TextArea();

	private void launchFrame() {
		setSize(800, 600);
		setResizable(false);
		setTitle("ExercisePlanner");
		setLocation(400, 200);
		frame.addWindowListener(new WindowAdapter() {	
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);	
			}
		});
		setBackground(new Color(255, 255, 255));
		setVisible(true);	
		frame.setLayout(null);
		
		/*
		 * Step1
		 */
	    planChoice.add("AEP: Athlete Exercise Plan");
	    planChoice.add("SEP: Senior Exercise Plan");
	    planChoice.add("REP: Regular Exercise Plan");
	    frame.add(planChoice);
	    planChoice.setBounds(415, 74, 180, 25);
		
	    /*
	     * step2
	     */
		frame.add(workout);
		workout.setBounds(200, 146, 80, 25);
		frame.add(fitTrain);
		fitTrain.setBounds(360, 146, 80, 25);
		frame.add(diet);
		diet.setBounds(520, 146, 80, 25);
		
		/*
		 * Step3
		 */
		frame.add(inputName);
		inputName.setBounds(200, 208, 180, 20);
		frame.add(inputCity);
		inputCity.setBounds(200, 233, 180, 20);
		frame.add(inputEmail);
		inputEmail.setBounds(200, 258, 180, 20);
		
		/*
		 * Step4
		 */
		frame.add(bText);
		bText.setBounds(230,300,160,25);
		frame.add(bHTML);
		bHTML.setBounds(420,300,160,25);
		frame.add(bPrint);
		bPrint.setBounds(610,300,120,25);

		frame.add(printArea);
		printArea.setBounds(20, 335, 760, 255);
		
	}
	
	public void paint(Graphics g) {
		g.setColor(Color.BLACK);
		g.setFont(new Font("Headline", Font.BOLD + Font.ITALIC, 17));
		g.drawString("Welcome to BoFitinc!", 20, 50);
		g.setFont(new Font("Content", Font.BOLD, 17));
		g.drawString("Step 1: Please select a plan (AEP, SEP or REP)", 30, 91);
		g.drawString("Step 2: Please select services (at least TWO services)", 30, 134);
		g.drawString("Step 3: Please input your personal info", 30, 195);
		g.drawString("Name", 100, 222);
		g.drawString("City", 100, 247);
		g.drawString("Email", 100, 272);
		
		g.setColor(Color.BLUE);
		g.setFont(new Font("Terms", Font.BOLD + Font.ITALIC, 17));
		g.drawString("Membership & terms:", 30, 318);
		
		g.setColor(Color.LIGHT_GRAY);
		g.drawLine(20, 60, 780, 60);
		g.drawLine(20, 290, 780, 290);		
		
	}

	public static void main(String[] args) {
		frame.launchFrame();
	}

}
