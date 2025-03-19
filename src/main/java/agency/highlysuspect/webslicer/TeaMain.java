package agency.highlysuspect.webslicer;

import org.teavm.jso.JSExport;
import org.teavm.jso.JSTopLevel;
import org.teavm.jso.dom.html.HTMLDocument;

public class TeaMain {
	public static void main(String[] args) throws Exception {
		System.out.println("Hello from TeaVM");
		
		HTMLDocument doc = HTMLDocument.current();
		doc.getElementById("loading").delete();
	}
	
	@JSTopLevel
	@JSExport
	public static void doIt() {
		System.out.println("go go go!");
	}
}
