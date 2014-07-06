import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class main {

	String recipi_title ;
	String file_name;

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		main m = new main();
		Scanner scan = new Scanner(System.in);

		m.newFile(scan);
		m.importRecipi(scan);
		m.FileImportRecipi();
		
		/*


		 */
	}
	void newFile(Scanner scan) throws IOException{
		System.out.print("新しくレシピ名を入力するファイルを作成します\nファイル名を入力してください >");
		file_name = scan.next();

		File newfile = new File(file_name+".txt");
		newfile.createNewFile();
	}

	void importRecipi(Scanner scan){
		System.out.print("レシピ名を入力してください >");
		recipi_title = scan.next();
		System.out.println(recipi_title);
	}
	void FileImportRecipi() throws IOException{
		FileWriter filewriter = new FileWriter(file_name+".txt");

		filewriter.write(recipi_title);
		filewriter.close();
	}

}
