import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.imgcodecs.Imgcodecs;

public class nonotmizateReal {
	public static void main(String[] args) {
		
		System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
		Mat img = Imgcodecs.imread("san2.jpg");
		
		double [] pixel = new double[3];
		double media;
		
		long tempoInicio = System.currentTimeMillis();

			for(int j=0; j<img.width() ; j++) {
					
					
				for(int i=0 ; i<img.height() ; i++) {
					
						pixel= img.get(i,j);
						media = (pixel[0]+pixel[1]+pixel[2])/3;
						for(int n=0; n<3; n++) {
							pixel[n]=media;
						}
				
						img.put(i, j, pixel);
					}
					
		}
		System.out.println(System.currentTimeMillis()-tempoInicio);
		
		//Imgcodecs.imwrite("newGrayScale.jpg", img);
	}
}
