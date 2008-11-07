package cn.livedoor.security.sysguard;


public class Utils {
	public static boolean isNotNullString(String str){
		if(str != null && !str.equals("")){
			return true;
		}
		return false;
	}

	public static boolean isNotNullArray(Object[] array) {
		if(array!=null&array.length>0){
			return true;
		}
		return false;
	}
}
