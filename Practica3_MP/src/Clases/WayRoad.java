package Clases;

import Data.StackNode;

public class WayRoad {
	private StackNode m_first;
	private int m_nelements;
	
	public WayRoad() {
		m_first=null;
		m_nelements=0;
	}
	
	public WayRoad(String first) {
		m_first.setCoord(first);
		m_nelements=1;
	}
	
	public void push(String coord) {
		StackNode node= new StackNode(coord,m_first);
		m_first=node;
		m_nelements++;
	}
	
	public String pop () {
		String pop=m_first.getCoord();
		m_first=m_first.getNext();
		m_nelements--;
		return pop;
	}
	
	public int getNelements() {
		return m_nelements;
	}
}
