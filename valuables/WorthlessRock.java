package valuables;

public abstract class WorthlessRock extends Gemstone{

	public WorthlessRock(int capac) {
		super(capac);
	}
	
	@Override
	public void appraisal() {
		this.value=0;
	}

}
