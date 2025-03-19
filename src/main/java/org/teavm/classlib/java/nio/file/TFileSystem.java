package org.teavm.classlib.java.nio.file;

import java.nio.file.Paths;

public class TFileSystem implements AutoCloseable {
	public TPath getPath(String first, String... more) {
		return TPaths.get(first, more);
	}
	
	@Override
	public void close() throws Exception {
	
	}
}
