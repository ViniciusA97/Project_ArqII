import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.highgui.HighGui;
import org.opencv.imgcodecs.Imgcodecs;

public class testOtmi {

	public static void main(String[] args) {
		
		System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
		Mat img = Imgcodecs.imread("queimada_grande.jpg");
		
		
		int h,w;
		Pixel pixel = new  Pixel();
		long tempoInicio = System.currentTimeMillis();
		for(int ii=0; ii<img.height()/2;ii+=img.height()/10) {
			for(int jj=0; jj<img.width()/2;jj+=img.width()/10) {
				for(int i=ii ; i<img.width()/2;i++) {
			
					w=img.width()/2+i;
		
					for(int j = jj; j<img.width()/2;j++) {
		
						h=img.height()/2+j;
						//System.out.println(ii+" "+jj+" "+" "+i+" "+j+" "+w+" "+h);
						pixel.setArray(img.get(i, j),img.get(i, h),img.get(w, j),img.get(w, h));
						img.put(i, j, pixel.getMedia1());
						img.put(i,h, pixel.getMedia2());
						img.put( w,j, pixel.getMedia3());
						img.put(w,h, pixel.getMedia4());
					}
				}	
			}
		}
		System.out.println(System.currentTimeMillis()-tempoInicio);
		HighGui.namedWindow("Imagem grayscale");
		HighGui.imshow("Imagem grayscale", img);
		HighGui.waitKey(0);
		
		Imgcodecs.imwrite("newGrayScale.jpg", img);
		System.out.println();
	}

}
