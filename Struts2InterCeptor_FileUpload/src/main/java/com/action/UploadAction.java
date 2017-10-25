package com.action;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Paths;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class UploadAction extends ActionSupport {
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;
	private File source;
	private String sourceFileName;

	public String upload() throws IOException, URISyntaxException {
		/*URL resource = UploadAction.class.getResource("/userimage");
		File file = Paths.get(resource.toURI()).toFile();*/
		String filePath = ServletActionContext.getServletContext().getRealPath("/").concat("userimages");
		System.out.println(filePath);
		File desFile = new File(filePath, sourceFileName);
		FileUtils.copyFile(source, desFile);
		return SUCCESS;
	}

	public File getSource() {
		return source;
	}

	public void setSource(File source) {
		this.source = source;
	}

	public String getSourceFileName() {
		return sourceFileName;
	}

	public void setSourceFileName(String sourceFileName) {
		this.sourceFileName = sourceFileName;
	}

}
