package sec04.exam01_nestedinterface;

public class Button {
	OnClickListener listener;
	
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	void touch() {
		listener.onClick();
	}
	
	
	interface OnClickListener {    //위치는 상관 없다. 
		void onClick(); 
		
	}
}
