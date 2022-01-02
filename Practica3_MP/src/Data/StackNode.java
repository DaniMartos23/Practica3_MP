package Data;

public class StackNode {
	private String m_coord;
	private StackNode m_next;
	
	
	public StackNode () {
		m_coord=null;
		m_next=null;
	}
	
	public StackNode(String coord, StackNode next) {
		m_next=next;
		m_coord=coord;
	}
	
	public StackNode getNext() {
		
		return m_next;
		
	}
	
	public String getCoord() {
		
		return m_coord;
	}
	
	public void setNext(StackNode next) {
		m_next=next;
	}
	
	public void setCoord(String coord) {
		m_coord=coord;
	}
}
