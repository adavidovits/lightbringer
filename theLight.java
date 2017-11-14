import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 * 
 * @author Addled Mage
 * @version 1.0
 * @since 11/14/2011
 * @revised 11/3/2013, 11/12/2017 (fake display report to do -10)
 */

public class theLight extends JFrame{
	public static void main(String[]args) throws Exception {
		
		 JFrame lightbringer = new theLight();
		 lightbringer.setSize(1000,450);
		 lightbringer.setVisible(true);
		 lightbringer.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 }
	
	
	final JPanel panel;
	final String[] locations = {"Ank","Drefia","Edron","Forb Land","Hellgate","Kaz","PoH","Ramoa","Svar","Yala"};
	
	public JLabel torch0,torch1,torch2,torch3,torch4,torch5,torch6,torch7,torch8,torch9;
	final JLabel torches[] = {torch0,torch1,torch2,torch3,torch4,torch5,torch6,torch7,torch8,torch9};
	
	private JLabel dispH0,dispH1,dispH2,dispH3,dispH4,dispH5,dispH6,dispH7,dispH8,dispH9;
	final JLabel dispHs[] = {dispH0,dispH1,dispH2,dispH3,dispH4,dispH5,dispH6,dispH7,dispH8,dispH9};
	
	private JLabel dispM0,dispM1,dispM2,dispM3,dispM4,dispM5,dispM6,dispM7,dispM8,dispM9;
	final JLabel dispMs[] = {dispM0,dispM1,dispM2,dispM3,dispM4,dispM5,dispM6,dispM7,dispM8,dispM9};
	
	public JButton reset0, reset1,reset2,reset3,reset4,reset5,reset6,reset7,reset8,reset9;
	final JButton resets[] = {reset0, reset1,reset2,reset3,reset4,reset5,reset6,reset7,reset8,reset9};
	
	public JTextField hour0,hour1,hour2,hour3,hour4,hour5,hour6,hour7,hour8,hour9;
	final JTextField hours[] = {hour0,hour1,hour2,hour3,hour4,hour5,hour6,hour7,hour8,hour9};
	
	public JTextField min0,min1,min2,min3,min4,min5,min6,min7,min8,min9,displaysummary;
	final JTextField mins[] = {min0,min1,min2,min3,min4,min5,min6,min7,min8,min9};
	
	public JButton submit0,submit1,submit2,submit3,submit4,submit5,submit6,submit7,submit8,submit9,getreport;
	final JButton submits[] = {submit0,submit1,submit2,submit3,submit4,submit5,submit6,submit7,submit8,submit9};
	
	
	/*
	 * This main method establishes the panel and initializes 
	 * the components within the component arrays.
	 * 
	 */
	public theLight(){
				
		panel = new JPanel(new GridLayout(12,8));
		panel.add(new JLabel("Locations"));
		panel.add(new JLabel("Hours Left"));
		panel.add(new JLabel("Minutes Left"));
		panel.add(new JLabel("Reset Buttons"));
		panel.add(new JLabel("Hour Entry Field"));
		panel.add(new JLabel("Minute Entry Field"));
		panel.add(new JLabel("Submit Custom Time"));
		
		
		for(int i=0; i<10;i++){
			torches[i] = new JLabel(locations[i]);
			panel.add(torches[i]);
			torches[i].setVisible(true);
			
			dispHs[i] = new JLabel("0");
			panel.add(dispHs[i]);
			dispHs[i].setVisible(true);
			
			dispMs[i] = new JLabel("0");
			panel.add(dispMs[i]);
			dispMs[i].setVisible(true);
			
			resets[i] = new JButton("Reset to 1:50");
			panel.add(resets[i]);
			resets[i].setVisible(true);
			
			hours[i] = new JTextField(""+0);
			panel.add(hours[i]);
			hours[i].setVisible(true);
			
			mins[i] = new JTextField(""+0);
			panel.add(mins[i]);
			mins[i].setVisible(true);
			
			submits[i] = new JButton("Submit Time");
			panel.add(submits[i]);
			submits[i].setVisible(true);
			
		    add(panel,BorderLayout.CENTER);
		    setTitle("Bring The Light");	
		}
		getreport = new JButton("Display Report");
		displaysummary = new JTextField();
		panel.add(getreport);
		panel.add(displaysummary);
		
		
		getreport.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				String update = "";
				for(int i=0; i<10; i++){
					String minDisplay ="";
					if(dispMs[i].getText().length()==1){
						minDisplay="0"+dispMs[i].getText();
					}else{
						minDisplay=dispMs[i].getText();
					}
				
					update+=""+locations[i]+"-("+dispHs[i].getText()+":"+minDisplay+")  |  ";
					}
				displaysummary.setText(update);
				}
			});	
		
		//This segment adds the actionListeners to the buttons 
		//for reset to max time as well as custom entry
