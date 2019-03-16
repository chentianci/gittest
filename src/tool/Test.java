package tool;

import java.io.File;

public class Test {
	
	static String pathName="F:\\大江大河";
	static String newName="大江大河";
	static boolean isSubtitles=false;//true:代表有字幕
	static int count =0;
	static int episode=0;
	
	public static void main(String[] args) {
		update();
	}
	
	public static void update() {
		File parentFile=new File(pathName);
		File[] files=parentFile.listFiles();
		for (File file : files) {
			if(!file.isHidden()) {
				String fileName=file.getName();
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				System.out.println("旧名字："+fileName);
				String prefix="";
				if ("".equals(newName)) {
					prefix=fileName.substring(fileName.lastIndexOf("集")+1);
				}else {
					prefix=fileName.substring(fileName.lastIndexOf("."));
				}	
				String newName2=newName+"第"+getNum()+"集"+prefix;
				file.renameTo(new File(pathName+File.separator+newName2));
				System.out.println("新名字："+newName2);
			}
		}
		System.out.println("共"+episode+"集，"+count+"个文件");
	}
	
	public static String getNum() {
		count++;
		if(isSubtitles) {
			if(count%2==1) {
				episode++;
			}
		}else {
			episode++;
		}
		return episode<10?"0"+episode:episode+"";
	}
}
