package valuables;

public class RockWithTruc extends WorthlessRock {

	public RockWithTruc(int capac) {
		super(capac);
	}

	@Override
	public void truc() {
		System.out.println("truc");

	}

}
