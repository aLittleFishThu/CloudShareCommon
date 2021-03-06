package common;

/**
 * 标记权限
 * @author yzj
 * 
 */
public enum Authorization {
	
	open("open"), self("self"),toFriend("toFriend");

    private String status;
    /**
     * 私有构造方法
     * @param 开放权限
     */
    private Authorization(String status){
      this.status=status;
    }
    
 
    public String getStatus() {
      return status;
    }
 
    public void setStatus(String status) {
      this.status = status;
    }
}
