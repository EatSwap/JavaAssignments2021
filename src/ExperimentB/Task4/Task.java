package ExperimentB.Task4;

import java.io.File;
import java.io.IOException;

/**
 * Author: Lam Haoyin
 * GPG: C00E4E4FCC31CDF3
 * Date: 15:08 12/12/21
 * Project: JavaAssignments2021
 */

public class Task {
	public static void main(String[] args) {
		if (args.length != 1) {
			System.out.println("Usage: java Task <path>");
			return;
		}
		dfs(args[0]);
	}

	private static void dfs(String path) {
		var file = new File(path);
		if (!file.exists() || !file.isDirectory()) {
			System.out.println("File does not exist or is not a directory");
			return;
		}
		var filesInDir = file.listFiles();
		if (filesInDir == null)
			return;
		for (var i : filesInDir)
			if (i.isFile() && i.getName().endsWith(".txt")) {
				// Read file content
				StringBuilder content = new StringBuilder();
				try (var reader = new java.io.BufferedReader(new java.io.FileReader(i))) {
					String line;
					while ((line = reader.readLine()) != null)
						content.append(line);
				} catch (IOException e) {
					System.out.println("Error reading file");
				}

				// Write to D:\tmp
				try (var writer = new java.io.BufferedWriter(new java.io.FileWriter("D:\\tmp\\" + i.getName()))) {
					writer.write(content.toString());
				} catch (IOException e) {
					System.out.println("Error writing file");
				}
			} else if (i.isDirectory())
				dfs(i.getAbsolutePath());
	}
}
