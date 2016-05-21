/*
Programmer: Columbus Dong
Date: January 30, 2015
Assignment: Carnival
School: Manteo High
*/

public class Carnival
{
	public static void main(String args[])
	{
		/*Create GameBooths*/
		GameBooth ballonDartToss = new GameBooth(2, "Tiger Plush", "Sticker");
		GameBooth ringToss = new GameBooth(2, "Bear Keychain", "Pencil");
		GameBooth breakAPlate = new GameBooth(1.5, "Pig Plush", "Plastic Dinosaur");

		/*Create Players*/
		Player Shonda = new Player(5);	//$5
		Player Luis = new Player(3);	//$3

		/*Output*/
		System.out.print("Shonda goes to Ballon Dart Toss. ");
		System.out.println(Shonda.Play(ballonDartToss));

		System.out.print("Luis goes to Ring Toss. ");
		System.out.println(Luis.Play(ringToss));

		System.out.print("Shonda goes to Ring Toss. ");
		System.out.println(Shonda.Play(ringToss));

		System.out.print("Luis goes to Break A Plate. ");
		System.out.println(Luis.Play(breakAPlate));

		System.out.println("Shonyda Won: " + Shonda.showPrizes());
		System.out.println("Luis Won: " + Luis.showPrizes());
	}
}
/*Output:
Shonda goes to Ballon Dart Toss. Prize Won: Sticker
Money Left: 3.0
Prizes Won: Sticker, null

Luis goes to Ring Toss. Prize Won: Pencil
Money Left: 1.0
Prizes Won: Pencil, null

Shonda goes to Ring Toss. Prize Won: Pencil
Money Left: 1.0
Prizes Won: Pencil, Sticker, null

Luis goes to Break A Plate. Sorry, not enough money to play. 

Shonyda Won: Pencil, Sticker, null
Luis Won: Pencil, null
 */