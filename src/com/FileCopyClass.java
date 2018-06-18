package com;
import com.FileCopyClass;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

public class FileCopyClass {
	
	public static void main(String args[]) throws IOException {
		
		File source=new File("D:/MyDirectory");	
		File destination=new File("D:/MyDirectoryNew");
		FileChannel inputChannel=null;
		FileChannel outputChannel=null;
		
	System.out.println(destination.exists());
	if(!destination.exists()){
		destination.mkdir();
	}
	
	
	int sizeOfFilesArray =source.list().length;
	String[] array=source.list();
	File f=null;
	for (int i = 0; i < sizeOfFilesArray; i++) {
		 f=new File("D:/MyDirectory/"+array[i]);
	if(f.isDirectory()){
		String[] arraySub=f.list();
		int length=arraySub.length;
		int ind=0;
		while(ind<length){
			File fNew=new File("D:/MyDirectoryNew/"+array[i]);
			if(!fNew.exists()){
				fNew.mkdir();
			}	
			
			ind++;
		}
		/*File fNew=new File("D:/MyDirectoryNew/"+array[i]);
		if(!fNew.exists()){
			fNew.mkdirs();
		}*/
		/*for (int j = 0; j < array.length; j++) {
			FileInputStream fi=new FileInputStream("D:/MyDirectory/"+array[i]+"/"+arraySub[j]);
			
			
			FileOutputStream fo=new FileOutputStream("D:/MyDirectoryNew/"+array[i]+"/"+arraySub[j]);
			byte[] barray=new byte[1024];
			int len=0;
			while((len=fi.read(barray))>0){
				fo.write(barray, 0, len);
			}
		}*/
	}else{
		FileInputStream fi=new FileInputStream("D:/MyDirectory/"+array[i]);
		FileOutputStream fo=new FileOutputStream("D:/MyDirectoryNew/"+array[i]);
		byte[] barray=new byte[1024];
		int len=0;
		while((len=fi.read(barray))>0){
			fo.write(barray, 0, barray.length);
		}
	}
		
	}
	
	
	
	
	}

}
