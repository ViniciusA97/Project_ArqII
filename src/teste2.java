import org.opencv.core.Core;
import org.opencv.core.CvType;
import org.opencv.core.Mat;
import org.opencv.highgui.HighGui;
public class teste2 {

	public static void main(String[] args){
		
		System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
		Mat mat =new  Mat(100,100,CvType.CV_8UC3);
		System.out.println(mat.dump());
		HighGui.namedWindow ( "imagem" , HighGui.WINDOW_AUTOSIZE);
        HighGui.imshow ( "imagem" , mat);
        HighGui.waitKey ();
	}
}
