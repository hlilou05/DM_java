package valuables;

public class Ruby extends Gemstone {

	public Ruby(double myVolume) {
		super(myVolume);
	}

	@Override
	public void appraisal() {
		this.value = this.getVolume()*500;

	}

	@Override
	public void truc() {
		// TODO Auto-generated method stub
		
	}

}
