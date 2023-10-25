package valuables;
import safes.Safe;

/**
 * A precious gemstone
 * @author ceichler
 * @version 1.0
 *
 */
public abstract class Gemstone implements Valuable{
	
	/**
	 * Value of the gemstone
	 */
	protected double value = -1;

	/**
	 * Getter of the property <tt>value</tt>
	 * @return  Returns the value.
	 */
	public double getValue() {
		return value;
	}
	
	/**
	 * Volume of the gemstone
	 */
	private final double volume;

	/**
	 * Getter of the property <tt>volume</tt>
	 * @return  Returns the volume.
	 */
	public double getVolume() {
		return volume;
	}
	

	/**
	 * Constructing a gemstone with some volume and weight
	 * @param myVolume volume of the gemstone
	 */		
	public Gemstone(double myVolume){
		volume=myVolume;	
	}

		
	/**
		
	* Assess the value of the gemstone 
	 */
	public abstract void appraisal();

	@Override
	public String toString() {
		return ""+ this.getClass().getName() + " of volume " + this.volume + " and value " + this.value ;
	}
	
	public abstract void truc();
	/**
	 * Safe containing the gem
	 */
		private Safe mySafe = null;

	/**
	 * Getter of the property <tt>mySafe</tt>
	 * @return  Returns the mySafe.
	 * @uml.property  name="mySafe"
	 */
	public Safe getMySafe() {
		return mySafe;
	}

	/**
	 * Setter of the property <tt>monSafe</tt>
	 * @param monSafe  The monSafe to set.
	 * @uml.property  name="monSafe"
	 */
	public void setMySafe(Safe mySafe) {
		this.mySafe = mySafe;
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(value);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(volume);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Gemstone other = (Gemstone) obj;
		if (Double.doubleToLongBits(value) != Double.doubleToLongBits(other.value))
			return false;
		if (Double.doubleToLongBits(volume) != Double.doubleToLongBits(other.volume))
			return false;
		return true;
	}

	

}