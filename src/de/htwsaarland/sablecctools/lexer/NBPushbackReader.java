package de.htwsaarland.sablecctools.lexer;

import java.io.IOException;
import java.io.PushbackReader;
import java.io.StringReader;
import org.netbeans.spi.lexer.LexerInput;

/**
 * Acts like a PushbackReader to wrap what the lexer of Nebeans IDE
 * gives the generated Lexer. // TODO: need a better comment
 * 
 * @author phucluoi aka lazyboy
 * @version 07. July 2012 
 */
public class NBPushbackReader extends PushbackReader {

	private LexerInput input;
	private char[] buf;
	private int pos;
	
	public NBPushbackReader(LexerInput input, int size) {
		super(new StringReader(""));
		if(size < 0){
			throw new IllegalArgumentException("size <= 0");
		}
		this.buf = new char[size];
		this.pos = size;
		this.input = input;
	}

	@Override
	public void close() {
		//throw new UnsupportedOperationException("Not yet implemented");
	}

	@Override
	public void mark(int readAheadLimit) {
		throw new UnsupportedOperationException("Not yet implemented");
	}

	@Override
	public boolean markSupported() {
		throw new UnsupportedOperationException("Not yet implemented");
	}

	@Override
	public int read() throws IOException
	{
		synchronized (lock) {
			if (pos < buf.length)
			{	
				return buf[pos++];
			}
			else
			{
				return input.read();
			}
		}
	}

	@Override
	public int read(char[] cbuf, int off, int len) {
		throw new UnsupportedOperationException("Not yet implemented");
	}

	@Override
	public boolean ready() {
		throw new UnsupportedOperationException("Not yet implemented");
	}

	@Override
	public void reset() {
		throw new UnsupportedOperationException("Not yet implemented");
	}

	@Override
	public long skip(long n) {
		throw new UnsupportedOperationException("Not yet implemented");
	}

	@Override
	public void unread(char[] cbuf) {
		throw new UnsupportedOperationException("Not yet implemented");
	}

	@Override
	public void unread(char[] cbuf, int off, int len) {
		throw new UnsupportedOperationException("Not yet implemented");
	}

	@Override
	public void unread(int c) throws IOException {
		synchronized (lock) {
			if (pos == 0)
			{
				throw new IOException("Pushback buffer overflow");
			}
			buf[--pos] = (char) c;
		}
	}
}
