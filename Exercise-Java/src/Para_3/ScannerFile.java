package Para_3;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.*;

public class ScannerFile {
	public static void main(String[] args) throws IOException{
		//�ļ���ȡ
		Scanner in = new Scanner(Paths.get("G:\\myGit\\Core-Java\\Exercise-Java\\src\\Para_3\\Scanner.txt"));
		while(in.hasNextLine()) {
			String str = in.nextLine();
			if(str.equals("9999")) {
				break;
			};
			System.out.println(str);
		}
		in.close();
		//�ļ�д��
		PrintWriter out = new PrintWriter("G:\\myGit\\Core-Java\\Exercise-Java\\src\\Para_3\\Scanner.txt");
//		System.out.println("Please Input your what insert��End with End!");
//		Scanner ins = new Scanner(System.in);
//		String insert = ins.next();
//		while(insert != "End!") {
//			
//		}
//		out.println();
		
//		��������д���Ǹ���ԭ�ļ����ݵ�
//		out.println("SSSSSSS");
//		out.println("End");
//		out.close();
	}
}
