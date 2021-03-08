package com.day5.session2;

class Door implements AutoCloseable {
	public Door() {
		System.out.println("ctr of door is called...");
	}

	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("close is called for the door...");
	}
	public void doDoorLogic() {
		System.out.println("doLogic of door is called...");
		if(1==1) {
			throw new NullPointerException();
		}
	}
}
class Window implements AutoCloseable {
	public Window() {
		System.out.println("ctr of Window is called...");
	}

	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("close is called for the Window...");
	}
	public void doWindowLogic() {
		System.out.println("doLogic of window is called...");
	}
}
public class HowArmWorks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Door door = new Door();Window win=new Window()) {
			door.doDoorLogic();
			win.doWindowLogic();
	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getCause());
		}
	}

}
