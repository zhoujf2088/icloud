package com.cloud.cases.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;

import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

public class FileOperateUtil {
	public  String FILEDIR = "D:/Roaming/pic";
	public  String newFileName = null;

	/**
	 * 上传
	 * @param request
	 * @throws IOException
	 */
	public void upload(HttpServletRequest request) throws IOException {
		MultipartHttpServletRequest mRequest = (MultipartHttpServletRequest) request;
		Map<String, MultipartFile> fileMap = mRequest.getFileMap();
		File file = new File(FILEDIR);
		if (!file.exists()) {
			file.mkdirs();
		}
		Iterator<Map.Entry<String, MultipartFile>> it = fileMap.entrySet()
				.iterator();
		while (it.hasNext()) {
			Map.Entry<String, MultipartFile> entry = it.next();
			MultipartFile mFile = entry.getValue();
			if (mFile.getSize() != 0 && !"".equals(mFile.getName())) {
				String filename=mFile.getOriginalFilename();
				this.newFileName=UUID.randomUUID()+ filename.substring(filename.lastIndexOf("."));
				String fileupdatePath=request.getServletContext().getRealPath("/") + "fileuploads\\"+newFileName;
				write(mFile.getInputStream(), new FileOutputStream(fileupdatePath));
				write(mFile.getInputStream(), new FileOutputStream("C:/Program Files (x86)/apache-tomcat-8.0.20/webapps/SpaceManager/fileuploads/"+newFileName));
			}
		}
	}

	private  String initFilePath(String name) {
		this.newFileName=UUID.randomUUID()+ name.substring(name.lastIndexOf("."));
		return FILEDIR + "/" +newFileName;
	}	

	public  void download(String downloadfFileName,
			ServletOutputStream out) {
		try {
			FileInputStream in = new FileInputStream(new File(FILEDIR + "/"
					+ downloadfFileName));
			write(in, out);
		} catch (FileNotFoundException e) {
			try {
				FileInputStream in = new FileInputStream(new File(FILEDIR
						+ "/"
						+ new String(downloadfFileName.getBytes("iso-8859-1"),
								"utf-8")));
				write(in, out);
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 写入数据
	 * 
	 * @param in
	 * @param out
	 * @throws IOException
	 */
	public  void write(InputStream in, OutputStream out)
			throws IOException {
		try {
			byte[] buffer = new byte[1024];
			int bytesRead = -1;
			while ((bytesRead = in.read(buffer)) != -1) {
				out.write(buffer, 0, bytesRead);
			}
			out.flush();
		} finally {
			try {
				in.close();
			} catch (IOException ex) {
			}
			try {
				out.close();
			} catch (IOException ex) {
			}
		}
	}
}
