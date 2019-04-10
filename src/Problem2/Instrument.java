package Problem2;

public abstract class Instrument {
	private String name = null;
	protected String[] sound = null;

	public abstract void playSound();
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return this.name;
	}
}
