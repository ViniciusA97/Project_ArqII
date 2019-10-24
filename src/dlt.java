import org.opencv.core.*;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.videoio.VideoCapture;

public class dlt {

	public static void main(String[] args) {
		System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
		VideoCapture camera = new VideoCapture(0);
		
		if(!camera.isOpened()) {
			System.out.println("Error");
		}
		else {
			Mat frame = new Mat();
			while(true) {
				if(camera.read(frame)) {
					System.out.println("Frame obtido");
					System.out.println("capture frame widt "+
						frame.width() +"Heigth " + frame.height());
					Imgcodecs.imwrite("C:\\Users\\Vinicius\\Desktop\\teste\\teste.jpg",frame);
					System.out.println("ok");
					break;
				}
			}
		}
		camera.release();
	}

}
