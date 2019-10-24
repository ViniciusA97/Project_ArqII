import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.highgui.HighGui;
import org.opencv.imgcodecs.*;

public class otimizated {

	public static void main(String[] args) {
		
		System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
		Mat img = Imgcodecs.imread("san.jpg");
		
		System.out.println(img.width()+" "+img.height());
		int h,w;
		Pixel pixel = new  Pixel();
		long tempoInicio = System.currentTimeMillis();
		//System.out.println(img.get(2052, 0));
		
		for(int i=0 ; i<img.width()/2;i++) {
			
			w=img.width()/2+i;
		
			for(int j = 0; j<img.height()/2;j++) {
				
				h=img.height()/2+j;
				pixel.setArray(img.get(j, i),img.get(h, i),img.get(j, w),img.get(h, w));
				img.put(j, i, pixel.getMedia1());
				img.put(h, i, pixel.getMedia2());
				img.put(j, w, pixel.getMedia3());
				img.put(h, w, pixel.getMedia4());
			}
		}
		
		System.out.println(System.currentTimeMillis()-tempoInicio);
		//HighGui.namedWindow("Imagem grayscale");
		//HighGui.imshow("Imagem grayscale", img);
		//HighGui.waitKey(0);
		
		Imgcodecs.imwrite("newGrayScale.jpg", img);
	}
}
//add blocagem
//add tempo de exe

//n otimizada, fazer inverso e tirar blocagem
