
public class Pixel {

	private double []array1;
	private double [] array2;
	private double [] array3;
	private double [] array4;
	public Pixel() {
		
	}
	
	public void setArray(double[] a,double[] b,double [] c, double []d) {
		this.array1=a;
		this.array2=b;
		this.array3=c;
		this.array4=d;
		setMedia();
	}
	public void setArray(double[] a,double[] b) {
		this.array1=a;
		this.array2=b;
		setMedia1();
	}
	public void setArray(double[]a) {
		this.array1=a;
		setMedia2();
	}
	
	public void setArray(double[] a,double[] b,double[] c) {
		this.array1=a;
		this.array2=b;
		this.array3=c;
		setMedia3();
	}
	
	public double [] getMedia1() {
		return this.array1;
	}
	
	public double [] getMedia2() {
		
		return this.array2;
		
	}
	public double [] getMedia3() {
		return this.array3;
	}
	public double [] getMedia4() {
		return this.array4;
	}
	
	
	public void setMedia() {
		double media1= (this.array1[0]+this.array1[1]+this.array1[2])/3;
		double media2= (this.array2[0]+this.array2[1]+this.array2[2])/3;
		double media3= (this.array3[0]+this.array3[1]+this.array3[2])/3;
		double media4= (this.array4[0]+this.array4[1]+this.array4[2])/3;
		for(int i=0;i<3;i++) {
			this.array1[i] = media1;
			this.array2[i]=media2;
			this.array3[i]=media3;
			this.array4[i]=media4;
		}
	}
	
	public void setMedia1() {
		double media1= (this.array1[0]+this.array1[1]+this.array1[2])/3;
		double media2= (this.array2[0]+this.array2[1]+this.array2[2])/3;
		for(int i=0;i<3;i++) {
			this.array1[i] = media1;
			this.array2[i]=media2;
		}
	}
		public void setMedia2() {
			double media1= (this.array1[0]+this.array1[1]+this.array1[2])/3;
			this.array1[0]=this.array1[1]=this.array1[2]=media1;
			
	}
		public void setMedia3() {
			double media1= (this.array1[0]+this.array1[1]+this.array1[2])/3;
			double media2= (this.array2[0]+this.array2[1]+this.array2[2])/3;
			double media3= (this.array2[0]+this.array2[1]+this.array2[2])/3;
			for(int i=0;i<3;i++) {
				this.array1[i] = media1;
				this.array2[i]=media2;
				this.array3[i]= media3;
			}
		}
}
