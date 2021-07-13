
public class Circulo extends FigGeo{
	
	double  diam=(1/3.1416);
	double pi=3.1416;
	
	double area = pi*pi*diam;
	
	public String areaCir() {
		return "El área del circulo es:" + this.area;
		}

}
