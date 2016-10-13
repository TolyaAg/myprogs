package helpinstudy.com.firstbigprog;

import java.util.ArrayList;

public class Hippodrome {
	
	ArrayList<Horse> horses = new ArrayList<>();
	public static Hippodrome game;
	
	public static void main(String[] args) {
		game = new Hippodrome();
		Horse horse1 = new Horse("First", 3, 0);
		Horse horse2 = new Horse("Second", 3, 0);
		Horse horse3 = new Horse("Third", 3, 0);
		game.getHorses().add(horse1);
		game.getHorses().add(horse2);
		game.getHorses().add(horse3);
		game.run();
	}
	
	public ArrayList<Horse> getHorses() {
		return horses;
	}
	
	public void run() {
		for (int i = 0; i < 100; i++) {
			move();
			print();
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		printWinner();
	}
	
	public void move() {
		for (Horse horse : horses)
		{
			horse.move();
		}
	}
	
	public void print() {
		for (Horse horse : horses)
		{
			horse.print();
		}
		System.out.println();
		System.out.println();
	}
	
	public Horse getWinner() {
		Horse horse = horses.get(0);
		for (Horse h : horses) {
			if (horse.getDistance() < h.getDistance())
				horse = h;
		}
		return horse;
	}
	
	public void printWinner() {
		Horse horse = getWinner();
		System.out.println("Winner is " + horse.getName() + "!");
	}
}
