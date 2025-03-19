package org.teavm.classlib.java.nio.file;

import java.net.URI;
import java.util.List;

public class TPath {
	public TPath(List<String> pathComponents) {
		this.pathComponents = pathComponents;
	}
	
	public TPath(String oneComponent) {
		this.pathComponents = List.of(oneComponent);
	}
	
	private final List<String> pathComponents;
	
	public TPath getFileName() {
		return new TPath(pathComponents.get(pathComponents.size() - 1 ));
	}
	
	public URI toUri() {
		throw new UnsupportedOperationException("toUri");
	}
}
