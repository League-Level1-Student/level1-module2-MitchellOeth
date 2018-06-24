public class TeaMakerMaker {
public static void main(String[] args) {

	TeaBag Green = new TeaBag("Green");
	Kettle kettle = new Kettle();
	kettle.getWater();
	kettle.boil();
	Cup cup = new Cup();
	cup.makeTea(Green, kettle.getWater());
}
}
