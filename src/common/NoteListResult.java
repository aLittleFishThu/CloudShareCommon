package common;

import java.util.ArrayList;

/**
 * 下载备注结果
 * @author yzj
 * 包括备注构成的ArrayList和下载结果
 */



public class NoteListResult {
    public enum NoteListStatus {
        OK("OK"),unAuthorized("unAuthorized"),wrong("wrong"),
        unknownError("unknownError");
        
        private String status;
        /**
         * 私有构造方法
         * @param 备注操作状态
         */
        private NoteListStatus(String status){
          this.status=status;
        }
        /**
         * 获取字符串
         */
        public String getStatus() {
          return status;
        }
    }
	private ArrayList<Note> noteList;
	private NoteListStatus result;
	
	/**
	 * 无参构造方法，默认获取失败
	 */
	public NoteListResult(){
		setNoteList(new ArrayList<Note>());
		result=NoteListStatus.wrong;
	}
	/**
	 * 一参数构造方法
	 * @param result
	 */
	public NoteListResult(NoteListStatus result){
		setNoteList(new ArrayList<Note>());
		this.result=result;
	}
	/**
	 * 两参数构造方法
	 * @param noteList
	 * @param result
	 */
	public NoteListResult(ArrayList<Note> noteList,NoteListStatus result){
		this.setNoteList(noteList);
		this.result=result;
	}
		
	public NoteListStatus getResult() {
		return result;
	}
	public void setResult(NoteListStatus result) {
		this.result = result;
	}
    public ArrayList<Note> getNoteList() {
        return noteList;
    }
    public void setNoteList(ArrayList<Note> noteList) {
        this.noteList = noteList;
    }
}
