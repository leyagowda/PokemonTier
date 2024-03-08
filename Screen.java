import java.util.ArrayList;

import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JTextArea;

import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Screen extends JPanel implements ActionListener {
	private JTextArea textArea;

	private JTextField nameInput;
	private JTextField artistInput;
	private JTextField albumInput;

	private JButton restartButton;

	private ArrayList<String> list = new ArrayList<String>();

	private ArrayList<String> listTier1 = new ArrayList<String>();
	private ArrayList<String> listTier2 = new ArrayList<String>();
	private ArrayList<String> listTier3 = new ArrayList<String>();
	private ArrayList<String> listTier4 = new ArrayList<String>();
	private ArrayList<String> listTier5 = new ArrayList<String>();

	//buttons
	private ArrayList<JButton> buttonList1 = new ArrayList<JButton>();
	private ArrayList<JButton> buttonList2 = new ArrayList<JButton>();
	private ArrayList<JButton> buttonList3 = new ArrayList<JButton>();
	private ArrayList<JButton> buttonList4 = new ArrayList<JButton>();
	private ArrayList<JButton> buttonList5 = new ArrayList<JButton>();


	private String text;
	private int x;
	private	int gameSize;
	private int k = 0;
	private int l = 0;
	private int m = 0;
	private int n = 0;
	private int o = 0;
	private Confetti[] confetti;
    
    private Color pigPink = new Color(255,182,193);

	public Screen() {
		this.setLayout(null);
    
		
		String arr[] = new String[] { "Bulbasaur", "Charmander", "Squirtle", "Charizard", "Pikachu", "Vulpix", "Jigglypuff", "Dugtrio", "Meowth", 
		"Psyduck", "Gengar", "Onix", "Gyarados", "Eevee", "Vaporeon", "Jolteon", "Flareon", "Dragonite", "Mewtwo", "Mew", "Espeon", "Umbreon", "Scizor", 
		"Raikou", "Entei", "Suicune", "Torchic", "Gardevoir", "Kyogre", "Groudon", "Rayquaza", "Deoxys", "Lucario", "Lucario", "Glaceon", "Dialga", "Palkia",
		"Cresselia", "Tepig", "Lillipup", "Reshiram", "Zekrom", "Meloetta", "Fennekin", "Xerneas", "Yveltal", "Zygarde", "Diancie", "Hoopa", "Lunala", "Solgaleo",
		"Garchomp", "Mudkip", "Blastoise", "Torterra", "Snorlax", "Infernape", "Mudkip", "Ninetales", "Ampharos", "Typhlosion", "Absol", "Blaziken", "Arcanine", "Greninja",
		"Zapdos", "Jynx", "Raichu", "Chansey", "Pidgey", "Rapidash", "Cubone", "Lapros", "Horsea", "Taurus", "Diglett", "Rattata", "Geodude", "Oddish" }; //79

		gameSize = 64;

		for (int i = 0; i < arr.length; i++) {
			list.add(arr[i]);
		}

		list = scramble(list);

		confetti = new Confetti[50];
		//setup every confetti
		for(int i=0; i<confetti.length; i++){
			confetti[i] = new Confetti();
		}



		// // Buttons
		//tier 1 left *done
		int y = 17;
		for (int i = 0; i < gameSize / 4; i++) {
			buttonList1.add(new JButton(""));
			buttonList1.get(i).setBounds(67, y, 10, 10);
			add(buttonList1.get(i));
			buttonList1.get(i).addActionListener(this);
			y += 45;
			if (i % 2 == 1) {
				y += 11;
			}
		}
		//tier 1 right *done
		y = 17;
		for (int i = buttonList1.size(); i < gameSize / 2; i++) {//maybe int i = buttonListL1.size()-1
			buttonList1.add(new JButton(""));
			buttonList1.get(i).setBounds(1375-15, y, 10, 10);
			add(buttonList1.get(i));
			buttonList1.get(i).addActionListener(this);
			y += 45;
			if (i % 2 == 1) {
				y += 11;
			}
		}

		//tier 2 left *done
		y = 40;
		for (int i = 0; i < gameSize / 8; i++) {
			buttonList2.add(new JButton(""));
			buttonList2.get(i).setBounds(165, y, 10, 10);
			add(buttonList2.get(i));
			buttonList2.get(i).addActionListener(this);
			y += 97;
			if (i % 2 == 1) {
				y += 11;
			}
		}
		//tier 2 right *done
		y=40;
		for (int i = buttonList2.size(); i < gameSize / 4; i++) {
			buttonList2.add(new JButton(""));
			buttonList2.get(i).setBounds(1225, y, 10, 10);
			add(buttonList2.get(i));
			buttonList2.get(i).addActionListener(this);
			y += 97;
			if (i % 2 == 1) {
				y += 11;
			}
		}

		//tier 3 left *done
		y=90;
		for (int i = 0; i < gameSize / 16; i++) {
			buttonList3.add(new JButton(""));
			buttonList3.get(i).setBounds(265, y, 10, 10);
			add(buttonList3.get(i));
			buttonList3.get(i).addActionListener(this);
			y += 200;
			if (i % 2 == 1) {
				y += 11;
			}
		}
		//tier 3 right *done
		y=90;
		for (int i = buttonList3.size(); i < gameSize / 8; i++) {
			buttonList3.add(new JButton(""));
			buttonList3.get(i).setBounds(1115, y, 10, 10);
			add(buttonList3.get(i));
			buttonList3.get(i).addActionListener(this);
			y += 200;
			if (i % 2 == 1) {
				y += 11;
			}
		}

		//tier 4 left *done
		y=190;
		for (int i = 0; i < gameSize / 32; i++) {
			buttonList4.add(new JButton(""));
			buttonList4.get(i).setBounds(1010, y, 10, 10);
			add(buttonList4.get(i));
			buttonList4.get(i).addActionListener(this);
			y += 410;
			if (i % 2 == 1) {
				y += 11;
			}
		}
		//tier 4 right *done
		y=190;
		for (int i = buttonList4.size(); i < gameSize / 16; i++) {
			buttonList4.add(new JButton(""));
			buttonList4.get(i).setBounds(365, y, 10, 10);
			add(buttonList4.get(i));
			buttonList4.get(i).addActionListener(this);
			y += 410;
			if (i % 2 == 1) {
				y += 11;
			}
		}

		//tier 5 both
		buttonList5.add(new JButton(""));
		buttonList5.get(0).setBounds(470, 395, 10, 10);
		add(buttonList5.get(0));
		buttonList5.get(0).addActionListener(this);

		buttonList5.add(new JButton(""));
		buttonList5.get(1).setBounds(910, 395, 10, 10);
		add(buttonList5.get(1));
		buttonList5.get(1).addActionListener(this);
		

		
		restartButton = new JButton("Restart");
		restartButton.setBounds(600, 20, 200, 30);
		add(restartButton);
		restartButton.addActionListener(this);

		// // TextFields
		// nameInput = new JTextField();
		// nameInput.setBounds(300, 400, 150, 30);
		// add(nameInput);

		// // TextArea
		// textArea = new JTextArea(); // sets the location and size
		// textArea.setBounds(50, 20, 600, 330);
		// textArea.setEditable(false);
		// textArea.setFont(new Font("Arial", Font.PLAIN, 14));

		this.setFocusable(true);
	}

	public Dimension getPreferredSize() {
		// Sets the size of the panel
		return new Dimension(1440, 800);
	}

	public void paintComponent(Graphics g) {

		super.paintComponent(g);

		// draw background
		g.setColor(pigPink);
		g.fillRect(0, 0, 1440, 800);
		int listn = 0;
		g.setColor(Color.black);
		// for (int i = 0; i < 16; i++) {
		// for (int j = 0; j < 2; j++) {
		// g.setColor(Color.white);
		// g.fillRect(50, ybutt, 20, 50);
		// g.drawString(list.get(listn), 50, ybutt);
		// ybutt = ybutt + 20;
		// listn = listn + 1;
		// }
		// ybutt += 30;
		// }

		Font font = new Font("Arial", Font.PLAIN, 10);
		Font font2 = new Font("Arial", Font.PLAIN, 30);
		g.setFont(font);

		int ybutt = 7;
		int yIndex = 55;
		//left tier 1 text
		for (int i = 0; i < gameSize / 2; i++) {
			g.setColor(Color.white);
			g.fillRect(5, ybutt, 60, 15);
			g.setColor(Color.black);
			g.drawString(list.get(i), 7, ybutt + 10);
			ybutt += 18;
			if (i % 2 == 1) {
				g.setColor(Color.white);
				g.setFont(font2);
				g.drawString("}", 77, yIndex);
				yIndex += 101;
				g.setColor(Color.black);
				g.setFont(font);
				ybutt += 7;
				double d = (i + 2) % 4;
				if (d == 1) {
					ybutt += 15;
				}
			}
		}
    
        ybutt = 7;
		yIndex = 55;
		//right tier 1 text *done
        for (int i = 32; i < gameSize; i++) {
			g.setColor(Color.white);
			g.fillRect(1375, ybutt, 60, 15);
			g.setColor(Color.black);
			g.drawString(list.get(i), 1377, ybutt+10);
			ybutt += 18;
			if (i%2 == 1) {
				g.setColor(Color.white);
				g.setFont(font2);
				g.drawString("{", 1377-55, yIndex);
				yIndex += 101;
				g.setColor(Color.black);
				g.setFont(font);
				ybutt += 7;
                double d = (i+2)%4;
                if (d == 1){
                    ybutt +=15;
                }
			}
		}

        ybutt = 30;
		yIndex = 55+48;
		//left tier 2 text *done
		for (int i = 0; i < gameSize / 4; i++) {
			g.setColor(Color.white);
			g.fillRect(100, ybutt, 60, 15);
			g.setColor(Color.black);
			//g.drawString(list.get(i), 102, ybutt+10);
			if(i < listTier1.size()){
				g.drawString(listTier1.get(i), 102, ybutt+10);
			}
			ybutt += 18;
			if (i%2 == 1) {
				ybutt += 65;
				g.setColor(Color.white);
				g.setFont(font2);
				g.drawString("}", 102+75, yIndex);
				yIndex += 101;
				g.setColor(Color.black);
				g.setFont(font);
			}
		}
        ybutt = 30;
		//right tier 2 text *done
        for (int i = gameSize/4; i < gameSize / 2; i++) {
			g.setColor(Color.white);
			g.fillRect(1240, ybutt, 60, 15);
			g.setColor(Color.black);
			if(i < listTier1.size()){
				g.drawString(listTier1.get(i) , 1240, ybutt+10);
			}			
			ybutt += 18;
			if (i%2 == 1) {
				ybutt += 65;
			}
		}

		ybutt = 80;
		//left tier 3 text *done
        for (int i = 0; i < gameSize / 8; i++) {
			g.setColor(Color.white);
			g.fillRect(200, ybutt, 60, 15);
			g.setColor(Color.black);
			//g.drawString(list.get(i), 202, ybutt+10);
			if(i < listTier2.size()){
				g.drawString(listTier2.get(i), 202, ybutt+10);
			}
			ybutt += 18;
			if (i%2 == 1) {
				ybutt += 165;
			}
		}	
		ybutt = 80;
		//right tier 3 text *done
        for (int i = gameSize / 8; i < gameSize / 4; i++) {
			g.setColor(Color.white);
			g.fillRect(1130, ybutt, 60, 15);
			g.setColor(Color.black);
			//g.drawString(list.get(i), 1132, ybutt+10);
			if(i < listTier2.size()){
				g.drawString(listTier2.get(i) , 1132, ybutt+10);
			}
			ybutt += 18;
			if (i%2 == 1) {
				ybutt += 165;
			}
		}

		ybutt = 180;
		//left tier 4 text *done
        for (int i = 0; i < gameSize / 16; i++) {
			g.setColor(Color.white);
			g.fillRect(300, ybutt, 60, 15);
			g.setColor(Color.black);
			//g.drawString(list.get(i), 302, ybutt+10);
			if(i < listTier3.size()){
				g.drawString(listTier3.get(i), 302, ybutt+10);
			}
			ybutt += 18;
			if (i%2 == 1) {
				ybutt += 370;
			}
		}	
		ybutt = 180;
		//right tier 4 text *done
        for (int i = gameSize / 16; i < gameSize / 8; i++) {
			g.setColor(Color.white);
			g.fillRect(1030, ybutt, 60, 15);
			g.setColor(Color.black);
			//g.drawString(list.get(i), 1032, ybutt+10);
			if(i < listTier3.size()){
				g.drawString(listTier3.get(i) , 1032, ybutt+10);
			}
			ybutt += 18;
			if (i%2 == 1) {
				ybutt += 370;
			}
		}

		ybutt = 385;
		//left tier 5 text
        for (int i = 0; i < gameSize / 32; i++) {
			g.setColor(Color.white);
			g.fillRect(400, ybutt, 60, 15);
			g.setColor(Color.black);
			//g.drawString(list.get(i), 402, ybutt+10);
			if(i < listTier4.size()){
				g.drawString(listTier4.get(i) , 402, ybutt+10);
			}
			ybutt += 18;
			if (i%2 == 1) {
				ybutt += 370;
			}
		}			
		ybutt = 385;
		//right tier 5 text
        for (int i = gameSize / 32; i < gameSize / 16; i++) {
			g.setColor(Color.white);
			g.fillRect(930, ybutt, 60, 15);
			g.setColor(Color.black);
			//g.drawString(list.get(i), 932, ybutt+10);
			if(i < listTier4.size()){
				g.drawString(listTier4.get(i) , 932, ybutt+10);
			}
			ybutt += 18;
			if (i%2 == 1) {
				ybutt += 370;
			}
		}	

		ybutt = 385;
		//center final tier
        for (int i = 0; i < gameSize / 32; i++) {
			g.setColor(Color.white);
			g.fillRect(680, ybutt, 60, 15);
			g.setColor(Color.black);
			//g.drawString(list.get(i), 687, ybutt+10);
			if(i < listTier5.size()){
				g.drawString(listTier5.get(i) , 687, ybutt+10);
			}
			ybutt += 18;
			if (i%2 == 1) {
				ybutt += 370;
			}
		}

		if(listTier5.size() > 0){
			for (int i=0; i<confetti.length; i++){
				confetti[i].drawMeWin(g);
			}
		}

		

		repaint();
	}

	public String getRand(ArrayList<String> list) {
		int rand = (int) (Math.random() * list.size());
		return list.get(rand);
	}

	public ArrayList<String> scramble(ArrayList<String> list) {
		for (int i = 0; i < list.size(); i++) {
			int rand = (int) (Math.random() * list.size());
			String temp = list.get(i);
			list.set(i, list.get(rand));
			list.set(rand, temp);
		}
		return list;
	}

	public void actionPerformed(ActionEvent e) {
		// // convert string to int
		// int period = Integer.parseInt(periodTxt);
	
		if(e.getSource() == restartButton){
			list = scramble(list);
			listTier1.clear();
			listTier2.clear();
			listTier3.clear();
			listTier4.clear();
			listTier5.clear();

			k = 0;
			l = 0;
			m = 0;
			n = 0;
			o = 0;
		}

		//tier 1
		for(int i = 0; i < buttonList1.size(); i++ ){
			if (e.getSource() == buttonList1.get(i)) {
				if(i%2==0){//even buttons
					listTier1.add(list.get(k));
					listTier1.add(list.get(k+1));
				}
				else if (i%2==1){//odd buttons
					listTier1.add(list.get(k+2));
					listTier1.add(list.get(k+3));
				}
				k+=4;
			}
		}

		//System.out.println("listTier1L: \n" + listTier1);

		//tier 2
		for(int i = 0; i < buttonList2.size(); i++ ){
			if (e.getSource() == buttonList2.get(i)) {
				if(i%2==0){//even buttons
					listTier2.add(listTier1.get(l));
					listTier2.add(listTier1.get(l+1));
				}
				else if (i%2==1){//odd buttons
					listTier2.add(listTier1.get(l+2));
					listTier2.add(listTier1.get(l+3));
				}
				l+=4;
			}
		}

		//tier 3
		for(int i = 0; i < buttonList3.size(); i++ ){
			if (e.getSource() == buttonList3.get(i)) {
				if(i%2==0){//even buttons
					listTier3.add(listTier2.get(m));
					listTier3.add(listTier2.get(m+1));
				}
				else if (i%2==1){//odd buttons
					listTier3.add(listTier2.get(m+2));
					listTier3.add(listTier2.get(m+3));
				}
				m+=4;
			}
		}

		//tier 4
		for(int i = 0; i < buttonList4.size(); i++ ){
			if (e.getSource() == buttonList4.get(i)) {
				if(i%2==0){//even buttons
					listTier4.add(listTier3.get(n));
					listTier4.add(listTier3.get(n+1));
				}
				else if (i%2==1){//odd buttons
					listTier4.add(listTier3.get(n+2));
					listTier4.add(listTier3.get(n+3));
				}
				n+=4;
			}
		}

		//tier 5
		for(int i = 0; i < buttonList5.size(); i++ ){
			if (e.getSource() == buttonList5.get(i)) {
				if(i%2==0){//even buttons
					listTier5.add(listTier4.get(o));
					listTier5.add(listTier4.get(o+1));
				}
				else if (i%2==1){//odd buttons
					listTier5.add(listTier4.get(o+2));
					listTier5.add(listTier4.get(o+3));
				}
				o+=4;
			}
		}
		

		// refresh
		repaint();
	}

	  
	public void animate(){
		while(true){

		   //move every confetti
		   for (int i=0; i<confetti.length; i++){
				confetti[i].moveDown();
		   }

		   //wait for .01 second
		   try {
			   Thread.sleep(10);
		   } catch(InterruptedException ex) {
			   Thread.currentThread().interrupt();
		   }

		   //repaint the graphics drawn
		   repaint();
		}
  
	}
}