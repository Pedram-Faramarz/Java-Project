import java.util.HashMap;


public class IDandPassword {
    HashMap<String, String> logininfo = new HashMap<String, String>();

    IDandPassword(){
        logininfo.put("Pedram", "12345");
        logininfo.put("Jan", "12345");
        logininfo.put("Bob", "12345");
    }

    protected HashMap getlogininfo() {
        return logininfo;
    }
    

}
