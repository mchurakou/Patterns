package facade;

public class HomeTheaterFacade {
	private Display display;
	private Sound sound;
	public HomeTheaterFacade(Display display, Sound sound ){
		this.display = display;
		this.sound = sound;
	}
	
	public void on(){
		display.on();
		sound.on();
	}
	
	public void off(){
		display.off();
		sound.off();
	}
	
}
