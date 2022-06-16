package sec01.exam06_2;

public class Button {
	OnClickListener listener;
	
	void setOnClickListener(OnClickListener Listener) {
		this.listener = Listener;
	}
	void touch() {
		listener.onClick();
	}
	static interface OnClickListener{
		void onClick();
	}

}
