package Proyecto;

public class ValorRendimiento {
	double tiem;
	public ValorRendimiento(double tiempo) {
		//initComponents();
		
		this.tiem = tiempo;
		double il = 389;
		double i2 = 244;
		double ip = 38;
		double tt2 =(int)tiem;
		double tt1 = tt2 + 2;
		double n1 = 2;
		double n2 = 2;
		double s1 = n1 / tt1;
		double s2 = n2/tt2;
		double e1 = s1/n1;
		double e2 = s2/n2;
		double r1 = il/il;
		double r2 = i2/(i2*2);
		double u1 = r1*e1;
		double u2 = r2*e2;
		double q1 = (s1*e1)/r1;
		double q2 = (s2*e2)/r2;

		System.out.println("Tiempo de recorrido: "+ tt2);
		System.out.println("Factor de rendimiento: " + s2);
		System.out.println("Eficiencia: " + e2);
		System.out.println("Redundancia: " + r2);
		System.out.println("Calidad: " + u2);
		System.out.println("Utilidad: " + q2);
		
		
	}
}
