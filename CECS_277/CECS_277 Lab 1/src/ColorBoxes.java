
/**
 * ALfredo Vargas
 * CECS 277
 * Lab 1: Colored boxes
 * Susan
 */
	
import java.io.FileOutputStream;
import java.io.IOException;

public class ColorBoxes{
	public static void main(String[] args){
		byte[] bmpHeader = {
					66, 77, 		//signature
					102, 6, 0, 0,	//file size in bytes
					0, 0, 0, 0,		//reserved (0)
					54, 0, 0, 0,	//offset to img data
					40, 0, 0, 0,	//header size (40)
					23, 0, 0, 0,	//width (pixels)
					22, 0, 0, 0,	//height (pixels)	
					1, 0,			//planes
					24, 0,			//bits per pixel (1,4,8,24)
					0, 0, 0, 0,		//compress (0 = none, 1 = RLE8, 2 = RLE4
					0, 0, 0, 0,		//img data size
					(byte) 196, 14, 0, 0, //horiz res pix/meter
					(byte) 196, 14, 0, 0, //vert res pix/meter
					0, 0, 0, 0,		//#colors in image or 0
					0, 0, 0, 0,		//#important colors or 0
		};
		try {
			FileOutputStream pic = new FileOutputStream("picChecker.bmp");
			//write header
			pic.write(bmpHeader);
			//write data - pixel data (r,g,b) (0-255)
			//every row needs to a multiply of 4 bytes
			//(ie. add padding (22*(23*3+3) = 1584))
			int color = 0;
			for(int i = 0; i < 23; i++)
			{
				for(int j = 0; j < 23; j++)
				{	//col 
					pic.write(color);
					pic.write(color);
					pic.write(color);
					if(color == 0)
					{
						color = 255;
					}
					else 
					{
						color = 0;
					}
				}
				//pad 3 bytes
				pic.write(0);
				pic.write(0);
				pic.write(0);
			}
		} catch(IOException e) 
		{
			System.out.println("Error processing File");
			}			
	
	try {
		FileOutputStream pic4 = new FileOutputStream("picTester.bmp");
		//write header
		pic4.write(bmpHeader);
		//write data - pixel data (r,g,b) (0-255)
		//every row needs to a multiply of 4 bytes
		//(ie. add padding (22*(23*3+3) = 1584))
		int color = 0;
		for(int i = 0; i < 23; i++)
		{
	
			for(int j = 0; j < 23; j++)
			{	
				//col 
				pic4.write(color);
				pic4.write(color);
				pic4.write(color);
				if( color == 0)
					color = 255;
				else 
					color = 0;
			}
			//pad 3 bytes
			pic4.write(0);
			pic4.write(0);
			pic4.write(0);
		}
		
	} catch(IOException e) 
	{
		System.out.println("Error processing File");
		}	
	
	try {
		FileOutputStream pic3 = new FileOutputStream("picHorizontal.bmp");
		//write header
		pic3.write(bmpHeader);
		//write data - pixel data (r,g,b) (0-255)
		//every row needs to a multiply of 4 bytes
		//(ie. add padding (22*(23*3+3) = 1584))
		int color = 0;
		for(int i = 0; i < 23; i++)
		{
			if(color == 0)
			{
				color = 255;
			}
			else 
			{
				color = 0;
			}
			for(int j = 0; j < 23; j++)
			{	//col 
				pic3.write(color);
				pic3.write(color);
				pic3.write(color);
			}
			//pad 3 bytes
			pic3.write(0);
			pic3.write(0);
			pic3.write(0);
		}
		
	} catch(IOException e) 
	{
		System.out.println("Error processing File");
		}
	System.out.println("Files have been created.");
	}
}