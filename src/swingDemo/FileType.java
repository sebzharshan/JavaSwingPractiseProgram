package swingDemo;

import java.io.File;

import javax.swing.filechooser.FileFilter;

public class FileType extends FileFilter {
	
	private String description;
	private String extension;

	public FileType(String description, String extension) {
		this.description = description;
		this.extension = extension;
	}

	@Override
	public boolean accept(File f) {
		
		if(f.isDirectory()) {
			return true;
		}
		else {
			return f.getName().endsWith(extension);
		}
		
		
	}

	@Override
	public String getDescription() {
		return description + String.format("    (*%s)", extension);
	}
}
