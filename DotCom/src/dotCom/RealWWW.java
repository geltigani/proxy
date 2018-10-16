package dotCom;
//concrete using interface
public class RealWWW implements WWW {

	@Override
	public void connectTo(String serverhost) {
		
		System.out.println("Connected to "+ serverhost);
		
	}
	

}
