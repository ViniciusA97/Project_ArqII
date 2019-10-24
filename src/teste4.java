import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.highgui.HighGui;
import org.opencv.imgcodecs.*;

public class teste4 {

	public static void main(String[] args) {
		
		System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
		
		Mat a= Imgcodecs.imread("download.jpg");
		
		HighGui.namedWindow ( "imagem" , HighGui.WINDOW_AUTOSIZE);
        HighGui.imshow ( "imagem" , a);
        HighGui.waitKey ();
        
        double [] color = new double [] {0,0,255};
     
        for(int i=0; i<a.width()/2;i++) {
        	for(int j=0; j<a.height()/2;j++)
        		a.put(i, i, color);
        }
        
        HighGui.namedWindow ( "imagemDps" , HighGui.WINDOW_AUTOSIZE);
        HighGui.imshow ( "imagemDps" , a);
        HighGui.waitKey ();
	}
}
