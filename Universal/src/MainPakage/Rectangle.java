package MainPakage;

public class Rectangle {
	public int x,y,w,h;
	private int[] pixels;
	
	Rectangle(int x,int y,int w,int h){
		this.x=x;
		this.y=y;
		this.h=h;
		this.w=w;
		
	}
	Rectangle(){
		this(0,0,0,0);
	}
	/*public void generateGraphics(int color) {
		pixels= new int[w*h];
		for(int y=0;y<h;y++)
			for(int x=0;x<w;x++)
				pixels[x+y*w]=color;
		
	}*/
	public void generateGraphics(int borderWidth,int color) {
		pixels= new int[w*h];
		
		for(int i=0;i<pixels.length;i++)
			pixels[i]=Game.del;
		
		for(int y=0;y<borderWidth;y++)
			for(int x=0;x<w;x++)
				pixels[x+y*w]=color;
		for(int y=0;y<h;y++)
			for(int x=0;x<borderWidth;x++)
				pixels[x+y*w]=color;
		for(int y=0;y<h;y++)
			for(int x=w-borderWidth;x<w;x++)
				pixels[x+y*w]=color;
		for(int y=h-borderWidth;y<h;y++)
			for(int x=0;x<w;x++)
				pixels[x+y*w]=color;
		
	}
	public int[] getPixels() {
		if(pixels!= null) {
			return pixels;
		}
		else System.out.println("error");
		return null;
	}
	public void setXY(int x,int y) {
		this.x=x;
		this.y=y;
	}
}