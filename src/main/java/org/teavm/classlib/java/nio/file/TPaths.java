package org.teavm.classlib.java.nio.file;

import java.util.ArrayList;
import java.util.List;

public class TPaths {
	public static TPath get(String first, String... more) {
		List<String> foo = new ArrayList<>(more.length + 1);
		foo.add(first);
		foo.addAll(List.of(more));
		return new TPath(foo);
	}
}
