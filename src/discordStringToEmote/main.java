package discordStringToEmote;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		String out = "";
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			c = Character.toLowerCase(c);
			if("abcdefghijklmnoprstuvwxyz".indexOf(c) != -1) {
				out += (":regional_indicator_" + c + ": "); 
			}
			else if("1234567890".indexOf(c) != -1) {
			    switch(c) {    
			    case '0': out += ":zero:"; break;
			    case '1': out += ":one:"; break;
			    case '2': out += ":two:"; break;
			    case '3': out += ":three:"; break;
			    case '4': out += ":four:"; break;
			    case '5': out += ":five:"; break;
			    case '6': out += ":six:"; break;
			    case '7': out += ":seven:"; break;
			    case '8': out += ":eight:"; break;
			    case '9': out += ":nine:"; break;
			    }
			}
		}
		System.out.println(out);
	}
}
