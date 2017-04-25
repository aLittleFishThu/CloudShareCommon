package common;

import java.util.HashSet;

/**
 * �����ļ�Ŀ¼���
 * @author yzj
 * �����ļ���Ϣ���ɵ�HashSet�����ؽ��
 */
public class FileDirectoryResult {
	private HashSet<CloudFile> fileDirectory;
	private FileResult result;
	
	/**
	 * �޲ι��췽��
	 */
	public FileDirectoryResult(){
		fileDirectory=new HashSet<CloudFile>();
		result=FileResult.OK;
	}
	/**
	 * ���������췽��
	 * @param fileDirectory
	 * @param result
	 */
	public FileDirectoryResult(HashSet<CloudFile> fileDirectory,FileResult result){
		this.fileDirectory=fileDirectory;
		this.result=result;
	}
	
	public HashSet<CloudFile> getFileDirectory() {
		return fileDirectory;
	}
	public void setFileDirectory(HashSet<CloudFile> fileDirectory) {
		this.fileDirectory = fileDirectory;
	}
	public FileResult getResult() {
		return result;
	}
	public void setResult(FileResult result) {
		this.result = result;
	}
}