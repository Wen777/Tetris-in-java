import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.util.Random;
import java.net.URL;
import java.net.MalformedURLException;
import java.util.Scanner;
import java.awt.event.KeyEvent;


// Class for tetris frame
public class Frame{
	public Frame(){};
}

public class Bits{
	// Following are 5 type of bits.
	private boolean ArrayofScreeen[][][]  = new boolean[][][]{
			// l
			{false,true,false,false,false,true,false,false,false,true,false,false,false,true,false,false},
			{false,false,false,false,true,true,true,true,false,false,false,false}
	};
}

public class Tetris{
	//¹CÀ¸¤¶­±¡B«ü¥O
	String[][] screen = new String[20][10];
	private Random random = new Random();
	
	
	//input session
	public void Keypressed(KeyEvent e){
		int KeyCode = e.getKeyCode();
		switch(KeyCode ){
		case KeyEvent.VK_LEFT : 
            break; 
        case KeyEvent.VK_UP : 
            //do something 
            break;                
        case KeyEvent.VK_DOWN : 
            //do something 
            break; 
        case KeyEvent.VK_RIGHT: 
            //do something 
            break; 
		}
	}
	
	//Check block can down 
	private boolean downTest(){
		return true;
	}
	
	//Move block down
	private void downBlock(){
		
	}
	
	//Default screen
	private void defaultScreen(){
		for(int j=0;j<screen.length;j++){
			//Default each item 
			for(int k=0;k<screen[j].length;k++){
				screen[j][k] = null;
			}
		}
	}
	
	//type name = new type(arguments);
	//Check screen & give score
	private int checkScreenScore(){
		for(int j=0;j<screen.length;j++){
			//Check each item and row
			int stateOfRow = 0;
			for(int k=0;k<screen[j].length;k++){
				if( (screen[j][k] != null)&&(stateOfRow == 9) )
					return 10;
				else if(screen[j][k] != null)
					stateOfRow++;
			}
		}
		return 0;//Is this right ? Check every row & column, no score. just return 0 ?
	}
	

	
	
	//Main method, open game, control game...
	public static void main(String[] args){
		//START GAME
		Scanner keyboard = new Scanner(System.in);
		String optionStart = keyboard.next();
		
		if(optionStart == "start"){
		}
		else
		{{}while(true);}	
	}
	
	
}