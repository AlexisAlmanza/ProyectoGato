package Proyecto;

import javax.swing.JButton;

public class JugadorDos extends Thread{
	private JButton[][] b;
	private JugadorPC j;
	private Triqui t;
	private Monitor m;
	
	public JugadorDos(Monitor m, JButton[][] b, JugadorPC j, Triqui t) {
		this.m = m;
		this.b = b;
		this.j = j;
		this.t = t;
	}
	
	public void run() {
		while(true) {
			if(t.getGanador()==true) {
				t.limpiarTablero();
				break;
			}
			m.turno2();
			
			try {
				sleep(1000);
			}catch(InterruptedException ex) {
				
			}
		}
	}

}
