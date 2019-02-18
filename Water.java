
public class Water extends Vehicle {
	private boolean anchorDown = false;
	
	public void dropAnchor() {
		if(anchorDown) {
			System.out.println("Already drooped, Captain!");
		} else {
			System.out.println("Anchors away!");
			anchorDown = true;
		}
	}
	public String toString() {
		return super.toString()+", and the anchor is down? "+anchorDown;
	}
}
