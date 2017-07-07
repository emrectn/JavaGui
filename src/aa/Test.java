package aa;

import java.awt.EventQueue;

public class Test {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JavaGui frame = new JavaGui();
					frame.setVisible(true);
					frame.setResizable(false);
					frame.setLocationRelativeTo(null);
					//fram boyutunu belirliyoruz
					frame.setSize(800,550);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	} 
}
