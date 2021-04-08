package Proyecto;

import javax.swing.JButton;

public class JugadorUno extends Thread{
	private JButton[][] b;
	private JugadorPC j;
	private Triqui t;
	private Monitor m;
	
	public JugadorUno(Monitor m, JButton[][] b, JugadorPC j, Triqui t) {
		this.m = m;
		this.b = b;
		this.j = j;
		this.t = t;
	}
	
	public void run() {
		Boolean bandera;
		try {
			while(true) {
				if( this.t.getGanador() == true) {
					System.out.println("run");

					t.limpiarTablero();
					break;
				}
				m.turno1();
				
				try {
					sleep(1000);
				}catch(InterruptedException ex) {
				}
			}
		}catch(Exception e) {		}
		
	}

}
