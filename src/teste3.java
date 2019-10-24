import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.highgui.HighGui;
import org.opencv.imgcodecs.*;

public class teste3 {

	public static void main(String[] args) {
		System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
		Mat a= Imgcodecs.imread("queimada_grande.jpg");
		HighGui.namedWindow ( "imagem" , HighGui.WINDOW_AUTOSIZE);
        HighGui.imshow ( "imagem" , a);
        HighGui.waitKey ();
        System.out.println(a.dump());
		
		
	}
}
