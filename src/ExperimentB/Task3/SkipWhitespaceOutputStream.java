package ExperimentB.Task3;

import java.io.IOException;
import java.io.OutputStream;

/**
 * Author: Lam Haoyin
 * GPG: C00E4E4FCC31CDF3
 * Date: 22:45 11/12/21
 * Project: JavaAssignments2021
 */

public class SkipWhitespaceOutputStream extends OutputStream {
	protected OutputStream out;

	public SkipWhitespaceOutputStream(OutputStream out) {
		this.out = out;
	}

	@Override
	public void write(int b) throws IOException {
		if (!Character.isWhitespace(b))
			out.write(b);
	}

	@Override
	public void write(byte[] b) throws IOException {
		write(b, 0, b.length);
	}

	@Override
	public void write(byte[] b, int off, int len) throws IOException {
		for (int i = 0; i < len; i++) {
			write(b[off + i]);
		}
	}

	@Override
	public void close() throws IOException {
		out.close();
	}

	@Override
	public void flush() throws IOException {
		out.flush();
	}
}
