package core_java.clone.deep;

public class Classes implements Cloneable{

	private String className;
	private int classNo;

	public Classes() {

	}

	public Classes(String className, int classNo) {
		this.className = className;
		this.classNo = classNo;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String s = "Class信息 => Class Name: " + className + "; Class No.: " + classNo;
		return s;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Classes cls = (Classes) super.clone();
		return cls;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public int getClassNo() {
		return classNo;
	}

	public void setClassNo(int classNo) {
		this.classNo = classNo;
	}

}
