package de.wwu.pi;

/**
 * Corresponds to the object on the remote end
 */
public class AdderRequest {

	private int first;
	private int second;

	/**
	 * Convenience constructor
	 */
	public AdderRequest(int first, int second) {
		this.first = first;
		this.second = second;
	}

	// default constructor
	AdderRequest() { }

	public int getFirst() {
		return first;
	}

	public int getSecond() {
		return second;
	}

}
