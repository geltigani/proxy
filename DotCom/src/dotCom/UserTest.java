package dotCom;
//setting the proxy to get the object
public class UserTest {
	
	public static void main (String[] args) 
    { 
      WWW www = new ProxyWWW(); 
        try
        { 
            www.connectTo("google.com"); 
            www.connectTo("virusite.com"); 
        } 
        catch (Exception e) 
        { 
            System.out.println(e.getMessage()); 
        } 
    } 

}
