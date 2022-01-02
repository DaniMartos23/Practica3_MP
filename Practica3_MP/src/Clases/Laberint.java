package Clases;

public class Laberint {
	private int m_ncolumns,m_nrows;
	private int m_efila,m_ecolumna,m_sfila,m_scolumna;
	private String[][] m_maze;
	
	
	public Laberint() {
		m_ncolumns=0;
		m_nrows=0;
		m_efila=0;
		m_ecolumna=0;
		m_sfila=0;
		m_scolumna=0;
		m_maze=null;
	}
	
	public Laberint(int nrows,int ncolumns, int efila, int ecolumna, int sfila,int scolumna, String [][] maze) {
		
		m_ncolumns=ncolumns;
		m_nrows=nrows;
		m_efila=efila;
		m_ecolumna=ecolumna;
		m_sfila=sfila;
		m_scolumna=scolumna;
		m_maze=maze;
		
	}
	
}