//////////////////////////////////////////START RESET BUTTONS//////////////////////////////////////////
		resets[0].addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				startTimer(0);
				}
			});
		resets[1].addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				startTimer(1);
				}
			});
		resets[2].addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				startTimer(2);
				}
			});
		resets[3].addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				startTimer(3);
				}
			});
		resets[4].addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				startTimer(4);
				}
			});
		resets[5].addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				startTimer(5);
				}
			});
		resets[6].addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				startTimer(6);
				}
			});
		resets[7].addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				startTimer(7);
				}
			});
		resets[8].addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				startTimer(8);
				}
			});
		resets[9].addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				startTimer(9);
				}
			});	
//////////////////////////////////////////END RESET BUTTONS//////////////////////////////////////////
//////////////////////////////////////////START SUBMIT BUTTONS//////////////////////////////////////////
		submits[0].addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				updateTime(0,hours[0].getText(),mins[0].getText());
				}
			});
		
		submits[1].addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				updateTime(1,hours[1].getText(),mins[1].getText());
				}
			});	
		submits[2].addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				updateTime(2,hours[2].getText(),mins[2].getText());
				}
			});	
		submits[3].addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				updateTime(3,hours[3].getText(),mins[3].getText());
				}
			});	
		submits[4].addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				updateTime(4,hours[4].getText(),mins[4].getText());
				}
			});	
		submits[5].addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				updateTime(5,hours[5].getText(),mins[5].getText());
				}
			});	
		submits[6].addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				updateTime(6,hours[6].getText(),mins[6].getText());
				}
			});	
		submits[7].addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				updateTime(7,hours[7].getText(),mins[7].getText());
				}
			});	
		submits[8].addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				updateTime(8,hours[8].getText(),mins[8].getText());
				}
			});	
		submits[9].addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				updateTime(9,hours[9].getText(),mins[9].getText());
				}
			});	
		
//////////////////////////////////////////END SUBMIT BUTTONS//////////////////////////////////////////
		
		//Below is the code for the timer segment of the program, set to 60000 milliseconds, which is 1 minute.
		int delay = 60000;
		ActionListener taskPerformer = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				reduceMinutes();
			}
		};
		new Timer(delay, taskPerformer).start();
	}
	
	/**
	 * @param row (location of basin)
	 */
	public void startTimer(int row){
		dispHs[row].setText("1");
		dispMs[row].setText("50");
	}
	
	public void reduceMinutes(){
		for(int i=0; i<10;i++){
			if(Integer.parseInt(dispMs[i].getText())==1){
				reduceHours(i);
				dispMs[i].setText("60");
			}
			dispMs[i].setText(""+(Integer.parseInt(dispMs[i].getText())-1));
		}
	}
	
	/**
	 * @param row (location of basin)
	 */
	public void reduceHours(int row){
		dispHs[row].setText(""+(Integer.parseInt(dispHs[row].getText())-1));
	}
	
	/**
	 * 
	 * @param row (location of basin)
	 * @param h (desired hour)
	 * @param m (desired minute)
	 */
	public void updateTime(int row, String h, String m){
		try{
			int hours = Integer.parseInt(h);
			int minutes = Integer.parseInt(m);
			dispHs[row].setText(""+hours);
			dispMs[row].setText(""+minutes);
			
		}
		catch(NumberFormatException ee){}
	}
}
