import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.imgcodecs.Imgcodecs;

public class TotalOtimizado {


		public static void main(String[] args) {
			
			System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
			Mat img = Imgcodecs.imread("san2.jpg");

			double [] pixel = new double [3];
			double media;
			int blocking =img.width()/60;
			long tempoInicio,tempoF;
			tempoInicio = System.currentTimeMillis();

			for(int jj=0 ; jj<img.width() ;jj+= blocking) {

				for(int ii=0; ii<img.height() ; ii+=blocking) {
					
			
					for(int j= jj; j< Math.min(jj+blocking, img.width()); j++) {
						
						for(int i=ii ; i<Math.min(ii+blocking, img.height()) ; i++) {
						
							pixel= img.get(i,j);
							media = (pixel[0]+pixel[1]+pixel[2])/3;
							pixel[0]=pixel[1]=pixel[2]=media;
					
							img.put(i, j, pixel);
							
						}
						
						
						
					}
					
				}
				
				
			}
			tempoF=System.currentTimeMillis();
			
			
			System.out.println(tempoF-tempoInicio);
			//HighGui.namedWindow("Imagem grayscale");
			//HighGui.imshow("Imagem grayscale", img);
			//HighGui.waitKey(0);
			
			Imgcodecs.imwrite("newGrayScale.jpg", img);
		}
	}

