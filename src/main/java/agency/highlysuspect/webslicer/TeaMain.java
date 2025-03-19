package agency.highlysuspect.webslicer;

import com.mojang.slicer.Slicer;
import org.teavm.jso.JSExport;
import org.teavm.jso.JSTopLevel;
import org.teavm.jso.dom.html.HTMLDocument;

import java.nio.file.Paths;
import java.util.List;

public class TeaMain {
	public static void main(String[] args) throws Exception {
		System.out.println("Hello from TeaVM");
		
		HTMLDocument doc = HTMLDocument.current();
		doc.getElementById("loading").delete();
		
		new Slicer(Paths.get(""), Paths.get(""), Paths.get("")).process(List.of());
	}
	
	@JSTopLevel
	@JSExport
	public static void doIt() {
		System.out.println("go go go!");
	}
}
