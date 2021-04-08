package Proyecto;

import javax.swing.JButton;

public class Monitor {
	
	private JButton[][] b;
	private JugadorPC j;
	private Triqui t;
	private Boolean ocupado = false;
	private int n;

	public Monitor(JButton[][] b, JugadorPC j, Triqui t) {
		this.b = b;
		this.j = j;
		this.t = t;
	}
	
	public synchronized void turno1() {
		while(ocupado == true) {
			try {
				wait();
			}catch(InterruptedException ex){}
		}
		
		j.jugarM1(b,t,1);
		ocupado = true;
		notify();
	}
	
	public synchronized void turno2() {
		while(ocupado == false) {
			try {
				wait();
			}catch(InterruptedException ex){}
		}
		
		j.jugarM2(b,t,2);
		ocupado = false;
		notify();
	}
}
