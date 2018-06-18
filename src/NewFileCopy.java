import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class NewFileCopy {
	
	public static void main (String args[]) {
		
		File input=new File("D:/MyDirectory/directoryOne");
		
		File output=new File("D:/MyDirectoryNew/directoryOne");
		if(!output.exists()){
			output.mkdir();
		}
		
		String [] list=input.list();
		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
		}
		for (int i = 0; i < list.length; i++) {
			FileInputStream fileI=null;
			try {
				fileI = new FileInputStream(new File(input, list[i]));
			} catch (FileNotFoundException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
			byte[] byteArray=new byte[1024];
			FileOutputStream fileO=null;
			try {
				fileO = new FileOutputStream(new File(output, list[i]));
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			int ind=0;
			try {
				while((ind=fileI.read(byteArray))>0){
					fileO.write(byteArray, 0, ind);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally{
				if(fileI!=null){
					try {
						fileI.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				if(fileO!=null){
					try {
						fileO.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
				
			}
		}
		
		
	}

}
