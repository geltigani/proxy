package dotCom;
 
import java.util.*; 

public class ProxyWWW implements WWW {
	
	private WWW www = new RealWWW();
	private static List<String> restrictedWWWs;
	
	static {
		restrictedWWWs = new ArrayList<String>();
		restrictedWWWs.add("virusite.com");
		restrictedWWWs.add("malwaresite.com");
	}

	@Override
	public void connectTo(String serverhost) throws Exception {
		
		if(restrictedWWWs.contains(serverhost.toLowerCase())) {
			throw new Exception ("Not Allowed!");
		}
		www.connectTo(serverhost);
		}

}
