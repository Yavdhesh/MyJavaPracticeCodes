import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class RecursiveFunctionToCreateDirectoryStru {
	
	public static void rfunction(String sourcePath, String destinationPath, String currentPath){
		File file=new File(currentPath);
		FileInputStream fi=null;
		FileOutputStream fo=null;
		
		if(file.isDirectory()){
		String[] fileFolderNamesArray=file.list();
		File folderDes=new File(destinationPath);
		if(!folderDes.exists()){
			folderDes.mkdirs();
		}
			
		for (String fileFolderName : fileFolderNamesArray) {
			rfunction(sourcePath, destinationPath+"/"+fileFolderName, currentPath+"/"+fileFolderName);
		}
		}else{
			try {
				
				fi=new FileInputStream(file);
				fo=new FileOutputStream(destinationPath);
				byte[] buffer=new byte[1024];
				int ind=0;
				while((ind=fi.read(buffer))>0){
				fo.write(buffer, 0, ind);	
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally{
				if(null!=fi){
					try {
						fi.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				if(null!=fo){
					try {
						fo.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//rfunction("D:/MyDirectory", "D:/MyDirectoryNew", "D:/MyDirectory");
		
		Stack<Integer> a= new Stack<>();
		Scanner in = new Scanner(System.in);
		System.out.println("enter Integer values");
		
		int sizeOfStack=	in.nextInt();
		
		
		
	}

}
