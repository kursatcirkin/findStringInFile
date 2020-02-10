package fileIndex.patch;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.Reader;

public class Main {

	public static void main(String[] args) {

		File folder = new File("C:\\EDEFTERTEST\\02\\02");
		File[] listOfFiles = folder.listFiles();
		for (File file : listOfFiles) {
			if (file.isFile()) {
				String fileName = file.getName();
				try {
					
					Reader fileReader = new FileReader(file);
					BufferedReader bufReader = new BufferedReader(fileReader);
					StringBuilder sb = new StringBuilder();
					String line = bufReader.readLine();
					while (line != null) {
						sb.append(line).append("\n");
						line = bufReader.readLine();
					}
					if (sb.toString().contains("2241897")) {
						System.out.println(fileName);
						break;
					}

					bufReader.close();

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}

	}

}
